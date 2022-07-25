<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
</head>
<body>
	<div id="table root">
		<table>
			<thead>
				<tr>
					<th>Employee Id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>email</th>
					<th>Hire Date</th>
					<th>job Id</th>
					<th>Salary</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="employee" items="${allemp}">
			   <tr>
			   	  <td>${employee.id}</td>
			   	  <td>${employee.first_name}</td>
			   	  <td>${employee.last_name}</td>
			   	  <td>${employee.email}</td>
			   	  <td>${employee.hire_date}</td>
			   	  <td>${employee.job_id}</td>
			   	  <td>${employee.salary}</td>
			   </tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>