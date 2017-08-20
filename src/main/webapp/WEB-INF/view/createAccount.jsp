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
	Create Bank Account
	<form:form action="/BankingSystem/create/addAccount" modelAttribute="account">
 Name :<form:input path="user.name" />
		<br>
		<br>
Date Of Birth : <form:input path="user.dob" />
		<br>
		<br>
Address : <form:input path="user.address" />
		<br>
		<br>
Email Id : <form:input path="user.emailId" />
		<br>
		<br>
Account Type: <form:select path="accountType">
			<form:options items="${account.typeOptions}" />
		</form:select>
		<br>
		<br>
		<input type="submit" value="Create Account" />
	</form:form>
</body>
</html>