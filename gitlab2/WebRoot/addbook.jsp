<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加书籍</title>
    
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
    <h2 align =center>添加书籍</h2>
	<table align=center>
	<form  action = "addbook" method="post">
		<tr><td>书名:<input type = "text" name = "title"/></td></tr>
		<tr><td>作者:<input type = "text" name = "name"/></td></tr>
		<tr><td>ISBN:<input type = "text" name = "ISBN"/></td></tr>
		<tr><td>Publisher:<input type = "text" name = "Publisher"/></td></tr>
		<tr><td>PublishDate：<input type = "text" name = "PublishDate"/></td></tr>
		<tr><td>Price：<input type = "text" name = "price"/></td></tr>
		<tr><td><input type = submit value = "提交"/></td></tr>
	</form>
	</table>
  </body>
</html>
