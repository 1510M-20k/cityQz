<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%
    	String path=request.getContextPath();
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>排名</td>
			<c:forEach items="${qlist }" var="q">
				<td>${q.qname }<br>(权重${q.qz })</td>
			</c:forEach>
			<td>zongfen</td>
		</tr>
		<%-- <c:forEach items="${clist }" varStatus="i" var="c">
			<tr>
				<td>${i.count }</td>
				<td>${c.cname }</td>
				<c:forEach items="${clist }"  var="cc">
					<td>${cc.cfs }</td>
					<td>${cc.zf }</td>
				</c:forEach>
			</tr>
		</c:forEach> --%>
	</table>
</body>
</html>