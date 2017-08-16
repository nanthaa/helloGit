<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<html>
<head>
<%
Properties pro = new Properties();
FileInputStream in=null;
String path=request.getRealPath("");
try
{
	in = new FileInputStream(path+"\\Files\\Properties\\home.properties");
}
catch(Exception ex)
{
	out.println("<center>Opp's.........lables.properties is missing...!</center>");
	System.out.println(ex);
}
pro.load(in);
%>
<link href="<%=request.getContextPath() %>/Files/CSS/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=request.getContextPath() %>/Files/JS/jquery-1.6.4.min.js"></script>
<script type="text/javascript" src="./fancybox/jquery.fancybox-1.3.4.pack.js"></script>
<link rel="stylesheet" type="text/css" href="./fancybox/jquery.fancybox-1.3.4.css" media="screen" />
<script type="text/javascript">
$(document).ready(function(){
	$("a#example2").fancybox({
		'overlayShow'	: false,
		'transitionIn'	: 'elastic',
		'transitionOut'	: 'elastic'
	});
});
</script>
</head>
<body>

	<img class="banner" src="<%=request.getContextPath()%>/<%=pro.getProperty("Banner") %>"></img>
	
	
	<div class="para1"><h1><%=pro.getProperty("heading1") %></h1>
	<p>
		<%=pro.getProperty("para1") %>
	</p>
	
	<p>
		<%=pro.getProperty("para3") %>
	</p>
</div>
<a id="example2" href="<%=request.getContextPath() %>/Files/JSP/review.jsp" style="position:absolute">Review</a>
</body>
</html>