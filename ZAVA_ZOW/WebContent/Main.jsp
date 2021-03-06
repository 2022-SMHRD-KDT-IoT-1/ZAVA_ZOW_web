<%@page import="org.zavazow.model.AdminVO"%>
<%@page import="org.zavazow.model.DriverVO"%>
<%@page import="org.zavazow.model.PassengerVO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- SEO Meta Tags -->
<meta name="description"
	content="Create a stylish landing page for your business startup and get leads for the offered services with this HTML landing page template.">
<meta name="author" content="Inovatik">

<!-- Website Title -->
<title>ZAVAZOW - Smart Bus Information System HTML Landing Page
	Template</title>

<!-- Styles -->
<link
	href="https://fonts.googleapis.com/css?family=Raleway:400,400i,600,700,700i&amp;subset=latin-ext"
	rel="stylesheet">
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/fontawesome-all.css" rel="stylesheet">
<link href="css/swiper.css" rel="stylesheet">
<link href="css/magnific-popup.css" rel="stylesheet">
<link href="css/styles.css" rel="stylesheet">


<!-- Favicon  -->
<!--    <link rel="icon" href="images/favicon.png">  -->
</head>
<body data-spy="scroll" data-target=".fixed-top">
	<%
	PassengerVO vo = (PassengerVO) session.getAttribute("vo");
	out.print(vo);
	System.out.println(vo);
	
	DriverVO dvo = (DriverVO)session.getAttribute("dvo");
	out.print(dvo);
	System.out.println(dvo);

	AdminVO avo = (AdminVO)session.getAttribute("avo");
	out.print(avo);
	System.out.print(avo);
	%>
	<!-- Preloader -->
	<div class="spinner-wrapper">
		<div class="spinner">
			<div class="bounce1"></div>
			<div class="bounce2"></div>
			<div class="bounce3"></div>
		</div>
	</div>
	<!-- end of preloader -->


	<!-- Navigation -->
	<nav
		class="navbar navbar-expand-lg navbar-dark navbar-custom fixed-top">




		<!-- Image Logo -->

		<a class="navbar-brand logo-image" href="index.html"><img
			src="images/ZAVAZOW_logo.png" alt="alternative"></a>

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
					href="#services">?????????</a></li>

				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle page-scroll"
					href="board_choice.html" id="navbarDropdown" role="button"
					aria-haspopup="true" aria-expanded="false">?????????</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="terms-conditions.html"><span
							class="item-text">???????????????</span></a>
						<div class="dropdown-items-divide-hr"></div>
						<a class="dropdown-item" href="privacy-policy.html"><span
							class="item-text">???????????????</span></a>
						<div class="dropdown-items-divide-hr"></div>
						<a class="dropdown-item" href="privacy-policy.html"><span
							class="item-text">???????????????</span></a>
					</div></li>

				<li class="nav-item"><a class="nav-link page-scroll"
					href="Company.html">??????????????????</a></li>



				<!-- Dropdown Menu -->
				<li class="nav-item dropdown">
				<%if(vo == null && dvo == null && avo == null){ %>
				<a class="nav-link dropdown-toggle page-scroll" href="Login.html"
					id="navbarDropdown" role="button" aria-haspopup="true"
					aria-expanded="false">?????????</a>
					<%}else{ %>
					<a class="nav-link dropdown-toggle page-scroll" href="logoutCon"
					id="navbarDropdown" role="button" aria-haspopup="true"
					aria-expanded="false">????????????</a>
					<%} %>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<%if(vo == null && dvo == null && avo == null){ %>
						<a class="dropdown-item" href="Join_choice.html"><span
							class="item-text">????????????</span></a>
						<div class="dropdown-items-divide-hr"></div>
						<a class="dropdown-item" href="Login.html"><span
							class="item-text">?????????</span></a>
							<%}else{ %>
								<%if(vo != null){ %>
							<a class="dropdown-item" href="Join_update.jsp">
							<span class="item-text">??????????????????</span></a>
							<%}else if(dvo != null){ %>
							<a class="dropdown-item" href="JoinD_update.jsp">
							<span class="item-text">??????????????????</span></a>
							<%}else if(avo != null){ %>
							<a class="dropdown-item" href="JoinA_update.jsp">
							<span class="item-text">??????????????????</span></a>
							<%}else{ %>
							<%} %>
						<div class="dropdown-items-divide-hr"></div>
						<a class="dropdown-item" href="logoutCon"><span
							class="item-text">????????????</span></a>
							<%} %>
					</div></li>
					
					
				<!-- end of dropdown menu -->

			</ul>


			</span>
		</div>
	</nav>
	<!-- end of navbar -->
	<!-- end of navigation -->


	<!-- Header -->
	<header id="header" class="header">
		<div class="header-content">
			<div class="container">
				<div class="row">
					<div class="col-lg-6">
						<div class="text-container">
							<h1>
								<span class="turquoise">ZAVAZOW</span>
								<H1>????????? ?????? ??????</h1>
								<p class="p-large">Smart Bus Information System</p>


								<a class="btn-solid-lg page-scroll" href="#services">DISCOVER</a>
						</div>
						<!-- end of text-container -->
					</div>
					<!-- end of col -->
					<div class="col-lg-6">
						<div class="image-container">
							<img class="img-fluid" src="images/BUS_STATION_HEADER.png"
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









	<!--main Services -->

	<div id="services" class="cards-1">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<h2>Business Growth Services</h2>
					<!--     <p class="p-heading p-large">We serve small and medium sized companies in all tech related industries with high quality growth services which are presented below</p>
                -->
				</div>
				<!-- end of col -->
			</div>
			<!-- end of row -->
			<div class="row">
				<div class="col-lg-12">

					<!-- Card -->
					<a href="Boarding.html"><div class="card">
							<img class="card-image" src="images/iconmonstrbus2.png"
								alt="alternative">
							<div class="card-body">
								<h4 class="card-title">????????? ????????????</h4>
								<p>Our team of enthusiastic marketers will analyse and
									evaluate how your company stacks against the closest
									competitors</p>

							</div>
						</div> </a>
					<!-- end of card -->

					<!-- Card -->
					<a href="board_choice.html"><div class="card">
							<img class="card-image" src="images/service4.png"
								alt="alternative">
							<div class="card-body">
								<h4 class="card-title">?????????</h4>
								<p>Once the market analysis process is completed our staff
									will search for opportunities that are in reach</p>

							</div>
						</div> </a>
					<!-- end of card -->

					<!-- Card -->

					<a href="Company.html"><div class="card">
							<img class="card-image" src="images/service5.png"
								alt="alternative">
							<div class="card-body">

								<h4 class="card-title">???????????? ??????</h4>
								<p>With all the information in place you will be presented
									with an action plan that your company needs to follow</p>

							</div>
						</div> </a>
					<!-- end of card -->

				</div>
				<!-- end of col -->
			</div>
			<!-- end of row -->
		</div>
		<!-- end of container -->
	</div>
	<!-- end of cards-1 -->
	<!-- end of services -->




	<!-- Video -->



	<div class="basic-3">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<h2>?????? ?????? ??????</h2>
				</div>
				<!-- end of col -->
			</div>
			<!-- end of row -->
			<div class="row">
				<div class="col-lg-12">

					<!-- Video Preview -->
					<div class="image-container">
						<div class="video-wrapper">
							<a class="popup-youtube"
								href="https://www.youtube.com/watch?v=fLCjQJCekTs"
								data-effect="fadeIn"> <img class="img-fluid"
								src="images/video-frame.jpg" alt="alternative"> <span
								class="video-play-button"> <span></span>
							</span>
							</a>
						</div>
						<!-- end of video-wrapper -->
					</div>
					<!-- end of image-container -->
					<!-- end of video preview -->

					<p>
						This video will show you a case study for one of our <strong>Major
							Customers</strong> and will help you understand why your startup needs <strong>Zavazow</strong>
						in this highly competitive market
					</p>
				</div>
				<!-- end of col -->
			</div>
			<!-- end of row -->
		</div>
		<!-- end of container -->
	</div>
	<!-- end of basic-3 -->
	<!-- end of video -->





	<!-- ?????? -->


	<div id="about" class="basic-4">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<h2>About The Team</h2>
					<p class="p-heading p-large">Meat our team of specialized
						marketers and business developers which will help you research new
						products and launch them in new emerging markets</p>
				</div>
				<!-- end of col -->
			</div>
			<!-- end of row -->
			<div class="row">
				<div class="col-lg-12">

					<!-- Team Member -->
					<div class="team-member">
						<div class="image-wrapper">
							<img class="img-fluid" src="images/team-member-2.svg"
								alt="alternative">
						</div>
						<!-- end of image-wrapper -->
						<p class="p-large">
							<strong>?????????</strong>
						</p>
						<p class="job-title">??????</p>

					</div>
					<!-- end of team-member -->
					<!-- end of team member -->

					<!-- Team Member -->
					<div class="team-member">
						<div class="image-wrapper">
							<img class="img-fluid" src="images/team-member-2.svg"
								alt="alternative">
						</div>
						<!-- end of image wrapper -->
						<p class="p-large">
							<strong>?????????</strong>
						</p>
						<p class="job-title">??????</p>
						<span class="social-icons"> <span class="fa-stack">
					</div>
					<!-- end of team-member -->
					<!-- end of team member -->

					<!-- Team Member -->
					<div class="team-member">
						<div class="image-wrapper">
							<img class="img-fluid" src="images/team-member-1.svg"
								alt="alternative">
						</div>
						<!-- end of image wrapper -->
						<p class="p-large">
							<strong>?????????</strong>
						</p>
						<p class="job-title">??????</p>

					</div>
					<!-- end of team-member -->
					<!-- end of team member -->



					<br>



					<!-- Team Member -->
					<div class="team-member">
						<div class="image-wrapper">
							<img class="img-fluid" src="images/team-member-2.svg"
								alt="alternative">
						</div>
						<!-- end of image wrapper -->
						<p class="p-large">
							<strong>?????????</strong>
						</p>
						<p class="job-title">??????</p>

					</div>
					<!-- end of team-member -->
					<!-- end of team member -->

					<!-- Team Member -->
					<div class="team-member">
						<div class="image-wrapper">
							<img class="img-fluid" src="images/team-member-3.svg"
								alt="alternative">
						</div>
						<!-- end of image wrapper -->
						<p class="p-large">
							<strong>?????????</strong>
						</p>
						<p class="job-title">??????</p>

					</div>
					<!-- end of team-member -->
					<!-- end of team member -->

				</div>
				<!-- end of col -->
			</div>
			<!-- end of row -->
		</div>
		<!-- end of container -->
	</div>
	<!-- end of basic-4 -->
	<!-- end of ?????? -->








	<!-- ????????? -->
	<div class="slider-1">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<h5>Trusted By Partners</h5>

					<!-- Image Slider -->
					<div class="slider-container">
						<div class="swiper-container image-slider">
							<div class="swiper-wrapper">
								<div class="swiper-slide">
									<div class="image-container">
										<img class="img-responsive" src="images/customer-logo-1.png"
											alt="alternative">
									</div>
								</div>
								<div class="swiper-slide">
									<div class="image-container">
										<img class="img-responsive" src="images/customer-logo-2.png"
											alt="alternative">
									</div>
								</div>
								<div class="swiper-slide">
									<div class="image-container">
										<img class="img-responsive" src="images/customer-logo-3.jpg"
											alt="alternative">
									</div>
								</div>
								<div class="swiper-slide">
									<div class="image-container">
										<img class="img-responsive" src="images/customer-logo-4.png"
											alt="alternative">
									</div>
								</div>
								<div class="swiper-slide">
									<div class="image-container">
										<img class="img-responsive" src="images/customer-logo-1.png"
											alt="alternative">
									</div>
								</div>
								<div class="swiper-slide">
									<div class="image-container">
										<img class="img-responsive" src="images/customer-logo-2.png"
											alt="alternative">
									</div>
								</div>

							</div>
							<!-- end of swiper-wrapper -->
						</div>
						<!-- end of swiper container -->
					</div>
					<!-- end of slider-container -->
					<!-- end of image slider -->

				</div>
				<!-- end of col -->
			</div>
			<!-- end of row -->
		</div>
		<!-- end of container -->
	</div>
	<!-- end of slider-1 -->
	<!-- end of customers -->









	<!-- Footer -->
	<div class="footer">
		<div class="container">
			<div class="row">
				<div class="col-md-4">
					<div class="footer-col">
						<h4>About Zavazow</h4>
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
									Our business partners <a class="turquoise"
										href="https://www.smhrd.or.kr">smhrd.or.kr</a>
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
						<span class="fa-stack fa-lg"> <a
							href="https://www.facebook.com/"> <i
								class="fas fa-circle fa-stack-2x"></i> <i
								class="fab fa-facebook-f fa-stack-1x"></i>
						</a>
						</span> <span class="fa-stack fa-lg"> <a
							href="https://twitter.com/"> <i
								class="fas fa-circle fa-stack-2x"></i> <i
								class="fab fa-twitter fa-stack-1x"></i>
						</a>
						</span> <span class="fa-stack fa-lg"> <a
							href="http://plus.google.com"> <i
								class="fas fa-circle fa-stack-2x"></i> <i
								class="fab fa-google-plus-g fa-stack-1x"></i>
						</a>
						</span> <span class="fa-stack fa-lg"> <a
							href="https://www.instagram.com/"> <i
								class="fas fa-circle fa-stack-2x"></i> <i
								class="fab fa-instagram fa-stack-1x"></i>
						</a>
						</span> <span class="fa-stack fa-lg"> <a
							href="https://www.linkedin.com/"> <i
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
						Copyright ?? 2022 <a href="https://www.smhrd.or.kr">Zavazow</a> -
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