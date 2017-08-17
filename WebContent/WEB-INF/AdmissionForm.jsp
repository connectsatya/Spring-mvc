<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission Form</title>
</head>
<body>
<h1>${headerMsg}</h1>
<h3>Student Admission Form For Engineering Courses</h3>
<form:errors path="student1.*"/>
<form action="/FirstSpringMVCProject/submitadmissionform.html" method="post">
<table>
	<tr>
		<td>Student Name</td>
		<td><input type="text" name="studentName"></td>
	</tr>
	<tr>
		<td>Student Hobby</td>
		<td><input type="text" name="studentHobby"></td>
	</tr>
	<tr>
		<td>Student Mobile Number</td>
		<td><input type="text" name="studentMobile"></td>
	</tr>
	<tr>
		<td>Student DOB</td>
		<td><input type="text" name="studentDOB"></td>
	</tr>
	<tr>
		<td>Student Skill Set</td>
		<td><select name="studentskills">
			<option value="Java Core">Java Core</option>
			<option value="Spring Core">Spring Core</option>
			<option value="Spring MVC">Spring MVC</option>
		</select>
		</td>
	</tr>
</table>
<table>
	<tr>
		<td>Country<input type="text" name="address.country"></td>
		<td>City<input type="text" name="address.city"></td>
		<td>Street<input type="text" name="address.street"></td>
		<td>Pincode<input type="text" name="address.pincode"></td>
	</tr>
</table>
<input type="submit" value="Click ME !">
</form>
</body>
</html>