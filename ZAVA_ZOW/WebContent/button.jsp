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
		String buttonnum = request.getParameter("buttonnum"); // �Ƶ��̳뿡�� ���� ��ư��
	 
		System.out.println(buttonnum); // 0 : ������û, 1 : ��û ����
	%>
</body>
</html>