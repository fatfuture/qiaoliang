package web;

import service.BCIService;
import service.impl.BCIServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BSICalculateServlet extends HttpServlet {
    BCIService bciService=new BCIServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String key=req.getParameter("key");
        double res=bciService.BCICalculate(key);
        req.setAttribute("res",res);
        req.getRequestDispatcher("/pages/BCICalculate_res.jsp").forward(req,resp);

    }
}
