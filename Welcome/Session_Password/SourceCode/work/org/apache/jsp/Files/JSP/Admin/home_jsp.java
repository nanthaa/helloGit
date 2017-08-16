package org.apache.jsp.Files.JSP.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\r\n");
      out.write("iframe \r\n");
      out.write("{\r\n");
      out.write("\tmargin-top: 20px;\r\n");
      out.write(" \t margin-bottom: 30px;\r\n");
      out.write("\tpadding:20px;\r\n");
      out.write("\t\t\r\n");
      out.write("\tscrollbar-base-color: red;\r\n");
      out.write("\tscrollbar-arrow-color: red;\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("  -moz-border-radius: 42px;\r\n");
      out.write("  -webkit-border-radius: 42px; \r\n");
      out.write("  border-radius: 42px; \r\n");
      out.write("\r\n");
      out.write("  -moz-box-shadow: 0px 0px 104px #000; \r\n");
      out.write("  -webkit-box-shadow: 0px 0px 104px #000; \r\n");
      out.write("  box-shadow: 0px 0px 104px #000; \r\n");
      out.write("\r\n");
      out.write("  -moz-transform:rotate(0.1deg);\r\n");
      out.write("  -webkit-transform:rotate(0.1deg);\r\n");
      out.write("  -o-transform:rotate(0.1deg);\r\n");
      out.write("  -ms-transform:rotate(0.1deg);\r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script language=\"JavaScript\">\r\n");
      out.write("<!--\r\n");
      out.write("  javascript:window.history.forward(-1);\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
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

String id=session.getAttribute("admin").toString();
Properties pro = new Properties();
Properties pro1 = new Properties();
FileInputStream in=null;FileInputStream in1=null;
String path=request.getRealPath("");
try
{
	in = new FileInputStream(path+"\\Files\\Properties\\home.properties");
	in1 = new FileInputStream(path+"\\Files\\Properties\\lables.properties");
} 
catch(Exception ex)
{
	out.println("<center>Opp's.........lables.properties is missing...!</center>");
	System.out.println(ex);
}
pro.load(in);
pro1.load(in1);

      out.write("\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/CSS/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/CSS/button.css\" type=\"text/css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<img class=\"banner\" src=\"");
      out.print(request.getContextPath());
      out.write('/');
      out.print(pro.getProperty("Banner") );
      out.write("\"></img>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<div class=\"welcome\">\r\n");
      out.write("\tWelcome [");
      out.print(id );
      out.write("]\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<p id=\"effect\" class=\"panel\">\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;<a class=\"gradientbuttons\" href=\"");
      out.print(request.getContextPath() );
      out.write("/GetImages\" target=\"afrm\">");
      out.print(pro1.getProperty("Menu0_A") );
      out.write("<img border=\"0\" src=\"");
      out.print(request.getContextPath() );
      out.write("/Files/Images/ball.png\" title=\"");
      out.print(pro1.getProperty("Menu0_Text_A") );
      out.write("\"/></a><br></br>\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;<a class=\"gradientbuttons\" href=\"");
      out.print(request.getContextPath() );
      out.write("/GetProfile?id=");
      out.print(id );
      out.write("\" target=\"afrm\">");
      out.print(pro1.getProperty("Menu1_A") );
      out.write("<img border=\"0\" src=\"");
      out.print(request.getContextPath() );
      out.write("/Files/Images/ball.png\" title=\"");
      out.print(pro1.getProperty("Menu1_Text_A") );
      out.write("\"/></a><br></br>\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;<a class=\"gradientbuttons\" href=\"");
      out.print(request.getContextPath() );
      out.write("/EditProfile?id=");
      out.print(id );
      out.write("\" target=\"afrm\">");
      out.print(pro1.getProperty("Menu2_A") );
      out.write("<img border=\"0\" src=\"");
      out.print(request.getContextPath() );
      out.write("/Files/Images/ball.png\" title=\"");
      out.print(pro1.getProperty("Menu2_Text_A") );
      out.write("\"/></a><br></br>\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;<a class=\"gradientbuttons\" href=\"");
      out.print(request.getContextPath() );
      out.write("/ChangePassword?id=");
      out.print(id );
      out.write("\" target=\"afrm\">");
      out.print(pro1.getProperty("Menu3_A") );
      out.write("<img border=\"0\" src=\"");
      out.print(request.getContextPath() );
      out.write("/Files/Images/ball.png\" title=\"");
      out.print(pro1.getProperty("Menu3_Text_A") );
      out.write("\"/></a><br></br>\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;<a class=\"gradientbuttons\" href=\"");
      out.print(request.getContextPath() );
      out.write("/UserList?id=");
      out.print(id );
      out.write("\" target=\"afrm\">");
      out.print(pro1.getProperty("Menu5_A") );
      out.write("<img border=\"0\" src=\"");
      out.print(request.getContextPath() );
      out.write("/Files/Images/ball.png\" title=\"");
      out.print(pro1.getProperty("Menu5_Text_A") );
      out.write("\"/></a><br></br>\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;<a class=\"gradientbuttons\" href=\"");
      out.print(request.getContextPath() );
      out.write("/UserList?id=");
      out.print(id );
      out.write("\" target=\"afrm\">");
      out.print(pro1.getProperty("Menu6_A") );
      out.write("<img border=\"0\" src=\"");
      out.print(request.getContextPath() );
      out.write("/Files/Images/ball.png\" title=\"");
      out.print(pro1.getProperty("Menu6_Text_A") );
      out.write("\"/></a><br></br>\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;<a class=\"gradientbuttons\" href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/JSP/Admin/logout.jsp\">");
      out.print(pro1.getProperty("Menu4_A") );
      out.write("<img border=\"0\" src=\"");
      out.print(request.getContextPath() );
      out.write("/Files/Images/ball.png\" title=\"");
      out.print(pro1.getProperty("Menu4_Text_A") );
      out.write("\"/></a><br></br>\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div style=\"position:absolute;top:140px;left:210px;\">\r\n");
      out.write("<iframe frameborder=\"0\" scrolling=\"auto\" name=\"afrm\" height=\"470\" width=\"750\"></iframe>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
