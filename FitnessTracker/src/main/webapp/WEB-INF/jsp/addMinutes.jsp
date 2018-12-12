<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add minutes page</title>
</head>
<body>
	<h1>Add minutes exercised</h1>
	<form:form modelAttribute="exercise">
		<tr>
			<td><spring:message code="goal.text" /></td>
			<td><form:input path="minutes" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="enter excersise">
			</td>
		</tr>
	</form:form>
</body>
</html>