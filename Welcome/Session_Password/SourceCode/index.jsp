<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<html>
<head>
<%! 
public int convert(String str) 
{ 
	int conv=0; 
	if(str==null) 
	{ 
		str="0"; 
	} 
	else if((str.trim()).equals("null")) 
	{ 
		str="0"; 
	} 
	else if(str.equals("")) 
	{ 
		str="0"; 
	} 
	try
	{ 
		conv=Integer.parseInt(str); 
	} 
	catch(Exception e) 
	{ 
	} 
	return conv; 
	} 
%>
<script type="text/javascript">
function hideMessage()
{
	document.getElementById("message").style.display="none"; 
}
function startTimer() 
{
	var tim = window.setTimeout("hideMessage()", 5000);  // 5000 milliseconds = 5 seconds
}
</script>
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
	out.println("<center>Opp's.........home.properties is missing...!</center>");
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
	$("a#user").fancybox({
		'overlayShow'	: true,
		'transitionIn'	: 'elastic',
		'transitionOut'	: 'elastic'
	});
	$("a#admin").fancybox({
		'overlayShow'	: true,
		'transitionIn'	: 'elastic',
		'transitionOut'	: 'elastic'
	});
	
});
</script>

<%
String type ="";
int no=convert(request.getParameter("no"));
int no1=convert(request.getParameter("no1"));
if(no==1)
{%>
<script type="text/javascript">
$(document).ready(function(){
	$('a#admin').fancybox().trigger('click');
});
</script>
<%}
if(no==10)
{%>
<script type="text/javascript">
$(document).ready(function(){
	$('a#user').fancybox().trigger('click');
});
</script>
<%}
if(no==11)
{%>
<script type="text/javascript">
$(document).ready(function(){
	$('a#user').fancybox().trigger('click');
});
</script>
<%}
if(no==12)
{%>
<script type="text/javascript">
$(document).ready(function(){
	$('a#user4').fancybox().trigger('click');
});
</script>
<%}%>
</head>
<body onload="startTimer()">
	<img class="banner" src="<%=request.getContextPath()%>/<%=pro.getProperty("Banner") %>"></img>

<%if(no==2)
{%>
<script type="text/javascript">
$(document).ready(function(){
	$('a#user4').fancybox().trigger('click');
});
</script>
<%}
if(no==3 || no==4)
{%>
<script type="text/javascript">
$(document).ready(function(){
	$('a#user1').fancybox().trigger('click');
});
</script>
<%}
if(no==5)
{
	no1=convert(request.getParameter("no1"));
	type=request.getParameter("type");
%>
<script type="text/javascript">
$(document).ready(function(){
	$('a#user2').fancybox().trigger('click');
});
</script>
<a id="user2" href="<%=request.getContextPath() %>/Files/JSP/User/register.jsp?no=1&no1=<%=no1 %>&id=<%=request.getAttribute("id") %>&type=<%=type %>"></a>
<%}
if(no==6)
{%>
<script type="text/javascript">
$(document).ready(function(){
	$('a#user3').fancybox().trigger('click');
});
</script>
<a id="user3" href="<%=request.getContextPath() %>/Files/JSP/User/register.jsp?no=5"></a>
<%}%>	
<div class="para1"><h1><%=pro.getProperty("heading1") %></h1>
	<p>
		<%=pro.getProperty("para1") %>
	</p>
	
	<p>
		<%=pro.getProperty("para3") %>
	</p>
</div>

<div class="para2"><h1><%=pro.getProperty("heading2") %></h1>
	<p>
		<%=pro.getProperty("para2") %>
		<img src="<%=request.getContextPath() %>/<%=pro.getProperty("img") %>"></img>
		Rating of colors by the user 
		<img src="<%=request.getContextPath() %>/<%=pro.getProperty("img1") %>"></img>
		<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<img src="<%=request.getContextPath() %>/<%=pro.getProperty("img2") %>"></img>
		<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<img src="<%=request.getContextPath() %>/<%=pro.getProperty("img3") %>"></img>
		<img src="<%=request.getContextPath() %>/<%=pro.getProperty("img4") %>"></img>
	</p>
</div>	
<a id="user4" href="<%=request.getContextPath() %>/Files/JSP/User/validation.jsp?no=<%=no %>"></a>
<a id="user1" href="<%=request.getContextPath() %>/Files/JSP/User/register.jsp?no=<%=no %>"></a>
<a id="user" href="<%=request.getContextPath() %>/Files/JSP/User/login.jsp?no=<%=no %>" style="position:absolute;left:350px"><h3><%=pro.getProperty("ULogin") %></h3></a>
<a id="admin" href="<%=request.getContextPath() %>/Files/JSP/Admin/login.jsp?no=<%=no %>" style="position:absolute;left:200px"><h3><%=pro.getProperty("ALogin") %></h3></a>	
</body>

</html>