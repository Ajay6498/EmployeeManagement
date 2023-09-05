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

	
	<h1>Add New Employee</h1>
	
	<font color="green"><c:out value="${message}"></c:out></font>	
		<a href="/springApp">HOME</a><br>	<br>
		
	 <form:form method = "POST" action = "/springApp/employee/save/" modelAttribute="empBean">
         <table>
            <tr>
               <td><form:label path = "empId">Employee Id : </form:label></td>
               <td><form:input path = "empId" readonly="true"/></td>
            </tr>
            
           <tr>
               <td><form:label path = "empName">Employee Name :</form:label></td>
               <td><form:input path = "empName" /></td>
            </tr>
            
            <tr>
               <td><form:label path = "empAge">Employee Age : </form:label></td>
               <td><form:input path = "empAge" /></td>
            </tr>
            
             <tr>
               <td><form:label path = "empSalary">Employee Salary</form:label></td>
               <td><form:input path = "empSalary" /></td>
            </tr>
            
            <tr>
               <td><form:label path = "empGender">Employee Gender</form:label></td>
               <td>
               			<form:radiobutton path = "empGender" value="Male"/> Male
               			<form:radiobutton path = "empGender" value="Female"/> Female	 
               </td>
            </tr>
            
               
            <tr>
               <td><form:label path = "empSkills">Employee Skills</form:label></td>
               <td>
               			<form:checkbox path="empSkills" value="JAVA"/> Java
               			<form:checkbox path="empSkills" value="SPRING"/> Spring
               			<form:checkbox path="empSkills" value="HIBERNATE"/> Hibernate
               			<form:checkbox path="empSkills" value="REST API"/> WebServices
               			<form:checkbox path="empSkills" value="HTML"/> Html
               			<form:checkbox path="empSkills" value="CSS"/> CSS
               			
               			<c:forEach items="${skilllist}" var="sk"> 
						 		<form:checkbox path="empSkills" value="${sk.skillId}"/> ${sk.skillName}
						</c:forEach>
               			
               			 
               </td>
            </tr>
            
                
            <tr>
               <td><form:label path = "empCity">Employee City</form:label></td>
               <td>
               		<form:select path="empCity">
               				<form:option value="Pune"> Pune </form:option>
               				<form:option value="Mumbai"> Mumbai </form:option>
               				<form:option value="Latur"> Latur </form:option>
               				<form:option value="Solapur"> Solapur </form:option>
               				<form:option value="Abad"> Abad </form:option>
               				<form:option value="Dhule"> Dhule </form:option>
               		</form:select>	
               			 
               </td>
            </tr>
            
            
             <tr>
               <td><form:label path = "empHobbies">Employee Hobbies</form:label></td>
               <td>
               		<form:select path="empHobbies" multiple="true">
               				<form:option value="Cricket"> Cricket </form:option>
               				<form:option value="Carrom"> Carrom </form:option>
               				<form:option value="Chess"> Chess </form:option>
               				<form:option value="Riding"> Riding </form:option>
               				<form:option value="WatchingTV"> WatchingTV </form:option>
               				<form:option value="Cooking"> Cooking </form:option>
               		</form:select>	
               			 
               </td>
            </tr>
            
             <tr>
               
               <td><input type="submit"> </input></td>
               <td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
            </tr>
			
      </table>
      </form:form>    
</body>
</html>