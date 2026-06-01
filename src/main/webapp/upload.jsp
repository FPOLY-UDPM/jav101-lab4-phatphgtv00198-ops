<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:url value="/upload" var="url"/>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Upload File</title>
</head>
<body>

<h2>Upload Hình Ảnh</h2>

<form action="${url}"
      method="post"
      enctype="multipart/form-data">

    <input name="photo" type="file">
    <br><br>

    <button type="submit">Upload</button>
</form>

<br>

<b>${message}</b>

</body>
</html>