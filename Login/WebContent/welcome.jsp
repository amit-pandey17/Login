<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

	response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
	response.setHeader("Expires","0"); //proxies

if(session.getAttribute("username")==null)
{
	response.sendRedirect("login.jsp");
}
%>
	Welcome :) 
	
<a href="videos.jsp">Link to videos</a>

<form action="Logout">
	<input type="submit" value="LogOut">
</form>
</body>
</html>