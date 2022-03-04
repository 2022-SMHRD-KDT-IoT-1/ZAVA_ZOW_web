<%@page import="org.zavazow.model.AdminVO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Join</title>
<link rel="stylesheet" href="./css/Join.css">
</head>
<body>

<%
	AdminVO avo = (AdminVO) session.getAttribute("avo");
%>
	<!-- header -->
	<div id="header">
		<a href="Main.jsp" target="_self" title="메인페이지로 이동"><img src="./images/JAVA_ZOW_Logo.PNG" id="logo"></a>
	</div>
	
	<!-- wrapper -->
	<div id="wrapper">

		<!-- content-->
		<div id="content">

			<form action="updateACon">

				<!-- ID -->
				<div>
					<h2 class="join_title" align="center">
						접속한 ID :
						<%=avo.getA_id()%>
					</h2>
					<h4 align="center">회원정보수정</h4>
				</div>

				<!-- PW1 -->
				<div>
					<h3 class="join_title">
						<label for="pswd1">비밀번호</label>
					</h3>
					<span class="box int_pass">
						<input type="text" id="pswd1" name="a_pw" class="int" maxlength="20">
						<span id="alertTxt">사용불가</span>
					</span>
					<span class="error_next_box"></span>
				</div>

				<!-- PW2 -->
				<div>
					<h3 class="join_title">
						<label for="pswd2">비밀번호 재확인</label>
					</h3>
					<span class="box int_pass_check">
						<input type="text" id="pswd2" class="int" maxlength="20">
					</span>
					<span class="error_next_box"></span>
				</div>

				<!-- CODE -->
				<div>
					<h3 class="join_title">
						<label for="code">코드</label>
					</h3>
					<span class="box int_code">
						<input type="text" id="code" name="a_code" class="int" maxlength="20" placeholder="부여받은 코드번호를 입력하세요">
					</span>
					<span class="error_next_box"></span>
				</div>

				<!-- JOIN BTN-->
				<div class="btn_area">
					<button type="submit" id="btnJoin" style="background-color: #3c96fa">
						<span>개인정보수정</span>
					</button>
				</div>

			</form>
			<!-- JOIN BTN-->
			<div class="btn_area" align="center">
				<form action="deleteACon">
					<button type="submit" id="btnJoin"
						style="width: 200px; background-color: black">
						<span>회원탈퇴</span>
					</button>
				</form>
			</div>
		</div>
		<!-- content-->

	</div>
	<!-- wrapper -->

</body>
</html>