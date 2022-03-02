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
	<!-- header -->
	<div id="header">
		<a href="index.html" target="_self" title="메인페이지로 이동"><img src="./images/JAVA_ZOW_Logo.PNG" id="logo"></a>
	</div>
	
	<!-- wrapper -->
	<div id="wrapper">

		<!-- content-->
		<div id="content">

			<form action="joinACon">

				<!-- ID -->
				<div>
					<h3 class="join_title">
						<label for="id">아이디</label>
					</h3>
					<span class="box int_id">
						<input type="text" id="id" name="a_id" class="int" maxlength="20">
						<span class="step_url">zavazow.com</span>
					</span>
					<span class="error_next_box"></span>
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
						<span>가입하기</span>
					</button>
				</div>

			</form>

		</div>
		<!-- content-->

	</div>
	<!-- wrapper -->

</body>
</html>