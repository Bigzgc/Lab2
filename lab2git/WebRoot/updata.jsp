<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>更新</title>
    
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
	<table>
	<form  action = "updata" method ="post" align =center>
		<tr><td>书名：（不可改变）<input type = "text" name="title"></td></tr>
		<tr><td>作者：<input type = "text" name = "name" ></td></tr>
		<tr><td>Publisher：<input type = "text" name = "Publisher"></td></tr>
		<tr><td>PublishDate：<input type = "text" name = "PublishDate"></td></tr>
		<tr><td>Price：<input type = "text" name = "price"></td></tr>
		<tr><td><input type = submit value = "提交"></td></tr>
	</form>
	</table>
  </body>
</html>
