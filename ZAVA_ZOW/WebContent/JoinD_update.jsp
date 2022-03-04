<%@page import="org.zavazow.model.DriverVO"%>
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
		DriverVO dvo = (DriverVO) session.getAttribute("dvo");
	%>
	<!-- header -->
	<div id="header">
		<a href="Main.jsp" target="_self" title="메인페이지로 이동"><img
			src="./images/JAVA_ZOW_Logo.PNG" id="logo"></a>
	</div>

	<!-- wrapper -->
	<div id="wrapper">

		<!-- content-->
		<div id="content">

			<form action="updateDCon" method="post">

				<!-- ID -->
				<div>
					<h2 class="join_title" align="center">
						접속한 ID :
						<%=dvo.getD_id()%>
					</h2>
					<h4 align="center">회원정보수정</h4>
				</div>

				<!-- PW1 -->
				<div>
					<h3 class="join_title">
						<label for="pswd1">비밀번호</label>
					</h3>
					<span class="box int_pass"> <input type="text" id="pswd1"
						name="d_pw" class="int" maxlength="20"> <span
						id="alertTxt">사용불가</span>
					</span> <span class="error_next_box"></span>
				</div>

				<!-- PW2 -->
				<div>
					<h3 class="join_title">
						<label for="pswd2">비밀번호 재확인</label>
					</h3>
					<span class="box int_pass_check"> <input type="text"
						id="pswd2" class="int" maxlength="20">
					</span> <span class="error_next_box"></span>
				</div>

				<!-- NAME -->
				<div>
					<h3 class="join_title">
						<label for="name">이름</label>
					</h3>
					<span class="box int_name"> <input type="text" id="name"
						name="d_name" class="int" maxlength="20">
					</span> <span class="error_next_box"></span>
				</div>

				<!-- NICK -->
				<div>
					<h3 class="join_title">
						<label for="nick">닉네임</label>
					</h3>
					<span class="box int_nick"> <input type="text" id="name"
						name="d_nick" class="int" maxlength="20">
					</span> <span class="error_next_box"></span>
				</div>

				<!-- BIRTH -->
				<div>
					<h3 class="join_title">
						<label for="yy">생년월일</label>
					</h3>

					<div id="bir_wrap">

						<!-- BIRTH_YY -->
						<div id="bir_yy">
							<span class="box"> <input type="text" id="yy"
								name="dbirth_yy" class="int" maxlength="4" placeholder="년(4자)">
							</span>
						</div>

						<!-- BIRTH_MM -->
						<div id="bir_mm">
							<span class="box"> <select id="mm" name="dbirth_mm"
								class="sel">
									<option>월</option>
									<option value="01">1</option>
									<option value="02">2</option>
									<option value="03">3</option>
									<option value="04">4</option>
									<option value="05">5</option>
									<option value="06">6</option>
									<option value="07">7</option>
									<option value="08">8</option>
									<option value="09">9</option>
									<option value="10">10</option>
									<option value="11">11</option>
									<option value="12">12</option>
							</select>
							</span>
						</div>

						<!-- BIRTH_DD -->
						<div id="bir_dd">
							<span class="box"> <input type="text" id="dd"
								name="dbirth_dd" class="int" maxlength="2" placeholder="일">
							</span>
						</div>

					</div>
					<span class="error_next_box"></span>
				</div>

				<!-- GENDER -->
				<div>
					<h3 class="join_title">
						<label for="gender">성별</label>
					</h3>
					<span class="box gender_code"> <select id="gender"
						name="d_gender" class="sel">
							<option>성별</option>
							<option value="M">남자</option>
							<option value="F">여자</option>
					</select>
					</span> <span class="error_next_box">필수 정보입니다.</span>
				</div>

				<!-- CARD -->
				<div>
					<h3 class="join_title">
						<label for="company">소속 회사</label>
					</h3>
					<span class="box int_company"> <input type="text"
						id="company" name="d_company" class="int" maxlength="16"
						placeholder="소속 회사 입력">
					</span>

				</div>

				<!-- MOBILE -->
				<div>
					<h3 class="join_title">
						<label for="phoneNo">휴대전화</label>
					</h3>
					<span class="box int_mobile"> <input type="tel" id="mobile"
						name="d_tel" class="int" maxlength="16" placeholder="전화번호 입력">
					</span> <span class="error_next_box"></span>
				</div>

				<!-- HIRE DATE -->
				<div>
					s
					<h3 class="join_title">
						<label for="hire_date">고용일</label>
					</h3>
					<span class="box hire_date"> <input type="date"
						name="d_joindate" style="length: 50">
					</span> <span class="error_next_box">필수 정보입니다.</span>
				</div>

				<!-- JOIN BTN-->
				<div class="btn_area">
					<button type="submit" id="btnJoin"
						style="background-color: #3c96fa">
						<span>개인정보수정</span>
					</button>
				</div>

			</form>
			<!-- JOIN BTN-->
			<div class="btn_area" align="center">
				<form action="deleteDCon">
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