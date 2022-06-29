package web;

import pojo.Form3;
import service.Form3Service;
import service.impl.Form3ServiceImpl;
import utils.BCIUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class FindForm3ByKeyServlet extends HttpServlet {
    Form3Service form3Service=new Form3ServiceImpl();
    BCIUtil bciUtil;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String key=req.getParameter("key");
        Form3Service form3Service=new Form3ServiceImpl();
//
//        double res=0;
//        bciUtil.calculate(form3Service.queryForm3ByGoujianbianhao(key));
//        res=bciUtil.getResult();
        List<Form3> form3s=form3Service.queryForm3ByGoujianbianhao(key);

        // 保存查询到的结果（学生信息）到request域中
        req.setAttribute("form3s", form3s);
        // 请求转发到showStudent.jsp页面
        req.getRequestDispatcher("/pages/showform3s.jsp").forward(req,resp);


    }
}
