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
	<form action="addUser" method="Post">
	
			<label for="userName">User Name</label>
			<input name="userName"   type="text" />
			<br>
			
			<label for="customerPassword">Password</label>
			<input name="password"  type="password" />
			<br>
			<label for="confirmPassword">Confirm Password</label>
			<input name="confirm_password"  type="password" />
			<br>
			<input name="authority.id" value = "1" type="hidden" />
			<br>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<input type="submit" value="Register" />
	</form>
</body>
</html>