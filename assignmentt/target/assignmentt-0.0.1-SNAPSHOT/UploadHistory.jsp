<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html class="boxed">
	
<!-- Mirrored from preview.oklerthemes.com/porto-admin/1.2.0/layouts-boxed.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 18 Oct 2014 05:20:22 GMT -->
<head>

		<!-- Basic -->
		<meta charset="UTF-8">

		<title>Upload History</title>
		<meta name="keywords" content="HTML5 Admin Template" />
		<meta name="description" content="Porto Admin - Responsive HTML5 Template">
		<meta name="author" content="okler.net">

		<!-- Mobile Metas -->
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />

		<!-- Web Fonts  -->
		<link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800|Shadows+Into+Light" rel="stylesheet" type="text/css">

		<!-- Vendor CSS -->
		<link rel="stylesheet" href="assets/vendor/bootstrap/css/bootstrap.css" />
		<link rel="stylesheet" href="assets/vendor/font-awesome/css/font-awesome.css" />
		<link rel="stylesheet" href="assets/vendor/magnific-popup/magnific-popup.css" />
		<link rel="stylesheet" href="assets/vendor/bootstrap-datepicker/css/datepicker3.css" />

		<!-- Theme CSS -->
		<link rel="stylesheet" href="assets/stylesheets/theme.css" />

		<!-- Theme Custom CSS -->
		<link rel="stylesheet" href="assets/stylesheets/theme-custom.css">

		<!-- Head Libs -->
		<script src="assets/vendor/modernizr/modernizr.js"></script>

	</head>
	<body>
		<section class="body">

		<!-- start: header -->
		<!-- start: header -->
		<div class="header">
				<h1 class="text-center text-muted mt-md mb-md">Assignment Management System</h1>
				<div class="visible-xs toggle-sidebar-left" data-toggle-class="sidebar-left-opened" data-target="html" data-fire-event="sidebar-left-opened">
					<i class="fa fa-bars" aria-label="Toggle sidebar"></i>
				</div>
				</div>
			<!-- end: header -->
	
		<!-- end: header -->

			<div class="inner-wrapper">
				<aside id="sidebar-left" class="sidebar-left">
			
					<div class="sidebar-header">
						<div class="sidebar-title">
							Assignments
						</div>
						<div class="sidebar-toggle hidden-xs" data-toggle-class="sidebar-left-collapsed" data-target="html" data-fire-event="sidebar-left-toggle">
							<i class="fa fa-bars" aria-label="Toggle sidebar"></i>
						</div>
					</div>
				
					<div class="nano">
						<div class="nano-content">
							<nav id="menu" class="nav-main" role="navigation">
								<ul class="nav nav-main">
									<li>
										<a href="ChangeSetting.jsp">
											<i class="fa fa-home" aria-hidden="true"></i>
											<span>Change Setting</span>
										</a>
									</li>
								
									<li>
										<a href="CreateAssignment.jsp">
											<i class="fa fa-copy" aria-hidden="true"></i>
											<span>Create Assignment</span>
										</a>
										
									</li>
									<li>
											<a href="Assignis.jsp">
												<i class="fa fa-list-alt" aria-hidden="true"></i>
												<span>Assignis</span>
											</a>
											
										</li>
										<li>
												<a href="Search.jsp">
													<i class="fa fa-search" aria-hidden="true"></i>
													<span>Search</span>
												</a>
												
											</li>
											<li>
												<a href="UploadHistory.jsp">
													<i class="fa fa-tasks" aria-hidden="true"></i>
													<span>Uploaded History</span>
												</a>
												
											</li>
								
								</ul>
							</nav>			
						</div>
				
					</div>
				
				</aside>
				<!-- end: sidebar -->
				</aside>
				<!-- end: sidebar -->

				<section role="main" class="content-body">
					<header class="page-header">
						<h2 align="center ">Uploaded Assigment </h2>
					
						<div class="right-wrapper pull-right">
							<ol class="breadcrumbs">
								<li>
									<a href="">
										<i class=""></i>
									</a>
								</li>
							
								<li><a class="fa fa-use">Welcome, ${sessionScope.userEntity.fname}</a></li>
								<span class="separator"></span>
								<li><a class="fa fa-power-off" href="signOut"> LogOut</a></li>
							
								<li></li>
							</ol>
				
						</div>
					</header>

					<!-- start: page -->
									<!-- start: page -->
					<section class="panel">
							<header class="panel-heading">
								<div class="panel-actions">
									
								</div>
						
								<h2 class="panel-title">Uploaded History</h2>
							</header>
							<div class="panel-body">
								<div id="datatable-ajax_wrapper" class="dataTables_wrapper no-footer"><div class="row datatables-header form-inline"><div class="col-sm-12 col-md-6"><div class="dataTables_length" id="datatable-ajax_length"><label><select name="datatable-ajax_length" aria-controls="datatable-ajax" class=""><option value="10">10</option><option value="25">25</option><option value="50">50</option><option value="100">100</option></select> records per page</label></div></div><div class="col-sm-12 col-md-6"><div id="datatable-ajax_filter" class="dataTables_filter"><label><input type="search" class="" placeholder="" aria-controls="datatable-ajax"></label></div></div><div id="datatable-ajax_processing" class="dataTables_processing" style="display: none;"><i class="fa fa-spinner fa-spin"></i> Loading</div></div><div class="table-responsive"><table class="table table-bordered table-striped dataTable no-footer" id="datatable-ajax" data-url="assets/ajax/ajax-datatables-sample.json" role="grid" aria-describedby="datatable-ajax_info">
									<thead>
										<tr role="row"><th width="20%" class="sorting_asc" tabindex="0" aria-controls="datatable-ajax" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Rendering engine: activate to sort column ascending" style="width: 157px;">Rendering engine</th><th width="25%" class="sorting" tabindex="0" aria-controls="datatable-ajax" rowspan="1" colspan="1" aria-label="Browser: activate to sort column ascending" style="width: 204px;">Browser</th><th width="25%" class="sorting" tabindex="0" aria-controls="datatable-ajax" rowspan="1" colspan="1" aria-label="Platform(s): activate to sort column ascending" style="width: 204px;">Platform(s)</th><th width="15%" class="sorting" tabindex="0" aria-controls="datatable-ajax" rowspan="1" colspan="1" aria-label="Engine version: activate to sort column ascending" style="width: 109px;">Engine version</th><th width="15%" class="sorting" tabindex="0" aria-controls="datatable-ajax" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending" style="width: 109px;">CSS grade</th></tr>
									</thead>
									<tbody>
									<tr class="odd"><td valign="top" colspan="5" class="dataTables_empty">No data available in table</td></tr></tbody>
								</table></div><div class="row datatables-footer"><div class="col-sm-12 col-md-6"><div class="dataTables_info" id="datatable-ajax_info" role="status" aria-live="polite">Showing 0 to 0 of 0 entries</div></div><div class="col-sm-12 col-md-6"><div class="dataTables_paginate paging_bs_normal" id="datatable-ajax_paginate"><ul class="pagination"><li class="prev disabled"><a href="#"><span class="fa fa-chevron-left"></span></a></li><li class="next disabled"><a href="#"><span class="fa fa-chevron-right"></span></a></li></ul></div></div></div></div>
							</div>
						</section>
					<!-- end: page -->
					
					
					<div><div class="footer">
							<p class="text-center text-muted mt-md mb-md">© 2019 X-Workz . All Rights Reserved.</p>
							</div></div>
					<!--End Page-->
					
				</section>
			<!--<div class="footer">
					<p class="text-center text-muted mt-md mb-md">Â© Copyright 2019. All Rights Reserved.</p>
					</div> -->
			</div>
			</div>
			
			</div>
			<!-- start: sidebar -->
			
	</div>
	
	
	

</div>



			<!-- Vendor -->
			<script src="assets/vendor/jquery/jquery.js"></script>			<script src="assets/vendor/jquery-browser-mobile/jquery.browser.mobile.js"></script>			<script src="assets/vendor/jquery-cookie/jquery.cookie.js"></script>			<script src="assets/vendor/style-switcher/style.switcher.js"></script>			<script src="assets/vendor/bootstrap/js/bootstrap.js"></script>			<script src="assets/vendor/nanoscroller/nanoscroller.js"></script>			<script src="assets/vendor/bootstrap-datepicker/js/bootstrap-datepicker.js"></script>			<script src="assets/vendor/magnific-popup/magnific-popup.js"></script>			<script src="assets/vendor/jquery-placeholder/jquery.placeholder.js"></script>
			
			<!-- Specific Page Vendor -->
			
			<!-- Theme Base, Components and Settings -->
			<script src="assets/javascripts/theme.js"></script>
			
			<!-- Theme Custom -->
			<script src="assets/javascripts/theme.custom.js"></script>
			
			<!-- Theme Initialization Files -->
			<script src="assets/javascripts/theme.init.js"></script>
			<!-- Analytics to Track Preview Website -->			<script>			  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){			  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),			  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)			  })(window,document,'script','../../../www.google-analytics.com/analytics.js','ga');			  ga('create', 'UA-42715764-8', 'auto');			  ga('send', 'pageview');			</script>
		</section>
	</body>

<!-- Mirrored from preview.oklerthemes.com/porto-admin/1.2.0/layouts-boxed.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 18 Oct 2014 05:20:22 GMT -->
</html>