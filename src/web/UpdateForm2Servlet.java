package web;

import pojo.Form2;
import service.Form2Service;
import service.impl.Form2ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateForm2Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String qiaoliangmingcheng=req.getParameter("qiaoliangmingcheng");
        String xunjiandanwei=req.getParameter("xunjiandanwei");
        String qiaomingpai_sunhuaileixing=req.getParameter("qiaomingpai_sunhuaileixing");
        String qiaomingpai_sunhuaichengdu=req.getParameter("qiaomingpai_sunhuaichengdu");
        String qiaomingpai_sunhuaiweizhi=req.getParameter("qiaomingpai_sunhuaiweizhi");
        String qiaomingpai_beizhu=req.getParameter("qiaomingpai_beizhu");
        String xiangaopaixianzaipai_shi=req.getParameter("xiangaopaixianzaipai_shi");
        String xiangaopaixianzaipai_fou=req.getParameter("xiangaopaixianzaipai_fou");
        String xiangaopaixianzaipai_sunhuaileixing=req.getParameter("xiangaopaixianzaipai_sunhuaileixing");
        String xiangaopaixianzaipai_sunhuaichengdu=req.getParameter("xiangaopaixianzaipai_sunhuaichengdu");
        String xiangaopaixianzaipai_sunhuaiweizhi=req.getParameter("xiangaopaixianzaipai_sunhuaiweizhi");
        String xiangaopaixianzaipai_beizhu=req.getParameter("xiangaopaixianzaipai_beizhu");
        String chexingdao_shi=req.getParameter("chexingdao_shi");
        String chexingdao_fou=req.getParameter("chexingdao_fou");
        String chexingdao_sunhuaileixing=req.getParameter("chexingdao_sunhuaileixing");
        String chexingdao_sunhuaichengdu=req.getParameter("chexingdao_sunhuaichengdu");
        String chexingdao_sunhuaiweizhi=req.getParameter("chexingdao_sunhuaiweizhi");
        String chexingdao_beizhu=req.getParameter("chexingdao_beizhu");
        String renxingdao_shi=req.getParameter("renxingdao_shi");
        String renxingdao_fou=req.getParameter("renxingdao_fou");
        String renxingdao_test1=req.getParameter("renxingdao_test1");
        String renxingdao_test2=req.getParameter("renxingdao_test2");
        String renxingdao_test3=req.getParameter("renxingdao_test3");
        String renxingdao_test4=req.getParameter("renxingdao_test4");
        String shensuofeng_shi=req.getParameter("shensuofeng_shi");
        String shensuofeng_fou=req.getParameter("shensuofeng_fou");
        String shensuofeng_test1=req.getParameter("shensuofeng_test1");
        String shensuofeng_test2=req.getParameter("shensuofeng_test2");
        String shensuofeng_test3=req.getParameter("shensuofeng_test3");
        String shensuofeng_test4=req.getParameter("shensuofeng_test4");
        String langan_shi=req.getParameter("langan_shi");
        String langan_fou=req.getParameter("langan_fou");
        String langan_test1=req.getParameter("langan_test1");
        String langan_test2=req.getParameter("langan_test2");
        String langan_test3=req.getParameter("langan_test3");
        String langan_test4=req.getParameter("langan_test4");
        String paishuisheshi_shi=req.getParameter("paishuisheshi_shi");
        String paishuisheshi_fou=req.getParameter("paishuisheshi_fou");
        String paishuisheshi_test1=req.getParameter("paishuisheshi_test1");
        String paishuisheshi_test2=req.getParameter("paishuisheshi_test2");
        String paishuisheshi_test3=req.getParameter("paishuisheshi_test3");
        String paishuisheshi_test4=req.getParameter("paishuisheshi_test4");
        String qiaolulianjieweizhi_shi=req.getParameter("qiaolulianjieweizhi_shi");
        String qiaolulianjieweizhi_fou=req.getParameter("qiaolulianjieweizhi_fou");
        String qiaolulianjieweizhi_test1=req.getParameter("qiaolulianjieweizhi_test1");
        String qiaolulianjieweizhi_test2=req.getParameter("qiaolulianjieweizhi_test2");
        String qiaolulianjieweizhi_test3=req.getParameter("qiaolulianjieweizhi_test3");
        String qiaolulianjieweizhi_test4=req.getParameter("qiaolulianjieweizhi_test4");
        String shangbujiegou_shi=req.getParameter("shangbujiegou_shi");
        String shangbujiegou_fou=req.getParameter("shangbujiegou_fou");
        String shangbujiegou_test1=req.getParameter("shangbujiegou_test1");
        String shangbujiegou_test2=req.getParameter("shangbujiegou_test2");
        String shangbujiegou_test3=req.getParameter("shangbujiegou_test3");
        String shangbujiegou_test4=req.getParameter("shangbujiegou_test4");
        String zhizuo_shi=req.getParameter("zhizuo_shi");
        String zhizuo_fou=req.getParameter("zhizuo_fou");
        String zhizuo_test1=req.getParameter("zhizuo_test1");
        String zhizuo_test2=req.getParameter("zhizuo_test2");
        String zhizuo_test3=req.getParameter("zhizuo_test3");
        String zhizuo_test4=req.getParameter("zhizuo_test4");
        String xiabujiegou_shi=req.getParameter("xiabujiegou_shi");
        String xiabujiegou_fou=req.getParameter("xiabujiegou_fou");
        String xiabujiegou_test1=req.getParameter("xiabujiegou_test1");
        String xiabujiegou_test2=req.getParameter("xiabujiegou_test2");
        String xiabujiegou_test3=req.getParameter("xiabujiegou_test3");
        String xiabujiegou_test4=req.getParameter("xiabujiegou_test4");
        String qiaoliangbaohuquyuneishigong=req.getParameter("qiaoliangbaohuquyuneishigong");
        String qitabinghai=req.getParameter("qitabinghai");
        String xuncharen=req.getParameter("xuncharen");
        String xunchariqi=req.getParameter("xunchariqi");

        Form2Service form2Service=new Form2ServiceImpl();
        form2Service.deleteForm2Byqiaoliangmingcheng(qiaoliangmingcheng);
        int code= form2Service.updateForm2Byqiaoliangmingcheng(new Form2(qiaoliangmingcheng,xunjiandanwei,qiaomingpai_sunhuaileixing,qiaomingpai_sunhuaichengdu,qiaomingpai_sunhuaiweizhi,qiaomingpai_beizhu,xiangaopaixianzaipai_shi,xiangaopaixianzaipai_fou,xiangaopaixianzaipai_sunhuaileixing,xiangaopaixianzaipai_sunhuaichengdu,
                xiangaopaixianzaipai_sunhuaiweizhi,xiangaopaixianzaipai_beizhu,chexingdao_shi,chexingdao_fou,chexingdao_sunhuaileixing,chexingdao_sunhuaichengdu,chexingdao_sunhuaiweizhi,chexingdao_beizhu,renxingdao_shi,renxingdao_fou,
                renxingdao_test1,renxingdao_test2,renxingdao_test3,renxingdao_test4,shensuofeng_shi,shensuofeng_fou,shensuofeng_test1,shensuofeng_test2,shensuofeng_test3,shensuofeng_test4,
                langan_shi,langan_fou,langan_test1,langan_test2,langan_test3,langan_test4,paishuisheshi_shi,paishuisheshi_fou,paishuisheshi_test1,paishuisheshi_test2,
                paishuisheshi_test3,paishuisheshi_test4,qiaolulianjieweizhi_shi,qiaolulianjieweizhi_fou,qiaolulianjieweizhi_test1,qiaolulianjieweizhi_test2,qiaolulianjieweizhi_test3,qiaolulianjieweizhi_test4,shangbujiegou_shi,shangbujiegou_fou,
                shangbujiegou_test1,shangbujiegou_test2,shangbujiegou_test3,shangbujiegou_test4,zhizuo_shi,zhizuo_fou,zhizuo_test1,zhizuo_test2,zhizuo_test3,zhizuo_test4,
                xiabujiegou_shi,xiabujiegou_fou,xiabujiegou_test1,xiabujiegou_test2,xiabujiegou_test3,xiabujiegou_test4,qiaoliangbaohuquyuneishigong,qitabinghai,xuncharen,xunchariqi));
        if (code==1){
            req.getRequestDispatcher("/pages/success.jsp").forward(req,resp);
        }
        else {
            req.getRequestDispatcher("/pages/fail.jsp").forward(req,resp);
        }

    }
}
