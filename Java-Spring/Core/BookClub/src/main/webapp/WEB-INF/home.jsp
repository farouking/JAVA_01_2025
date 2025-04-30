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
    <title>Book Club</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- Make sure this path matches your project -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container mt-5">
    <div class="d-flex justify-content-between align-items-center mb-4">
        <h1>Welcome, <c:out value="${user.userName}" /></h1>
        <div>
            <a href="/logout" class="btn btn-danger btn-sm">Logout</a>
            <a href="/addPage" class="btn btn-primary btn-sm">+ Add Book</a>
        </div>
    </div>

    <h3>Books from Everyone’s Shelves</h3>

    <table class="table table-striped table-bordered">
        <thead class="table-light">
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Author Name</th>
                <th>Posted By</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="book" items="${books}">
                <tr>
                    <td><c:out value="${book.id}" /></td>
                    <td>
                        <a href="/books/${book.id}">
                            <c:out value="${book.title}" />
                        </a>
                    </td>
                    <td><c:out value="${book.author}" /></td>
                    <td><c:out value="${book.user.userName}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
