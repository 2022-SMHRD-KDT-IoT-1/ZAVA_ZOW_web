<%@page import="org.zavazow.model.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
 -->
<title>Board List</title>
<link
	href="https://fonts.googleapis.com/css?family=Raleway:400,400i,600,700,700i&amp;subset=latin-ext"
	rel="stylesheet">
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/fontawesome-all.css" rel="stylesheet">
<link href="css/swiper.css" rel="stylesheet">
<link href="css/magnific-popup.css" rel="stylesheet">
<link href="css/styles.css" rel="stylesheet">

</head>
<body class="header">
	<%
		List<BoardVO> list = (List<BoardVO>) request.getAttribute("list");
	%>
	<!-- Navigation -->
	<nav
		class="navbar navbar-expand-lg navbar-dark navbar-custom fixed-top">
		<!-- Text Logo - Use this if you don't have a graphic logo -->
		<!-- <a class="navbar-brand logo-text page-scroll" href="index.html">Evolo</a> -->

		<!-- Image Logo -->
		<a class="navbar-brand logo-image" href="index.html"><img
			src="images/logo.svg" alt="alternative"></a>

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
					href="#header">Home <span class="sr-only">(current)</span></a></li>
				<li class="nav-item"><a class="nav-link page-scroll"
					href="#services">Services</a></li>
				<li class="nav-item"><a class="nav-link page-scroll"
					href="#pricing">Pricing</a></li>
				<li class="nav-item"><a class="nav-link page-scroll"
					href="#request">Request</a></li>

				<!-- Dropdown Menu -->
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle page-scroll" href="#about"
					id="navbarDropdown" role="button" aria-haspopup="true"
					aria-expanded="false">About</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="terms-conditions.html"><span
							class="item-text">Terms Conditions</span></a>
						<div class="dropdown-items-divide-hr"></div>
						<a class="dropdown-item" href="privacy-policy.html"><span
							class="item-text">Privacy Policy</span></a>
					</div></li>
				<!-- end of dropdown menu -->

				<li class="nav-item"><a class="nav-link page-scroll"
					href="#contact">Contact</a></li>
			</ul>
			<span class="nav-item social-icons"> <span class="fa-stack">
					<a href="#your-link"> <i
						class="fas fa-circle fa-stack-2x facebook"></i> <i
						class="fab fa-facebook-f fa-stack-1x"></i>
				</a>
			</span> <span class="fa-stack"> <a href="#your-link"> <i
						class="fas fa-circle fa-stack-2x twitter"></i> <i
						class="fab fa-twitter fa-stack-1x"></i>
				</a>
			</span>
			</span>
		</div>
	</nav>
	<!-- end of navbar -->
	<!-- end of navigation -->

	<!-- content -->
	<div class="container bg-white" style="margin-top: 200px;">
		<div class="mb-2 pt-2">
			<button type="button" class="btn btn-primary">전체글</button>
			<button type="button" class="btn btn-light">칭찬글</button>
			<button type="button" class="btn btn-light">건의글</button>
			<button type="button" class="btn btn-light">자유글</button>
			<button type="button" class="btn btn-primary float-right">글쓰기</button>
		</div>
		<table class="table table-hover text-center">
			<thead>
				<tr>
					<th>번호</th>
					<th style="width: 60%">제목</th>
					<th>작성자</th>
					<th>날짜</th>
					<th>조회수</th>
				</tr>
			</thead>
			<tbody>
				<%
					int listSize = list.size();
				int pageNum = 0;
				if (listSize > 15) {
					if (listSize % 15 == 0) {
						pageNum = listSize / 15;
					} else {
						pageNum = listSize / 15 + 1;
					}
				}

				int[] pageList = new int[pageNum];
				for (int i = 0; i < pageNum; i++) {
					pageList[i] = 15 * (i + 1);
				}
				%>
				<%
					int pages = 1;
					if(request.getParameter("page") != null){
						pages = Integer.parseInt(request.getParameter("page"));
					}
				
					if (list.size() - 15 * pages >= 0){
					for (int i = list.size() - 15 * (pages - 1) - 1; i > list.size() - 15 * pages; i--) {
						BoardVO vo = list.get(i);
				%>
				<tr>
					<td><%=vo.getArticle_seq()%></td>
					<td class="text-left"><%=vo.getArticle_subject()%></td>
					<td><%=vo.getP_id()%></td>
					<td><%=vo.getArticle_date()%></td>
					<td>0</td>
				</tr>
				<%
					}
					}else{
						for (int i = list.size() - 15 * (pages - 1) - 1; i >= 0; i--){
							BoardVO vo = list.get(i);
				%>
				<tr>
					<td><%=vo.getArticle_seq()%></td>
					<td><%=vo.getArticle_subject()%></td>
					<td><%=vo.getP_id()%></td>
					<td><%=vo.getArticle_date()%></td>
					<td>0</td>
				</tr>
				
				<%		}
					} %>
			</tbody>
		</table>
		<hr>
		<!-- <div class="float-start">
			<button type="button" class="btn btn-primary">전체글</button>
			<button type="button" class="btn btn-light">개념글</button>
		</div> -->
		<div class="float-right">
			<button type="button" class="btn btn-primary">글쓰기</button>
		</div>

		<nav aria-label="Page navigation example">
			<ul class="pagination justify-content-center mt-5">
				<li class="page-item"><a class="page-link" href="#"
					aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
				</a></li>

				<%
					for (int i = 0; i < pageNum; i++) {
				%>
				<li class="page-item"><a class="page-link" href="goBoardMain?page=<%=i+1%>"><%=i + 1%></a></li>
				<%
					}
				%>

				<li class="page-item"><a class="page-link" href="#"
					aria-label="Next"> <span aria-hidden="true">&raquo;</span>
				</a></li>
			</ul>
		</nav>
	</div>
	<!-- end of content -->
	
	<!-- Footer -->
	<div class="footer">
		<div class="container">
			<div class="row">
				<div class="col-md-4">
					<div class="footer-col">
						<h4>About Evolo</h4>
						<p>We're passionate about offering some of the best business
							growth services for startups</p>
					</div>
				</div>
				<!-- end of col -->
				<div class="col-md-4">
					<div class="footer-col middle">
						<h4>Important Links</h4>
						<ul class="list-unstyled li-space-lg">
							<li class="media"><i class="fas fa-square"></i>
								<div class="media-body">
									Our business partners <a class="turquoise" href="#your-link">startupguide.com</a>
								</div></li>
							<li class="media"><i class="fas fa-square"></i>
								<div class="media-body">
									Read our <a class="turquoise" href="terms-conditions.html">Terms
										& Conditions</a>, <a class="turquoise" href="privacy-policy.html">Privacy
										Policy</a>
								</div></li>
						</ul>
					</div>
				</div>
				<!-- end of col -->
				<div class="col-md-4">
					<div class="footer-col last">
						<h4>Social Media</h4>
						<span class="fa-stack"> <a href="#your-link"> <i
								class="fas fa-circle fa-stack-2x"></i> <i
								class="fab fa-facebook-f fa-stack-1x"></i>
						</a>
						</span> <span class="fa-stack"> <a href="#your-link"> <i
								class="fas fa-circle fa-stack-2x"></i> <i
								class="fab fa-twitter fa-stack-1x"></i>
						</a>
						</span> <span class="fa-stack"> <a href="#your-link"> <i
								class="fas fa-circle fa-stack-2x"></i> <i
								class="fab fa-google-plus-g fa-stack-1x"></i>
						</a>
						</span> <span class="fa-stack"> <a href="#your-link"> <i
								class="fas fa-circle fa-stack-2x"></i> <i
								class="fab fa-instagram fa-stack-1x"></i>
						</a>
						</span> <span class="fa-stack"> <a href="#your-link"> <i
								class="fas fa-circle fa-stack-2x"></i> <i
								class="fab fa-linkedin-in fa-stack-1x"></i>
						</a>
						</span>
					</div>
				</div>
				<!-- end of col -->
			</div>
			<!-- end of row -->
		</div>
		<!-- end of container -->
	</div>
	<!-- end of footer -->
	<!-- end of footer -->


	<!-- Copyright -->
	<div class="copyright">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<p class="p-small">
						Copyright © 2020 <a href="https://inovatik.com">Inovatik</a> - All
						rights reserved
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

	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<!-- 	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
 -->
	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    -->
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