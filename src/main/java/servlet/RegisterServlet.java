package servlet;

import java.io.IOException;
import java.util.Arrays;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.getRequestDispatcher("/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String gender = req.getParameter("gender");
        String married = req.getParameter("married");
        String country = req.getParameter("country");
        String note = req.getParameter("note");

        String[] hobbies = req.getParameterValues("hobbies");

        System.out.println("Tên đăng nhập: " + username);
        System.out.println("Mật khẩu: " + password);
        System.out.println("Giới tính: " + gender);
        System.out.println("Đã có gia đình: " + married);
        System.out.println("Quốc tịch: " + country);
        System.out.println("Ghi chú: " + note);

        if (hobbies != null) {
            System.out.println("Sở thích: " + Arrays.toString(hobbies));
        }

        req.setAttribute("message", "Đăng ký thành công!");
        req.getRequestDispatcher("/register.jsp").forward(req, resp);
    }
}