<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  
  <body>
  	<h1>welcome to my library</h1><br>
    <form action="search" method="post">
    	作者：<input type="text" name="name"/>
    	<input type="submit" value="提交"/>
    </form>
    <form action="add" method="post">
    	<input type="submit" value="添加书籍"/>
    </form>
    <form action="add1" method="post">
    	<input type="submit" value="添加作者"/>
    </form>
    
  </body>
</html>
