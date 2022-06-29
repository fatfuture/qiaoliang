<%@ page import="pojo.Form1" %>
<%@ page import="java.sql.SQLOutput" %><%--
  Created by IntelliJ IDEA.
  User: Mr.hu
  Date: 2022/6/25
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>showform1</title>
</head>
<body>
<%
    Form1 form1 = (Form1) request.getAttribute("form1");
%>
    <table>
        <tr>
            <th width="90">桥梁名称</th>
            <th width="90">所在路名</th>
            <th width="90">管理单位</th>
            <th width="90">主梁形式</th>
            <th width="90">形式1</th>
            <th width="90">养护单位</th>
            <th width="90">主梁尺寸</th>
            <th width="90">桥墩数量</th>
            <th width="90">建设单位</th>
            <th width="90">主梁数量</th>
        </tr>
        <tr>
            <td><%=form1.getQiaoliangmingcheng()%></td>
            <td><%=form1.getSuozailuming()%></td>
            <td><%=form1.getGuanlidanwei()%></td>
            <td><%=form1.getZhuliangxingsi()%></td>
            <td><%=form1.getXingsi1()%></td>
            <td><%=form1.getYanghudanwei()%></td>
            <td><%=form1.getZuliangchichun()%></td>
            <td><%=form1.getQiaodunshuliang()%></td>
            <td><%=form1.getJiansedanwei()%></td>
            <td><%=form1.getZuliangshuliang()%></td>


        </tr>
<%--        return  update(sql,form1.getQiaoliangmingcheng(),form1.getSuozailuming(), form1.getGuanlidanwei(),form1.getZhuliangxingsi(),form1.getXingsi1(),form1.getYanghudanwei(),form1.getZuliangchichun(),--%>
<%--        form1.getQiaodunshuliang(),form1.getJiansedanwei(),form1.getZuliangshuliang(),form1.getQiaodunbiaogao(),form1.getShejidanwei(),--%>
<%--        form1.getHengliangxingsi(),form1.getGailiangcicun(),form1.getJianlidanwei(),form1.getZukuaqiaoxiajingkong(),form1.getJidibiaogao1(),--%>
<%--        form1.getShigongdanwei(),form1.getQiaoxiaxiangao(),form1.getDibancicun(),form1.getJianchengnianyue(),form1.getGongqiaosikuabi(),--%>
<%--        form1.getJizhuangcichun1(),form1.getZhongzhaojia(),form1.getJizhuoxingsi(),form1.getJizhuanggengshu1(),form1.getYanghuleibie(),--%>
<%--        form1.getZhizuoshuliang(),form1.getXingsi2(),form1.getYanghudengji(),form1.getQiaomianjiegou(),form1.getQiaotaishuliang(),--%>
<%--        form1.getDaoludengji(),form1.getQiaomianpuzhunagchengdu(),form1.getQiaotaibiaogao(),form1.getJiegouleixing(),form1.getShensuofongxingshi(),--%>
<%--        form1.getJidibiaogao2(),form1.getSejihezai(),form1.getShensuofongshuliang(),form1.getTaimaocichun(),form1.getXianzhaibiaozun(),--%>
<%--        form1.getZhuqiaozhongpo(),form1.getDibancichun(),form1.getKangzhengliedu(),form1.getZhuqiaohengpo(),form1.getJizhuangcichun2(),--%>
<%--        form1.getZhengxiejiaojiao(),form1.getLiqiaozhongpo(),form1.getJizhuanggengshu2(),form1.getQiaoliangkuashu(),form1.getYingqiaohengpo(),--%>
<%--        form1.getDangtubanhoudu(),form1.getKuajingzuhe(),form1.getJishuikoucichun(),form1.getYiqiangxings(),form1.getQiaomianmianji(),--%>
<%--        form1.getJishuikoushuliang(),form1.getYiqiangchangdu(),form1.getQiaoliangzhongchang(),form1.getXieshuiguancicun(),form1.getFuguguanxian(),--%>
<%--        form1.getQiaoliangzhongkuan(),form1.getXieshuichangdu(),form1.getRanqiguan(),form1.getCehangdaojingkuan(),form1.getLanganzhongchang(),--%>
<%--        form1.getDainlilan(),form1.getRenxingdaojingkuan(),form1.getLanganjiegou(),form1.getTongxingdianlan(),--%>
<%--        form1.getHedaodengji(), form1.getDuanzhucichun(), form1.getZuigaoshuiwei(), form1.getHuanleixing(), form1.getChangshuiwei(),--%>
<%--        form1.getYingpodangqiangleixing());--%>
    </table>
</body>
</html>
