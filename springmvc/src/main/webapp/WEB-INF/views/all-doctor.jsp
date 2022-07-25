<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Doctor Details</title>
</head>
<body>
	<div id="table root">
		<table>
			<thead>
				<tr>
					<th>Doctor Id</th>
					<th>Name</th>
					<th>Date of birth</th>
					<th>Speciality</th>
					<th>city</th>
					<th>Phone</th>
					<th>doctor fees</th>
					
				</tr>
			</thead>
			<tbody>
			<c:forEach var="doctor" items="${alldoc}">
			   <tr>
			   	  <td>${doctor.id}</td>
			   	  <td>${doctor.doc_name}</td>
			   	  <td>${doctor.dob}</td>
			   	  <td>${doctor.speciality}</td>
			   	  <td>${doctor.doc_city}</td>
			   	  <td>${doctor.phone}</td>
			   	  <td>${doctor.standard_fees}</td>
			   </tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>