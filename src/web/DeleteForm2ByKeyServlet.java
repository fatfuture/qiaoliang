package web;

import pojo.Form2;
import service.Form2Service;
import service.impl.Form2ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteForm2ByKeyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String key=req.getParameter("key");
        Form2Service form2Service=new Form2ServiceImpl();

        Form2 form2=form2Service.queryforoneForm2Byqiaoliangmingcheng(key);

        int code=form2Service.deleteForm2Byqiaoliangmingcheng(key);
        if (code==1&&form2!=null){
            req.getRequestDispatcher("/pages/deleteform2_success.jsp").forward(req,resp);
        }
        else {
            req.getRequestDispatcher("/pages/deleteform2_fail.jsp").forward(req,resp);
        }
    }
}
