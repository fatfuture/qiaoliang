package web;

import pojo.Form1;
import service.Form1Service;
import service.impl.Form1ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateForm1Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Form1Service form1Service=new Form1ServiceImpl();
        req.setCharacterEncoding("UTF-8");
        String qiaoliangmingcheng=req.getParameter("qiaoliangmingcheng");
        String suozailuming=req.getParameter("suozailuming");
        String guanlidanwei=req.getParameter("guanlidanwei");
        String zhuliangxingsi=req.getParameter("zhuliangxingsi");
        String xingsi1=req.getParameter("xingsi1");
        String yanghudanwei=req.getParameter("yanghudanwei");
        String zuliangchichun=req.getParameter("zuliangchichun");
        String qiaodunshuliang=req.getParameter("qiaodunshuliang");
        String jiansedanwei=req.getParameter("jiansedanwei");
        String zuliangshuliang=req.getParameter("zuliangshuliang");
        String qiaodunbiaogao=req.getParameter("qiaodunbiaogao");
        String shejidanwei=req.getParameter("shejidanwei");
        String hengliangxingsi=req.getParameter("hengliangxingsi");
        String gailiangcicun=req.getParameter("gailiangcicun");
        String jianlidanwei=req.getParameter("jianlidanwei");
        String zukuaqiaoxiajingkong=req.getParameter("zukuaqiaoxiajingkong");
        String jidibiaogao1=req.getParameter("jidibiaogao1");
        String shigongdanwei=req.getParameter("shigongdanwei");
        String qiaoxiaxiangao=req.getParameter("qiaoxiaxiangao");
        String dibancicun=req.getParameter("dibancicun");
        String jianchengnianyue=req.getParameter("jianchengnianyue");
        String gongqiaosikuabi=req.getParameter("gongqiaosikuabi");
        String jizhuangcichun1=req.getParameter("jizhuangcichun1");
        String zhongzhaojia=req.getParameter("zhongzhaojia");
        String jizhuoxingsi=req.getParameter("jizhuoxingsi");
        String jizhuanggengshu1=req.getParameter("jizhuanggengshu1");
        String yanghuleibie=req.getParameter("yanghuleibie");
        String zhizuoshuliang=req.getParameter("zhizuoshuliang");
        String xingsi2=req.getParameter("xingsi2");
        String yanghudengji=req.getParameter("yanghudengji");
        String qiaomianjiegou=req.getParameter("qiaomianjiegou");
        String qiaotaishuliang=req.getParameter("qiaotaishuliang");
        String daoludengji=req.getParameter("daoludengji");
        String qiaomianpuzhunagchengdu=req.getParameter("qiaomianpuzhunagchengdu");
        String qiaotaibiaogao=req.getParameter("qiaotaibiaogao");
        String jiegouleixing=req.getParameter("jiegouleixing");
        String shensuofongxingshi=req.getParameter("shensuofongxingshi");
        String jidibiaogao2=req.getParameter("jidibiaogao2");
        String sejihezai=req.getParameter("sejihezai");
        String shensuofongshuliang=req.getParameter("shensuofongshuliang");
        String taimaocichun=req.getParameter("taimaocichun");
        String xianzhaibiaozun=req.getParameter("xianzhaibiaozun");
        String zhuqiaozhongpo=req.getParameter("zhuqiaozhongpo");
        String dibancichun=req.getParameter("dibancichun");
        String kangzhengliedu=req.getParameter("kangzhengliedu");
        String zhuqiaohengpo=req.getParameter("zhuqiaohengpo");
        String jizhuangcichun2=req.getParameter("jizhuangcichun2");
        String zhengxiejiaojiao=req.getParameter("zhengxiejiaojiao");
        String liqiaozhongpo=req.getParameter("liqiaozhongpo");
        String jizhuanggengshu2=req.getParameter("jizhuanggengshu2");
        String qiaoliangkuashu=req.getParameter("qiaoliangkuashu");
        String yingqiaohengpo=req.getParameter("yingqiaohengpo");
        String dangtubanhoudu=req.getParameter("dangtubanhoudu");
        String kuajingzuhe=req.getParameter("kuajingzuhe");
        String jishuikoucichun=req.getParameter("jishuikoucichun");
        String yiqiangxings=req.getParameter("yiqiangxings");
        String qiaomianmianji=req.getParameter("qiaomianmianji");
        String jishuikoushuliang=req.getParameter("jishuikoushuliang");
        String yiqiangchangdu=req.getParameter("yiqiangchangdu");
        String qiaoliangzhongchang=req.getParameter("qiaoliangzhongchang");
        String xieshuiguancicun=req.getParameter("xieshuiguancicun");
        String fuguguanxian=req.getParameter("fuguguanxian");
        String qiaoliangzhongkuan=req.getParameter("qiaoliangzhongkuan");
        String xieshuichangdu=req.getParameter("xieshuichangdu");
        String ranqiguan=req.getParameter("ranqiguan");
        String cehangdaojingkuan=req.getParameter("cehangdaojingkuan");
        String langanzhongchang=req.getParameter("langanzhongchang");
        String dainlilan=req.getParameter("dainlilan");
        String renxingdaojingkuan=req.getParameter("renxingdaojingkuan");
        String langanjiegou=req.getParameter("langanjiegou");
        String tongxingdianlan=req.getParameter("tongxingdianlan");
        String hedaodengji=req.getParameter("hedaodengji");
        String duanzhucichun=req.getParameter("duanzhucichun");
        String zuigaoshuiwei=req.getParameter("zuigaoshuiwei");
        String huanleixing=req.getParameter("huanleixing");
        String changshuiwei=req.getParameter("changshuiwei");
        String yingpodangqiangleixing=req.getParameter("yingpodangqiangleixing");
        form1Service.deleteForm1Byqiaoliangmingcheng(qiaoliangmingcheng);
                int code=form1Service.updateForm1Byqiaoliangmingcheng(new Form1(qiaoliangmingcheng,suozailuming,guanlidanwei,zhuliangxingsi,xingsi1,yanghudanwei,zuliangchichun,
                qiaodunshuliang,jiansedanwei,zuliangshuliang,qiaodunbiaogao,shejidanwei,
                hengliangxingsi,gailiangcicun,jianlidanwei,zukuaqiaoxiajingkong,jidibiaogao1,
                shigongdanwei,qiaoxiaxiangao,dibancicun,jianchengnianyue,gongqiaosikuabi,
                jizhuangcichun1,zhongzhaojia,jizhuoxingsi,jizhuanggengshu1,yanghuleibie,
                zhizuoshuliang,xingsi2,yanghudengji,qiaomianjiegou,qiaotaishuliang,
                daoludengji,qiaomianpuzhunagchengdu,qiaotaibiaogao,jiegouleixing,shensuofongxingshi,
                jidibiaogao2,sejihezai,shensuofongshuliang,taimaocichun,xianzhaibiaozun,
                zhuqiaozhongpo,dibancichun,kangzhengliedu,zhuqiaohengpo,jizhuangcichun2,
                zhengxiejiaojiao,liqiaozhongpo,jizhuanggengshu2,qiaoliangkuashu,yingqiaohengpo,
                dangtubanhoudu,kuajingzuhe,jishuikoucichun,yiqiangxings,qiaomianmianji,
                jishuikoushuliang,yiqiangchangdu,qiaoliangzhongchang,xieshuiguancicun,fuguguanxian,
                qiaoliangzhongkuan,xieshuichangdu,ranqiguan,cehangdaojingkuan,langanzhongchang,
                dainlilan,renxingdaojingkuan,langanjiegou,tongxingdianlan,hedaodengji,
                duanzhucichun,zuigaoshuiwei,huanleixing,changshuiwei,yingpodangqiangleixing));

        if (code==1){
            req.getRequestDispatcher("/pages/updateform1_success.jsp").forward(req,resp);
        }
        else {
            req.getRequestDispatcher("/pages/updateform1_fail.jsp").forward(req,resp);
        }
    }

}
