package servlet;

import java.io.File;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@MultipartConfig
@WebServlet("/upload")
public class UploadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.getRequestDispatcher("/upload.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        Part photo = req.getPart("photo");

        if (photo == null || photo.getSubmittedFileName().isEmpty()) {
            req.setAttribute("message", "Vui lòng chọn file!");
            req.getRequestDispatcher("/upload.jsp").forward(req, resp);
            return;
        }

        String uploadPath = req.getServletContext()
                .getRealPath("/static/files");

        File uploadDir = new File(uploadPath);

        if (!uploadDir.exists()) {
            uploadDir.mkdirs();
        }

        String fileName = photo.getSubmittedFileName();

        photo.write(uploadPath + File.separator + fileName);

        req.setAttribute("message",
                "Upload thành công: " + fileName);

        req.getRequestDispatcher("/upload.jsp")
                .forward(req, resp);
    }
}