<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book Club</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container mt-5">

    <h1 class="mb-4">Welcome to the Book Club!</h1>

    <h2>Register</h2>

    <form:form action="/register" modelAttribute="newUser" class="form">
        <div class="form-group mb-3">
            <form:label path="userName">User Name:</form:label>
            <form:input path="userName" class="form-control"/>
            <form:errors path="userName" cssClass="text-danger"/>
        </div>

        <div class="form-group mb-3">
            <form:label path="email">Email:</form:label>
            <form:input path="email" class="form-control"/>
            <form:errors path="email" cssClass="text-danger"/>
        </div>

        <div class="form-group mb-3">
            <form:label path="password">Password:</form:label>
            <form:password path="password" class="form-control"/>
            <form:errors path="password" cssClass="text-danger"/>
        </div>

        <div class="form-group mb-3">
            <form:label path="confirm">Confirm Password:</form:label>
            <form:password path="confirm" class="form-control"/>
            <form:errors path="confirm" cssClass="text-danger"/>
        </div>

        <div class="form-group">
            <input type="submit" value="Register" class="btn btn-primary"/>
        </div>
    </form:form>

    <hr class="my-5">

    <h2>Log In</h2>

    <form:form action="/login" modelAttribute="newLogin" class="form">
        <div class="form-group mb-3">
            <form:label path="email">Email:</form:label>
            <form:input path="email" class="form-control"/>
            <form:errors path="email" cssClass="text-danger"/>
        </div>

        <div class="form-group mb-3">
            <form:label path="password">Password:</form:label>
            <form:password path="password" class="form-control"/>
            <form:errors path="password" cssClass="text-danger"/>
        </div>

        <div class="form-group">
            <input type="submit" value="Log In" class="btn btn-primary"/>
        </div>
    </form:form>

</div>

</body>
</html>
