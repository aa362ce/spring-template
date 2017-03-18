<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="Ashish Bhatt">
	<title>Spring Template</title>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<link rel='stylesheet' href='<%= org.webjars.AssetLocator.getWebJarPath("css/bootstrap.min.css") %>' type="text/css"/>
	<link rel='stylesheet' href='<%= org.webjars.AssetLocator.getWebJarPath("css/tether.min.css") %>' type="text/css">
    <link rel='stylesheet' href="<c:url value="/resources/assets/css/ie10-viewport-bug-workaround.css" />" type="text/css" />
	<link rel='stylesheet' href="<c:url value="/resources/assets/css/cover.css" />"  type="text/css" />	
	<link rel="icon" href="<c:url value="/resources/favicon.ico" />" type="image/x-icon">
</head>
<body>
    <div class="site-wrapper">

      <div class="site-wrapper-inner">

        <div class="cover-container">
			<nav class="navbar navbar-default" style="margin:0px;background-color:#000">
				<div class="container-fluid" >
					<div class="navbar-header">
						<a class="navbar-brand" href="#">My Website</a>
					</div>
					<span class="pull-right" style="padding:15px"><a href="#">logout</a></span>
				</div>
			</nav>
			
			<!-- main container for tabs and right menu -->
			<div class="container-fluid">
				<div>
					<ul class="nav nav-tabs">
						<li class="active"><a href="#">Home</a></li>
						<li><a href="#">Menu 1</a></li>
						<li><a href="#">Menu 2</a></li>
						<li><a href="#">Menu 3</a></li>
					</ul>
				</div>
				<div class="cover" style="background-color:#fff">
				hello
				</div>
			</div>
			<!-- End of main container -->
		
		  <!-- footer begins -->
          <div class="mastfoot">
            <div class="inner">
              <p>spring template <a href="http://spring.io">spring</a></p>
            </div>
          </div>
          <!-- end of footer -->
          
        </div>

      </div>

    </div>
    <script type='text/javascript' src='<%= org.webjars.AssetLocator.getWebJarPath("jquery.min.js") %>'></script>
    <script type='text/javascript' src='<%= org.webjars.AssetLocator.getWebJarPath("js/tether.min.js") %>'></script>
    <script type='text/javascript' src='<%= org.webjars.AssetLocator.getWebJarPath("js/bootstrap.min.js") %>'></script>
    <script type='text/javascript' src='<%= org.webjars.AssetLocator.getWebJarPath("angular.min.js") %>'></script>
    <script type='text/javascript' src='<%= org.webjars.AssetLocator.getWebJarPath("angular-route.min.js") %>'></script>
    <script type='text/javascript' src="<c:url value="/resources/assets/js/ie-emulation-modes-warning.js" />" ></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script type='text/javascript' src="<c:url value="/resources/assets/js/ie10-viewport-bug-workaround.js" />" ></script>
</body>
</html>