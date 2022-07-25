<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add Doctor details</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="adddoctor" method="post" modelAttribute="adddoc">
				<div>
					<label for="id">Doctor id</label>
					<div>
						<form:input path="id" />
					</div>
				</div>
				<div>
					<label for="doc_name">Doctor Name</label>
					<div>
						<form:input path="doc_name" />
					</div>
				</div>
				<div>
					<label for="dob">Date of Birth</label>
					<div>
						<form:input path="dob" />
					</div>
				</div>
				<div>
					<label for="speciality">Speciality</label>
					<div>
						<form:input path="speciality" />
					</div>
				</div>
				<div>
					<label for="doc_city">City</label>
					<div>
						<form:input path="doc_city" />
					</div>
				</div>
				<div>
					<label for="phone">Phone Number</label>
					<div>
						<form:input path="phone" />
					</div>
				</div>
				<div>
					<label for="standard_fees">Doctor Fees</label>
					<div>
						<form:input path="standard_fees" />
					</div>
				</div>
				<div>
					<form:button>Add New</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>