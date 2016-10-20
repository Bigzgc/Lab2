<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
</head>

<body>
<h1>书籍的详细信息</h1>
	<table align=center cellspacing="10">
		<s:iterator value = "m" status = "st">
		<tr><td>
		<s:property />
		</td></tr>
		</s:iterator>
	</table>
</body>
</html>
