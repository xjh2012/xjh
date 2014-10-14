<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'BookList.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
   <body>
      <h2 align="center">用MVC实现图书管理系统</h2>
      <hr color="#336699"><br>
      <p align="center">
      <tr>
			Titles:<s:iterator value="#request.allbooks">
			<br><a href="BookAction1?name=<s:property/>"><s:property/></a> 
			<a href="BookAction2?name=<s:property/>">delete</a> </br>
			</s:iterator>
      </tr>
      </p>
     <br> <a href="index.jsp">back</a> </br>
     
   </body>

</html>
