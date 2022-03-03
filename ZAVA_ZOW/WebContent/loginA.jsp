<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>

<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">


<!-- Website Title -->
<title>ZAVAZOW - Smart Bus Information System HTML Landing Page
	Template</title>

<!-- Styles 여긴 필수 -->
<link
	href="https://fonts.googleapis.com/css?family=Raleway:400,400i,600,700,700i&amp;subset=latin-ext"
	rel="stylesheet">
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/fontawesome-all.css" rel="stylesheet">
<link href="css/swiper.css" rel="stylesheet">
<link href="css/magnific-popup.css" rel="stylesheet">
<link href="css/styles.css" rel="stylesheet">


<!-- 표 style -->
<style>
body {
	margin: 0;
	height: 100%;
	background: white;
	font-family: Dotum, '돋움', Helvetica, sans-serif;
}

#logo {
	width: 240px;
	height: 44px;
	cursor: pointer;
}

#header {
	padding-top: 62px;
	padding-bottom: 20px;
	text-align: center;
}

#wrapper {
	position: relative;
	height: 100%;
}

#content {
	position: absolute;
	left: 50%;
	transform: translate(-50%);
	width: 460px;
}

/* 입력폼 */
h3 {
	margin: 19px 0 8px;
	font-size: 14px;
	font-weight: 700;
}

.box {
	display: block;
	width: 100%;
	height: 51px;
	border: solid 1px #dadada;
	padding: 10px 14px 10px 14px;
	box-sizing: border-box;
	background: #fff;
	position: relative;
}

.int {
	display: block;
	position: relative;
	width: 100%;
	height: 29px;
	border: none;
	background: #fff;
	font-size: 15px;
}

input {
	font-family: Dotum, '돋움', Helvetica, sans-serif;
}

.box.int_id {
	padding-right: 110px;
}

.box.int_pass {
	padding-right: 40px;
}

.box.int_pass_check {
	padding-right: 40px;
}

.step_url {
	/*@zavazow.com*/
	position: absolute;
	top: 16px;
	right: 13px;
	font-size: 15px;
	color: #8e8e8e;
}

.pswdImg {
	width: 18px;
	height: 20px;
	display: inline-block;
	position: absolute;
	top: 50%;
	right: 16px;
	margin-top: -10px;
	cursor: pointer;
}

#bir_wrap {
	display: table;
	width: 100%;
}

#bir_yy {
	display: table-cell;
	width: 147px;
}

#bir_mm {
	display: table-cell;
	width: 147px;
	vertical-align: middle;
}

#bir_dd {
	display: table-cell;
	width: 147px;
}

#bir_mm, #bir_dd {
	padding-left: 10px;
}

select {
	width: 100%;
	height: 29px;
	font-size: 15px;
	background: #fff
		url(https://static.nid.naver.com/images/join/pc/sel_arr_2x.gif) 100%
		50% no-repeat;
	background-size: 20px 8px;
	-webkit-appearance: none;
	display: inline-block;
	text-align: start;
	border: none;
	cursor: default;
	font-family: Dotum, '돋움', Helvetica, sans-serif;
}

/* 에러메세지 */
.error_next_box {
	margin-top: 9px;
	font-size: 12px;
	color: red;
	display: none;
}

#alertTxt {
	position: absolute;
	top: 19px;
	right: 38px;
	font-size: 12px;
	color: red;
	display: none;
}

/* 버튼 */
.btn_area {
	margin: 30px 0 91px;
}

#btnJoin {
	width: 100%;
	padding: 21px 0 17px;
	border: 0;
	cursor: pointer;
	color: #fff;
	background-color: #00bfd8;
	font-size: 20px;
	font-weight: 400;
	font-family: Dotum, '돋움', Helvetica, sans-serif;
}
</style>


<!-- Favicon  -->
<link rel="icon" href="images/ZAVAZOW_logo.png">

</head>
<body data-spy="scroll" data-target=".fixed-top">

	<!-- Preloader -->
	<div class="spinner-wrapper">
		<div class="spinner">
			<div class="bounce1"></div>
			<div class="bounce2"></div>
			<div class="bounce3"></div>
		</div>
	</div>
	<!-- end of preloader -->


	<!-- Navbar -->
	<nav
		class="navbar navbar-expand-lg navbar-dark navbar-custom fixed-top">
		<!-- Text Logo - Use this if you don't have a graphic logo -->
		<!-- <a class="navbar-brand logo-text page-scroll" href="index.html">Evolo</a> -->

		<!-- Image Logo -->
		<a class="navbar-brand logo-image" href="index.html"><img
			src="./images/JAVA_ZOW_Logo.PNG" id="logo" alt="alternative"></a>


		<!-- Mobile Menu Toggle Button -->
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarsExampleDefault"
			aria-controls="navbarsExampleDefault" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-awesome fas fa-bars"></span> <span
				class="navbar-toggler-awesome fas fa-times"></span>
		</button>
		<!-- end of mobile menu toggle button -->

		<div class="collapse navbar-collapse" id="navbarsExampleDefault">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item"><a class="nav-link page-scroll"
					href="index.html#header">Home <span class="sr-only">(current)</span></a>
				</li>
				<li class="nav-item"><a class="nav-link page-scroll"
					href="index.html#services">서비스</a></li>

				<!-- Dropdown Menu -->
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle page-scroll"
					href="board_choice.html" id="navbarDropdown" role="button"
					aria-haspopup="true" aria-expanded="false">게시판</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="terms-conditions.html"><span
							class="item-text">건의 게시판</span></a>
						<div class="dropdown-items-divide-hr"></div>
						<a class="dropdown-item" href="privacy-policy.html"><span
							class="item-text">칭찬 게시판</span></a>
						<div class="dropdown-items-divide-hr"></div>
						<a class="dropdown-item" href="privacy-policy.html"><span
							class="item-text">자유 게시판</span></a>
					</div></li>
				<!-- end of dropdown menu -->

				<li class="nav-item"><a class="nav-link page-scroll"
					href="Company.html">버스회사정보</a></li>



				<!-- Dropdown Menu -->
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle page-scroll" href="#about"
					id="navbarDropdown" role="button" aria-haspopup="true"
					aria-expanded="false">로그인</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">

						<a class="dropdown-item" href="Join_choice.html	"><span
							class="item-text">회원가입</span></a>
						<div class="dropdown-items-divide-hr"></div>



						<a class="dropdown-item" href="Login.html"><span
							class="item-text">로그인</span></a>
					</div></li>
				<!-- end of dropdown menu -->





				<!--  <li class="nav-item"><a class="nav-link page-scroll"
					href="Login.html">로그인</a></li>-->
			</ul>

		</div>
	</nav>
	<!-- end of navbar -->
	<!-- end of navbar -->


	<!-- Header -->
	<header id="header" class="header">
		<div class="header-content">
			<div class="container">
				<div class="row">
					<div class="col-lg-6"></div>
					<!-- end of text-container -->
				</div>
				<!-- end of col -->
				<div class="col-lg-6">
					<div class="image-container">
						<img class="img-fluid" src="images/BUS__STATION1.JPG"
							alt="alternative">
					</div>
					<!-- end of image-container -->
				</div>
				<!-- end of col -->
			</div>
			<!-- end of row -->
		</div>
		<!-- end of container -->
		</div>
		<!-- end of header-content -->
	</header>
	<!-- end of header -->
	<!-- end of header -->












	<!-- wrapper -->

	<div id="wrapper">
		<div align="center">
			<a href="login.html">일반 로그인</a> <a href="#">버스기사 로그인</a>
		</div>

		<!-- content-->
		<div id="content">

			<form action="loginACon">

				<!-- ID -->
				<div>
					<h3 class="join_title">
						<label for="id">아이디</label>
					</h3>
					<span class="box int_id"> <input type="text" id="id"
						name="a_id" class="int" maxlength="20"> <span
						class="step_url">zavazow.com</span>
					</span> <span class="error_next_box"></span>
				</div>

				<!-- PW1 -->
				<div>
					<h3 class="join_title">
						<label for="pswd1">비밀번호</label>
					</h3>
					<span class="box int_pass"> <input type="text" id="pswd1"
						name="a_pw" class="int" maxlength="20"> <span
						id="alertTxt">사용불가</span>
					</span> <span class="error_next_box"></span>
				</div>

				<!-- JOIN BTN-->
				<div class="btn_area">
					<button type="submit" id="btnJoin"
						style="background-color: #3c96fa">
						<span>로그인</span>
					</button>
				</div>

			</form>


		</div>
		<!-- content-->

	</div>
	<!-- wrapper -->





	<!-- Breadcrumbs -->
	<div class="ex-basic-1">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="breadcrumbs">
						<a href="index.html">Home</a><i class="fa fa-angle-double-right"></i><span>로그인</span>
					</div>
					<!-- end of breadcrumbs -->
				</div>
				<!-- end of col -->
			</div>
			<!-- end of row -->
		</div>
		<!-- end of container -->
	</div>
	<!-- end of ex-basic-1 -->
	<!-- end of breadcrumbs -->







	<!-- Copyright -->
	<div class="copyright">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<p class="p-small">
						Copyright © 2022 <a href="https://www.smhrd.or.kr">Zavazow</a> -
						All rights reserved
					</p>
				</div>
				<!-- end of col -->
			</div>
			<!-- enf of row -->
		</div>
		<!-- end of container -->
	</div>
	<!-- end of copyright -->
	<!-- end of copyright -->


	<!-- Scripts -->
	<script src="js/jquery.min.js"></script>
	<!-- jQuery for Bootstrap's JavaScript plugins -->
	<script src="js/popper.min.js"></script>
	<!-- Popper tooltip library for Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Bootstrap framework -->
	<script src="js/jquery.easing.min.js"></script>
	<!-- jQuery Easing for smooth scrolling between anchors -->
	<script src="js/swiper.min.js"></script>
	<!-- Swiper for image and text sliders -->
	<script src="js/jquery.magnific-popup.js"></script>
	<!-- Magnific Popup for lightboxes -->
	<script src="js/validator.min.js"></script>
	<!-- Validator.js - Bootstrap plugin that validates forms -->
	<script src="js/scripts.js"></script>
	<!-- Custom scripts -->
</body>
</html>