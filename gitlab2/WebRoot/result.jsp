<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<html>
<head>

<title>查询结果</title>
</head>
<body>
<table align = center border="1" cellspacing="10">
<tr>
	<th>书名</th>
	<th>删除</th>
	<th>修改</th>
</tr>

<s:iterator value = "list" status = "st">
<tr><td>
	<a href="
		<s:url action="detail" >
    	<s:param name="title"><s:property /></s:param>
		</s:url>
	"> <s:property /></a></td>
	
<td>
	<a href="
		<s:url action="delete" >
    	<s:param name="title"><s:property /></s:param>
		</s:url>
	">  <input type="submit" value="删除"/></a>
</td>

<td>
	<a href="
		<s:url action="change" >
    	<s:param name="title"><s:property /></s:param>
		</s:url>
	">  <input type="submit" value="修改"/></a>
</td>

</tr>
</s:iterator>
</table>
	<form action="back" method="post">
    	<input type="submit" value="返回"/>
    </form>
</body>
</html>