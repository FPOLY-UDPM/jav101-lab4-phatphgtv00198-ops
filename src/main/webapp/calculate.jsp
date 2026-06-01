<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:url value="/calculate" var="cal"/>

<form method="post">
    <input type="number" step="any" name="a"><br><br>

    <input type="number" step="any" name="b"><br><br>

    <button type="submit" formaction="${cal}/add">+</button>

    <button type="submit" formaction="${cal}/sub">-</button>
</form>

<br>

${message}