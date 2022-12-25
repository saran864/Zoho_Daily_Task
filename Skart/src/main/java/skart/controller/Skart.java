package skart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletResponse;
import skart.DAO.UserDAO;
import skart.model.SkartUser;

//import com.google.gson.Gson;

@WebServlet("/Skart")
public class Skart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Skart() {
		super();

	}

	static UserDAO sc = new UserDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
  
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		int a = Integer.parseInt(age);
		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
		String adds = request.getParameter("address");

		SkartUser userRegister = new SkartUser(name, a, uname, pwd, adds);
		sc.register(userRegister);
		request.setAttribute("name", name);
		RequestDispatcher rd = request.getRequestDispatcher("/UserHome.jsp");
		rd.forward(request, response);
		PrintWriter pw = response.getWriter();
	
	
		

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
		SkartUser login = new SkartUser(uname, pwd);

		Connection c;
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Skart", "root", "password");
			PreparedStatement getQuery = c
					.prepareStatement("select Username,RegisterName from Register where Username=? and Password=?");
			getQuery.setString(1, login.getUsername());
			getQuery.setString(2, login.getPassword());
			
			ResultSet rs = getQuery.executeQuery();
			
			
			if (rs.next()) {
				String a=rs.getString(2);
				request.setAttribute("name", a);
				RequestDispatcher rd=request.getRequestDispatcher("/UserHome.jsp");
                rd.forward(request, response);	
			} else {
				  pw.println("<html>");
				  pw.println("<body><h1>Wrong Password !</h1></body>");
				  pw.println("</html>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
