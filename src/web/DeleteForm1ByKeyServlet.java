package web;

import pojo.Form1;
import service.Form1Service;
import service.impl.Form1ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteForm1ByKeyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String key=req.getParameter("key");
        Form1Service form1Service=new Form1ServiceImpl();

        Form1 form1=form1Service.queryforoneForm1Byqiaoliangmingcheng(key);

        int code=form1Service.deleteForm1Byqiaoliangmingcheng(key);
        if (code==1&&form1!=null){
            req.getRequestDispatcher("/pages/deleteform1_success.jsp").forward(req,resp);
        }
        else {
            req.getRequestDispatcher("/pages/deleteform1_fail.jsp").forward(req,resp);
        }
    }
}
