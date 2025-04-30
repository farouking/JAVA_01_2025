<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <title>Login and Registration</title>
</head>
<body>

<h1>Welcome!</h1>
<p>Join our growing community</p>

<!-- Registration Form -->
<form:form action="/register" method="post" modelAttribute="newUser">
    <table>
        <thead>
            <tr><th colspan="2">Register</th></tr>
        </thead>
        <tbody>
            <tr>
                <td class="float-left">Username:</td>
                <td class="float-left">
                    <form:errors path="username" cssClass="text-danger" />
                    <form:input path="username" cssClass="input" />
                </td>
            </tr>
            <tr>
                <td class="float-left">Email:</td>
                <td class="float-left">
                    <form:errors path="email" cssClass="text-danger" />
                    <form:input path="email" cssClass="input" />
                </td>
            </tr>
            <tr>
                <td class="float-left">Password:</td>
                <td class="float-left">
                    <form:errors path="password" cssClass="text-danger" />
                    <form:password path="password" cssClass="input" />
                </td>
            </tr>
            <tr>
                <td class="float-left">Confirm PW:</td>
                <td class="float-left">
                    <form:errors path="confirm" cssClass="text-danger" />
                    <form:password path="confirm" cssClass="input" />
                </td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" class="input" value="Submit" /></td>
            </tr>
        </tbody>
    </table>
</form:form>

<hr>

<!-- Login Form -->
<form:form action="/login" method="post" modelAttribute="newLogin">
    <table>
        <thead>
            <tr><th colspan="2">Log In</th></tr>
        </thead>
        <tbody>
            <tr>
                <td class="float-left">Email:</td>
                <td class="float-left">
                    <form:errors path="email" cssClass="text-danger" />
                    <form:input path="email" cssClass="input" />
                </td>
            </tr>
            <tr>
                <td class="float-left">Password:</td>
                <td class="float-left">
                    <form:errors path="password" cssClass="text-danger" />
                    <form:password path="password" cssClass="input" />
                </td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" class="input" value="Submit" /></td>
            </tr>
        </tbody>
    </table>
</form:form>

</body>
</html>
