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

	
	<h1>Skill CRUD Operations</h1>
	
	<font color="green"><c:out value="${message}"></c:out></font>	
		<a href="/springApp">HOME</a><br>	<br>
		
	 <form:form method = "POST" action = "/springApp/skills/save/" modelAttribute="skbean">
         <table>
            <tr>
               <td><form:label path ="skillId">Skill Id : </form:label></td>
               <td><form:input path ="skillId" /></td>
            </tr>
            
           <tr>
               <td><form:label path ="skillName">Skill Name :</form:label></td>
               <td><form:input path ="skillName" /></td>
            </tr>
            
            
             <tr>
               
               <td><input type="submit"> </input></td>
               <td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
            </tr>
			
      </table>
      </form:form>    
</body>
</html>