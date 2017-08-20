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
	Display Transaction
	<form:form action="/BankingSystem/display/displayAccount" modelAttribute="accountDisplayDTO">

Account Number :<form:input path="accountNumber" value="${accountDisplayDTO.accountNumber}" />
		<br>
		<br>
From Date :<form:input path="fromDate" value="${accountDisplayDTO.fromDate}" />
		<br>
		<br>
To Date : <form:input path="toDate" value="${accountDisplayDTO.toDate}" />
		<br>
		<br>
		<input type="submit" value="Display Transactions" />
	</form:form>
</body>
</html>