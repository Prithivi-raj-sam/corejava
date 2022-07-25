<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>find doctor by Id</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="getdoc">
				<div>
					<label for="id">Doctor id</label>
					<div>
						<form:input path="id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="doc_name">Doctor Name</label>
					<div>
						<form:input path="doc_name" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="dob">Date of Birth</label>
					<div>
						<form:input path="dob" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="speciality">Speciality</label>
					<div>
						<form:input path="speciality" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="doc_city">City</label>
					<div>
						<form:input path="doc_city" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="phone">Phone Number</label>
					<div>
						<form:input path="phone" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="standard_fees">Doctor Fees</label>
					<div>
						<form:input path="standard_fees" readonly="true"/>
					</div>
				</div>
				
			</form:form>
		</div>
	</div>
</body>
</html>