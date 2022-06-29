<%@ page import="pojo.Form3" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Mr.hu
  Date: 2022/6/22
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <style type="text/css">
        td{
            /*list-style-type: none;*/
            /*list-style-type: circle ;*/
            color: #00a65a;
            border: 25px solid green;
        }
    </style>

</head>
<body>
<%--练习二：jsp输出一个表格，里面有10个学生信息。--%>
<%
    List<Form3> form3List = (List<Form3>) request.getAttribute("form3s");
%>
<table>
    <tr>
        <th width="90">部件</th>
        <th width="90">构件名称</th>
        <th width="90">构件编号</th>
        <th width="90">状态</th>
        <th width="90">损坏类型</th>
        <th width="90">损坏程度</th>
        <th width="90">损坏位置</th>
        <th width="90">侵蚀分类</th>
        <th width="90">照片编号</th>
        <th width="90">备注（包括损坏原因和可能退化速度）</th>
    </tr>
    <% for (Form3 form3 : form3List) { %>
    <tr>
        <td><%=form3.getBujian()%></td>
        <td><%=form3.getGoujianmingcheng()%></td>
        <td><%=form3.getGoujianbianhao()%></td>
        <td><%=form3.getZhuangtai()%></td>
        <td><%=form3.getShunhuaileixing()%></td>
        <td><%=form3.getShunhuaichengdu()%></td>
        <td><%=form3.getShunhuaichengdu()%></td>
        <td><%=form3.getShunhuaiweizhi()%></td>
        <td><%=form3.getQingshifenlei()%></td>
        <td><%=form3.getPupianbianhao()%></td>
        <td><%=form3.getBeizhu()%></td>
    </tr>
    <% } %>
</table>

</body>
</html>
