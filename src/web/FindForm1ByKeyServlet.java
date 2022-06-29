package web;

import pojo.Form1;
import pojo.Form3;
import service.Form1Service;
import service.impl.Form1ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class FindForm1ByKeyServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String key=req.getParameter("key");
        Form1Service form1Service=new Form1ServiceImpl();
        Form1 form1= form1Service.queryforoneForm1Byqiaoliangmingcheng(key);
        req.setAttribute("form1", form1);
        req.getRequestDispatcher("/pages/showform1.jsp").forward(req,resp);

    }
}
