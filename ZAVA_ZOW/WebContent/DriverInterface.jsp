<%@page import="java.net.URLEncoder"%>
<%@page import="java.net.URLDecoder"%>
<%@page import="org.zavazow.model.ButtonDAO"%>
<%@page import="org.zavazow.model.ButtonVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="js/jquery-3.6.0.js"></script>
<style type="text/css">
body {
	background-image: url('images/DriverInterface.png');
	background-size: cover;
	background-repeat: no-repeat;
}
.signal{
   width: 30px;
   height: 30px;
   background-color: #9acd32;
   border-radius: 50%;
}
#signal1{
   position: absolute;
   top: 40.5%;
   right: 35.6%;
}
#signal2{
   position: absolute;
   top: 54.5%;
   right: 35.6%;
}
#signal3{
   position: absolute;
   top: 68.5%;
   right: 35.6%;
}
#signal4{
   position: absolute;
   top: 82.5%;
   right: 35.6%;
}
</style>
</head>
<body>
	<div id="signal1" class="signal"></div>
	<div id="signal2" class="signal"></div>
	<div id="signal3" class="signal"></div>
	<div id="signal4" class="signal"></div>
	
	<%
		String buttonnum = request.getParameter("buttonnum");
		
	%>
		
	<script type="text/javascript">
		document.getElementById('signal2').style.backgroundColor="red";
	</script>
	
</body>
</html>