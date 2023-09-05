<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>

	
	<h1>Skills INformation</h1>
	
	<font color="green"><c:out value="${message}"></c:out></font>	
		<a href="/springApp">HOME</a><br>	<br>
		
	<table border="1">
		<thead>
			<th>Skill Id</th>
			<th>Skill Name</th>
			<th>Action </th>
		</thead>
		
		<c:forEach items="${skillList}" var="cr"> 
		  <tr>
		    <td>${cr.skillId}</td>
		    <td>${cr.skillName}</td>
		    <td>
		    <a href="/springApp/skills/edit/<c:out value="${cr.skillId}"></c:out>">EDIT</a>
		    <a href="/springApp/skills/delete/<c:out value="${cr.skillId}"></c:out>">DELETE</a>
		    
		    
		    </td>
		  </tr>
		</c:forEach>
	</table>   
</body>
</html>