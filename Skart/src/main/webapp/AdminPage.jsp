<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>

header{
margin :0;
padding :0;
display :inline;
background-color: black;
width :100px;

}
header li {
margin: 50px;
float: left;
}
body {
	 background-image:url( https://images.unsplash.com/photo-1554034483-04fda0d3507b?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80);
}
#topbar{
background-color :36698D;
height :30px;
width : 100%;
}



</style>
<meta charset="UTF-8">
<title>AdminHome</title>
</head>
<body>

<h1><center>Welcome Skart Admin</center></h1>

<header>
<div id="topbar"></div> 
<ul>
<li><b><a href ="#">Add Products</a></b></li>
<li><b><a href ="#">View Orders</a></b></li>
<li><b><a href ="http://localhost:8080/Skart/Welcome.jsp">View Customers</a></b></li>
</ul>
</header>




</body>
</html>