package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.logging.Logger;

public class ChatController extends HttpServlet {
    final static Logger logger = Logger.getLogger(ChatController.class.getName());
    @Override
    public void init() throws ServletException {
        super.init();
        logger.info("안녕 나는 서블릿이야");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
        logger.info("서비스! 서비스!");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 인코딩 변경
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        resp.getWriter().println("한글!");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 인코딩 변경
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        
        resp.getWriter().println("한글");
    }

    @Override
    public void destroy() {
        super.destroy();
        logger.info("파괴");
    }
}
