<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hi User, Your Account ${account.name} has been added succesfully.
	Please verify your account Details Account Name : ${account.name}
	<br>
	<br> DOB : ${account.dob}
	<br>
	<br> Account Address : ${account.address}
	<br>
	<br> Account Email : ${account.emailId }
	<br>
	<br> Account Type : ${account.accountType}

</body>
</html>