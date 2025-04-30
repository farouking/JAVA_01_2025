<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page isErrorPage="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Add Book</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container mt-5">
	<div class="d-flex justify-content-between align-items-center mb-4">
		<h1 class="mb-0">Add to Your Book Shelf</h1>
		<a href="/home" class="btn btn-secondary btn-sm">← Back to Shelves</a>
	</div>

	<form:form action="/books" method="post" modelAttribute="book" class="needs-validation">
		
		<div class="mb-3">
			<form:label path="title" cssClass="form-label">Title:</form:label>
			<form:input path="title" cssClass="form-control"/>
			<form:errors path="title" cssClass="text-danger"/>
		</div>

		<div class="mb-3">
			<form:label path="author" cssClass="form-label">Author:</form:label>
			<form:input path="author" cssClass="form-control"/>
			<form:errors path="author" cssClass="text-danger"/>
		</div>

		<div class="mb-3">
			<form:label path="thoughts" cssClass="form-label">Thoughts:</form:label>
			<form:textarea path="thoughts" cssClass="form-control"/>
			<form:errors path="thoughts" cssClass="text-danger"/>
		</div>

		<!-- Hidden field to bind user -->
		<form:input type="hidden" path="user" />

		<div class="mb-3">
			<input type="submit" value="Submit" class="btn btn-primary"/>
		</div>

	</form:form>
</div>

</body>
</html>
