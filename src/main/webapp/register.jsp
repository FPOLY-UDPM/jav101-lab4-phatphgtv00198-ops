<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Đăng Ký</title>
</head>
<body>

<h1>Đăng Ký</h1>

<form action="register" method="post">

    Tên đăng nhập:
    <input type="text" name="username">
    <br><br>

    Mật khẩu:
    <input type="password" name="password">
    <br><br>

    Giới tính:
    <input type="radio" name="gender" value="Nam" checked> Nam
    <input type="radio" name="gender" value="Nữ"> Nữ
    <br><br>

    <input type="checkbox" name="married" value="Có">
    Đã có gia đình?
    <br><br>

    Quốc tịch:
    <select name="country">
        <option>Việt Nam</option>
        <option>United States</option>
        <option>Japan</option>
        <option>Korea</option>
    </select>
    <br><br>

    Sở thích:
    <input type="checkbox" name="hobbies" value="Đọc sách"> Đọc sách
    <input type="checkbox" name="hobbies" value="Du lịch"> Du lịch
    <input type="checkbox" name="hobbies" value="Âm nhạc"> Âm nhạc
    <input type="checkbox" name="hobbies" value="Khác"> Khác
    <br><br>

    Ghi chú:
    <br>
    <textarea name="note" rows="5" cols="40"></textarea>
    <br><br>

    <button type="submit">Đăng ký</button>

</form>

<br>

${message}

</body>
</html>