<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加作者</title>
    
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
   	<h2 align =center>添加作者</h2>
	<table align=center>
		<form  action = "insertauthor" method="post">
		<tr><td>作者ID：<input type = "text" name = "AuthorID"/></td></tr>
		<tr><td>作者：<input type = "text" name = "name"/></td></tr>
		<tr><td>年龄：<input type = "text" name = "Age"/></td></tr>
		<tr><td>国籍：<input type = "text" name = "Country"/></td></tr>
		<tr><td><input type = submit value = "提交"></td></tr>
	</form>
	</table>
  </body>
</html>
