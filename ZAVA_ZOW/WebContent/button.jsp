<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String buttonnum = request.getParameter("buttonnum"); // 아두이노에서 받은 버튼값
	 
		System.out.println(buttonnum); // 0 : 승차요청, 1 : 요청 없음
	%>
</body>
</html>