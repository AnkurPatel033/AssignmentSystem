<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html class="boxed">

<!-- Mirrored from preview.oklerthemes.com/porto-admin/1.2.0/layouts-boxed.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 18 Oct 2014 05:20:22 GMT -->
<head>

<!-- Basic -->
<meta charset="UTF-8">

<title>AdminSignIn</title>
<meta name="keywords" content="HTML5 Admin Template" />
<meta name="description"
	content="Porto Admin - Responsive HTML5 Template">
<meta name="author" content="okler.net">

<!-- Mobile Metas -->
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />

<!-- Web Fonts  -->
<link
	href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800|Shadows+Into+Light"
	rel="stylesheet" type="text/css">

<!-- Vendor CSS -->
<link rel="stylesheet" href="assets/vendor/bootstrap/css/bootstrap.css" />
<link rel="stylesheet"
	href="assets/vendor/font-awesome/css/font-awesome.css" />
<link rel="stylesheet"
	href="assets/vendor/magnific-popup/magnific-popup.css" />
<link rel="stylesheet"
	href="assets/vendor/bootstrap-datepicker/css/datepicker3.css" />

<!-- Theme CSS -->
<link rel="stylesheet" href="assets/stylesheets/theme.css" />

<!-- Theme Custom CSS -->
<link rel="stylesheet" href="assets/stylesheets/theme-custom.css">

<!-- Head Libs -->
<script src="assets/vendor/modernizr/modernizr.js"></script>
<script src="assets/javascripts/forms/dateTime.js"></script>
</head>
<body onload=display_ct();>
	<section class="body">

		<!-- start: header -->
		<div class="header">
			<h1 class="text-center text-muted mt-md mb-md">Assignment
				Management System</h1>
		</div>
		<!-- end: header -->

		<div class="inner-wrapper">


			<!-- end: sidebar -->

			<section role="main" class="content-body">
				<header class="page-header">
					<ol class="breadcrumbs">
						<li><a href=""><span class="separator"></span> <i
								class="fa ">Date & Time:<span id='ct'></span></i> </a></li>
					</ol>

					<div class="right-wrapper pull-right">
						<ol class="breadcrumbs">
							<li><a href=""> <i class="fa fa-home"></i>
							</a></li>
							<span class="separator"></span>
							<li><a href="SignIn.jsp">Log In</a></li>
							<span class="separator"></span>
							<!-- <li><a href="SignUp.jsp">Sign Up</a></li> -->
							<span class="separator"></span>
							<li></li>
						</ol>

					</div>
				</header>
				</aside>
				<!-- start: page -->
				<section class="body-sign">
					<div class="center-sign">
					<p>${message}</p>
						<div class="panel panel-sign">
							<div class="panel-body">
								<form action="signIn" method="post">
									<div class="form-group mb-lg">
										<label>Email</label>
										<div class="input-group input-group-icon">
											<input name="email" type="email"
												class="form-control input-lg"  required="required"/> <span
												class="input-group-addon"> <span class="icon icon-lg">
													<i class="fa fa-user"></i>
											</span>
											</span>
										</div>
									</div>

									<div class="form-group mb-lg">
										<div class="clearfix">
											<label class="pull-left">Password</label>
										</div>
										<div class="input-group input-group-icon">
											<input name="pwd" type="password"
												class="form-control input-lg"  required="required"/> <span
												class="input-group-addon"> <span class="icon icon-lg">
													<i class="fa fa-lock"></i>
											</span>
											</span>
										</div>
									</div>

									<div class="row">
										<div class="col-sm-8">
											<div class="checkbox-custom checkbox-default">
												<input id="RememberMe" name="rememberme" type="checkbox" />
												<label for="RememberMe">Remember Me</label>
											</div>
										</div>
										<div class="col-sm-4 text-right">
											<button type="submit" class="btn btn-primary hidden-xs">Sign
												In</button>
											<button type="submit"
												class="btn btn-primary btn-block btn-lg visible-xs mt-lg">Sign
												In</button>
										</div>
									</div>


									
								</form>
							</div>
						</div>
				</section>

				<!--End Page-->

			</section>
		</div>
		</div>

		</div>
		<div class="footer ">
			<p class="text-center text-muted mt-md mb-md">© 2019 X-Workz . All Rights Reserved.</p>
		</div>
		</div>
		<!-- Vendor -->
		<script src="assets/vendor/jquery/jquery.js"></script>
		<script
			src="assets/vendor/jquery-browser-mobile/jquery.browser.mobile.js"></script>
		<script src="assets/vendor/jquery-cookie/jquery.cookie.js"></script>
		<script src="assets/vendor/style-switcher/style.switcher.js"></script>
		<script src="assets/vendor/bootstrap/js/bootstrap.js"></script>
		<script src="assets/vendor/nanoscroller/nanoscroller.js"></script>
		<script
			src="assets/vendor/bootstrap-datepicker/js/bootstrap-datepicker.js"></script>
		<script src="assets/vendor/magnific-popup/magnific-popup.js"></script>
		<script src="assets/vendor/jquery-placeholder/jquery.placeholder.js"></script>

		<!-- Specific Page Vendor -->

		<!-- Theme Base, Components and Settings -->
		<script src="assets/javascripts/theme.js"></script>

		<!-- Theme Custom -->
		<script src="assets/javascripts/theme.custom.js"></script>

		<!-- Theme Initialization Files -->
		<script src="assets/javascripts/theme.init.js"></script>
		<!-- Analytics to Track Preview Website -->
		<script>			  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){			  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),			  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)			  })(window,document,'script','../../../www.google-analytics.com/analytics.js','ga');			  ga('create', 'UA-42715764-8', 'auto');			  ga('send', 'pageview');			</script>



	</section>


</body>

<!-- Mirrored from preview.oklerthemes.com/porto-admin/1.2.0/layouts-boxed.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 18 Oct 2014 05:20:22 GMT -->
</html>