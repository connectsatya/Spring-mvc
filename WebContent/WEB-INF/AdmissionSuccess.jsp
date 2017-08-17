<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>${headerMsgg}</h1>
	<h3>Your Application is under processing</h3>
	
	<table border="1">
		<tr>
			<th>Student Name</th>
			<th>Student Hobby</th>
			<th>Student Mobile Number</th>
			<th>Student DOB</th>
			<th>Student Skills</th>
		</tr>
		<tr>
			<td>${student1.studentName}</td>
			<td>${student1.studentHobby}</td>
			<td>${student1.studentMobile}</td>
			<td>${student1.studentDOB}</td>
			<td><c:forEach begin="0" end="${fn:length(student1.studentskills) - 1}" var="index">
   
      <c:out value="${student1.studentskills[index]}"/>
      <c:out value="${','}"/>
   
</c:forEach></td>
		</tr>
	</table>
	<table border="1">
	<tr>
			<th>Country</th>
			<th>City</th>
			<th>Street</th>
			<th>Pincode</th>
	</tr>
	<tr>
			<td>${student1.address.country}</td>
			<td>${student1.address.city}</td>
			<td>${student1.address.street}</td>
			<td>${student1.address.pincode}</td>
	</tr>
	</table>
</body>
</html>