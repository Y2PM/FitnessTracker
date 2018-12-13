<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add goal</title>
</head>
<body>

	<form:form modelAttribute="goal"> <!-- "commandName DEPRECATED: Use "modelAttribute" instead." -->

		<table>
			<tr>
				<td>Enter minutes:</td>
				<td><form:input path="minutes" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Enter goal minutes"></td>
			</tr>
		</table>


	</form:form>

	<h1>Our goal for the day is: ${goal.minutes}</h1>

</body>
</html>