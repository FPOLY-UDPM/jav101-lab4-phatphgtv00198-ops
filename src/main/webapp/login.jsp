<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<c:url value="/account/login" var="url"/>

<form action="${url}" method="post">
    Username:
    <input name="username">
    <br><br>

    Password:
    <input name="password" type="password">
    <br><br>

    <button type="submit">Login</button>
</form>

<br>

${message}