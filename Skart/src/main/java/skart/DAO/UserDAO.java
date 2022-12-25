package skart.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import skart.model.SkartUser;

public class UserDAO {

	public void register(SkartUser register) {
		try {
             int passid = 0;
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Skart", "root", "password");
			System.out.println("connected Successfuly");
			PreparedStatement getQuery = c.prepareStatement("insert into Register values(?,?,?,?,?,?)");
			getQuery.setInt(1, passid);
			getQuery.setString(2, register.getName());
			getQuery.setInt(3, register.getAge());
			getQuery.setString(4, register.getUsername());
			getQuery.setString(5, register.getPassword());
			getQuery.setString(6, register.getAddress());
			getQuery.executeUpdate();
			getQuery.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("NotConnected");
		}

	}

	public void login(SkartUser login) throws SQLException {

	}

}
