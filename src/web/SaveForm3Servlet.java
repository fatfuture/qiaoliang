package web;

import pojo.Form3;
import service.Form3Service;
import service.impl.Form3ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SaveForm3Servlet extends HttpServlet {
    Form3Service form3Service=new Form3ServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String bujian=req.getParameter("bujian");
        String goujianmingcheng=req.getParameter("goujianmingcheng");
        String goujianbianhao=req.getParameter("goujianbianhao");
        String zhuangtai=req.getParameter("zhuangtai");
        String shunhuaileixing=req.getParameter("shunhuaileixing");
        String shunhuaichengdu=req.getParameter("shunhuaichengdu");
        String shunhuaiweizhi=req.getParameter("shunhuaiweizhi");
        String qingshifenlei=req.getParameter("qingshifenlei");
        String pupianbianhao=req.getParameter("pupianbianhao");
        String beizhu=req.getParameter("beizhu");
        String qiaoliangmingcheng=req.getParameter("qiaoliangmingcheng");
        String jiancedanwei=req.getParameter("jiancedanwei");
        String riqi=req.getParameter("riqi");
        String shending=req.getParameter("shending");
        String fuhe=req.getParameter("fuhe");
        String jiancerenyuan=req.getParameter("jiancerenyuan");
        System.out.println(jiancerenyuan);
        int code= form3Service.saveForm3(new Form3(bujian,goujianmingcheng,goujianbianhao,zhuangtai,shunhuaileixing,shunhuaichengdu,shunhuaiweizhi,qingshifenlei,pupianbianhao,beizhu,qiaoliangmingcheng,jiancedanwei,riqi,shending,fuhe,jiancerenyuan));
        if (code==1){
            req.getRequestDispatcher("/pages/success.jsp").forward(req,resp);
        }
        else {
            req.getRequestDispatcher("/pages/fail.jsp").forward(req,resp);
        }
    }
}
