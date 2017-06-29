<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vikram.org</title>
<script type="text/javascript"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/user.js"></script> 
</head>
<body>
<h1>Hello World</h1>
 <table>
       <tr><td colspan="2"><div id="error" class="error"></div></td></tr>
        <tr><td>Enter Employee Id : </td><td> <input type="text" id="employeeid"><br/></td></tr>
        <tr><td colspan="2"><input type="button" value="Submit" onclick="doAjaxPost()"><br/></td></tr>
        <tr><td colspan="2"><div id="info" class="success"></div></td></tr>
</table>
</body>
</html>