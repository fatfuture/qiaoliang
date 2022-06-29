package web;

import pojo.Form1;
import pojo.Form3;
import service.Form1Service;
import service.Form3Service;
import service.impl.Form1ServiceImpl;
import service.impl.Form3ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DeleteForm3ByKeyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String key=req.getParameter("key");
        Form3Service form3Service=new Form3ServiceImpl();

        Form3 form3=form3Service.queryforoneForm3ByGoujianbianhao(key);

        int code=form3Service.deleteForm3ByGoujianbianhao(key);
        if (code==1&&form3!=null){
            req.getRequestDispatcher("/pages/deleteform3_success.jsp").forward(req,resp);
        }
        else {
            req.getRequestDispatcher("/pages/deleteform3_fail.jsp").forward(req,resp);
        }
    }
}
