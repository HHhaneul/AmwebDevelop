package controllers.members;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/member/join")
public class JoinController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html; charset=UTF-8");
//        PrintWriter out = resp.getWriter();
//
//        out.write("<h1>상단</h1>");
//
//        RequestDispatcher rd = req.getRequestDispatcher("/member/join.jsp");
//        rd.include(req, resp);
//        //rd.forward(req, resp);
//
//        out.write("<h1>하단</h1>");

        String[] addScript = {"member/form", "member/util"};
        List<String> addCss = Arrays.asList("member/join", "member/util");

        req.setAttribute("addScript", addScript);
        req.setAttribute("addCss", addCss);

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/member/join.jsp");
        rd.forward(req, resp);
    }
}