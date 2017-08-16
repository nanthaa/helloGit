package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
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

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function hideMessage()\r\n");
      out.write("{\r\n");
      out.write("\tdocument.getElementById(\"message\").style.display=\"none\"; \r\n");
      out.write("}\r\n");
      out.write("function startTimer() \r\n");
      out.write("{\r\n");
      out.write("\tvar tim = window.setTimeout(\"hideMessage()\", 5000);  // 5000 milliseconds = 5 seconds\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");

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

      out.write("\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/CSS/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/Files/JS/jquery-1.6.4.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./fancybox/jquery.fancybox-1.3.4.pack.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./fancybox/jquery.fancybox-1.3.4.css\" media=\"screen\" />\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$(\"a#user\").fancybox({\r\n");
      out.write("\t\t'overlayShow'\t: true,\r\n");
      out.write("\t\t'transitionIn'\t: 'elastic',\r\n");
      out.write("\t\t'transitionOut'\t: 'elastic'\r\n");
      out.write("\t});\r\n");
      out.write("\t$(\"a#admin\").fancybox({\r\n");
      out.write("\t\t'overlayShow'\t: true,\r\n");
      out.write("\t\t'transitionIn'\t: 'elastic',\r\n");
      out.write("\t\t'transitionOut'\t: 'elastic'\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");

String type ="";
int no=convert(request.getParameter("no"));
int no1=convert(request.getParameter("no1"));
if(no==1)
{
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$('a#admin').fancybox().trigger('click');\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
}
if(no==10)
{
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$('a#user').fancybox().trigger('click');\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
}
if(no==11)
{
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$('a#user').fancybox().trigger('click');\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
}
if(no==12)
{
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$('a#user4').fancybox().trigger('click');\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
}
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"startTimer()\">\r\n");
      out.write("\t<img class=\"banner\" src=\"");
      out.print(request.getContextPath());
      out.write('/');
      out.print(pro.getProperty("Banner") );
      out.write("\"></img>\r\n");
      out.write("\r\n");
if(no==2)
{
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$('a#user4').fancybox().trigger('click');\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
}
if(no==3 || no==4)
{
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$('a#user1').fancybox().trigger('click');\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
}
if(no==5)
{
	no1=convert(request.getParameter("no1"));
	type=request.getParameter("type");

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$('a#user2').fancybox().trigger('click');\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<a id=\"user2\" href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/JSP/User/register.jsp?no=1&no1=");
      out.print(no1 );
      out.write("&id=");
      out.print(request.getAttribute("id") );
      out.write("&type=");
      out.print(type );
      out.write("\"></a>\r\n");
}
if(no==6)
{
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$('a#user3').fancybox().trigger('click');\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<a id=\"user3\" href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/JSP/User/register.jsp?no=5\"></a>\r\n");
}
      out.write("\t\r\n");
      out.write("<div class=\"para1\"><h1>");
      out.print(pro.getProperty("heading1") );
      out.write("</h1>\r\n");
      out.write("\t<p>\r\n");
      out.write("\t\t");
      out.print(pro.getProperty("para1") );
      out.write("\r\n");
      out.write("\t</p>\r\n");
      out.write("\t\r\n");
      out.write("\t<p>\r\n");
      out.write("\t\t");
      out.print(pro.getProperty("para3") );
      out.write("\r\n");
      out.write("\t</p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"para2\"><h1>");
      out.print(pro.getProperty("heading2") );
      out.write("</h1>\r\n");
      out.write("\t<p>\r\n");
      out.write("\t\t");
      out.print(pro.getProperty("para2") );
      out.write("\r\n");
      out.write("\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write('/');
      out.print(pro.getProperty("img") );
      out.write("\"></img>\r\n");
      out.write("\t\tRating of colors by the user \r\n");
      out.write("\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write('/');
      out.print(pro.getProperty("img1") );
      out.write("\"></img>\r\n");
      out.write("\t\t<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write('/');
      out.print(pro.getProperty("img2") );
      out.write("\"></img>\r\n");
      out.write("\t\t<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write('/');
      out.print(pro.getProperty("img3") );
      out.write("\"></img>\r\n");
      out.write("\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write('/');
      out.print(pro.getProperty("img4") );
      out.write("\"></img>\r\n");
      out.write("\t</p>\r\n");
      out.write("</div>\t\r\n");
      out.write("<a id=\"user4\" href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/JSP/User/validation.jsp?no=");
      out.print(no );
      out.write("\"></a>\r\n");
      out.write("<a id=\"user1\" href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/JSP/User/register.jsp?no=");
      out.print(no );
      out.write("\"></a>\r\n");
      out.write("<a id=\"user\" href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/JSP/User/login.jsp?no=");
      out.print(no );
      out.write("\" style=\"position:absolute;left:350px\"><h3>");
      out.print(pro.getProperty("ULogin") );
      out.write("</h3></a>\r\n");
      out.write("<a id=\"admin\" href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/JSP/Admin/login.jsp?no=");
      out.print(no );
      out.write("\" style=\"position:absolute;left:200px\"><h3>");
      out.print(pro.getProperty("ALogin") );
      out.write("</h3></a>\t\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
