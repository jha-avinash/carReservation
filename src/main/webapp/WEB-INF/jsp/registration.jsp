<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Registration</title>
</head>
<body>
	<h3>Please fill the registration Form</h3>
	<form action="addCustomer" method="Post">
	
			<label for="customerName">Name</label>
			<input name="customerName"   type="text" />
			<br>
			
			<label for="customerAddress">Address</label>
			<input name="address"  type="text" />
			<br>
			<label for="customerPhone">Phone</label>
			<input name="phone"  type="text" />
			<br>
			<label for="customerEmail">Email</label>
			<input name="email"  type="text" />
			<br>
			<input type="submit" value="Register" />
	</form>
</body>
</html>