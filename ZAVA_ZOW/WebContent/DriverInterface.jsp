<%@page import="org.zavazow.model.ButtonDAO"%>
<%@page import="org.zavazow.model.ButtonVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
body {
	background-image: url('images/DriverInterface.png');
	background-size: cover;
	background-repeat: no-repeat;
}
</style>
</head>
<body>
	<%
		String bus_stop = (String)session.getAttribute("bus_stop");
	%>
		<h1>버스정류장 : <%= bus_stop %></h1>
</body>
</html>