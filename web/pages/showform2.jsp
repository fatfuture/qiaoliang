<%@ page import="pojo.Form2" %><%--
  Created by IntelliJ IDEA.
  User: Mr.hu
  Date: 2022/6/26
  Time: 8:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Form2 form2 = (Form2) request.getAttribute("form2");
%>
<table>
    <tr>
        <th width="90">桥梁名称</th>
        <th width="90">巡检单位</th>
        <th width="90">桥名牌_损坏类型</th>
        <th width="90">桥名牌_损坏程度</th>
        <th width="90">桥名牌_损坏位置</th>
        <th width="90">桥名牌_备注</th>
        <th width="90">限高牌、限载牌_是</th>
        <th width="90">限高牌、限载牌_否</th>
    </tr>
    <tr>
        <td><%=form2.getQiaoliangmingcheng()%></td>
        <td><%=form2.getXunjiandanwei()%></td>
        <td><%=form2.getQiaomingpai_sunhuaileixing()%></td>
        <td><%=form2.getQiaomingpai_sunhuaichengdu()%></td>
        <td><%=form2.getQiaomingpai_sunhuaiweizhi()%></td>
        <td><%=form2.getQiaomingpai_beizhu()%></td>
        <td><%=form2.getXiangaopaixianzaipai_shi()%></td>
        <td><%=form2.getXiangaopaixianzaipai_fou()%></td>


    </tr>
<%--    update(sql,form2.getQiaoliangmingcheng(),,,,,--%>
<%--    ,,,form2.getXiangaopaixianzaipai_sunhuaileixing(),form2.getXiangaopaixianzaipai_sunhuaichengdu(),--%>
<%--    form2.getXiangaopaixianzaipai_sunhuaiweizhi(),form2.getXiangaopaixianzaipai_beizhu(),form2.getChexingdao_shi(),form2.getChexingdao_fou(), form2.getChexingdao_sunhuaileixing(),--%>
<%--    form2.getChexingdao_sunhuaichengdu(),form2.getChexingdao_sunhuaiweizhi(),form2.getChexingdao_beizhu(),form2.getRenxingdao_shi(),form2.getRenxingdao_fou(),--%>
<%--    form2.getRenxingdao_test1(),form2.getRenxingdao_test2(),form2.getRenxingdao_test3(),form2.getRenxingdao_test4(), form2.getShensuofeng_shi(),--%>
<%--    form2.getShensuofeng_fou(),form2.getShensuofeng_test1(),form2.getShensuofeng_test2(),form2.getShensuofeng_test3(),form2.getShensuofeng_test4(),--%>
<%--    form2.getLangan_shi(),form2.getLangan_fou(),form2.getLangan_test1(),form2.getLangan_test2(),form2.getLangan_test3(),--%>
<%--    form2.getLangan_test4(),form2.getPaishuisheshi_shi(),form2.getLangan_fou(),form2.getPaishuisheshi_test1(),form2.getPaishuisheshi_test2(),--%>
<%--    form2.getPaishuisheshi_test3(),form2.getPaishuisheshi_test4(),form2.getQiaolulianjieweizhi_shi(),form2.getQiaolulianjieweizhi_fou(),form2.getQiaolulianjieweizhi_test1(),--%>
<%--    form2.getQiaolulianjieweizhi_test2(),form2.getQiaolulianjieweizhi_test3(),form2.getQiaolulianjieweizhi_test4(),form2.getShangbujiegou_shi(),form2.getShangbujiegou_fou(),--%>
<%--    form2.getShangbujiegou_test1(),form2.getShangbujiegou_test2(),form2.getShangbujiegou_test3(),form2.getShangbujiegou_test4(),form2.getZhizuo_shi(),--%>
<%--    form2.getZhizuo_fou(),form2.getZhizuo_test1(),form2.getZhizuo_test2(),form2.getZhizuo_test3(),form2.getZhizuo_test4(),--%>
<%--    form2.getXiabujiegou_shi(),form2.getXiabujiegou_fou(),form2.getXiabujiegou_test1(),form2.getXiabujiegou_test2(),form2.getXiabujiegou_test3(),--%>
<%--    form2.getXiabujiegou_test4(),form2.getQiaoliangbaohuquyuneishigong(),form2.getQitabinghai(),form2.getXuncharen(),form2.getXunchariqi());--%>
<%--    }--%>
</table>
</body>
</html>
