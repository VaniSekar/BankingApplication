<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vani Bank</title>
<style>
.error {
color: red;
}
</style>
</head>
<body>
	<form:form action="loginHome" modelAttribute="user">
		<table>
			<tr align="justify">
				<td align="justify">Banking System</td>
			</tr>
			
			<tr align="justify">
				<td align="justify"><form:input path="userId" /></td>
			</tr>
			<tr align="justify">
				<td align="justify"><form:input type="password" path="userPassword" /></td>
			</tr>
			
				<div class="error"> ${errorMessage}</div>
			
			<tr align="justify">
				<td align="justify"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>