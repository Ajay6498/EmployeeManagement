<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>All Employee</h1>
<br> <br>
	<a href="/springApp">HOME</a><br>	<br>
	
	<table border="1">
		<thead>
			<th>Employee Id</th>
			<th>Employee Name</th>
			<th>Employee Address</th>
			<th>Employee Gender</th>
			<th>Employee Salary</th>
			<th>Employee Birth Date</th>
		</thead>
		
		<c:forEach items="${courseList}" var="cr"> 
		  <tr>
		    <td>${cr.courseId}</td>
		    <td>${cr.courseName}</td>
		    <td>${cr.courseAddress}</td>
		    <td>${cr.courseGender}</td>
		    <td>${cr.courseSalary}</td>
		    <td>${cr.courseBirthdate}</td>
		  </tr>
		</c:forEach>
	</table>

</body>
</html>