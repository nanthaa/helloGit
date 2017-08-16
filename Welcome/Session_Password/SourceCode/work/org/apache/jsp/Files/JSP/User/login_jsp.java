package org.apache.jsp.Files.JSP.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;
import com.nitin.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");

Properties pro = new Properties();
FileInputStream in=null;
String path=request.getRealPath("");
try
{
	in = new FileInputStream(path+"\\Files\\Properties\\lables.properties");
}
catch(Exception ex)
{
	out.println("<center>Opp's.........lables.properties is missing...!</center>");
	System.out.println(ex);
}
pro.load(in);

      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("#login\r\n");
      out.write("{\r\n");
      out.write("\t\r\n");
      out.write("\tbackground:-moz-linear-gradient(linear, 40% 20%, 50% 150%, from(#D1DDFA), to(#1B5AEF));\r\n");
      out.write("    background:-webkit-gradient(linear, 40% 20%, 50% 150%, from(#D1DDFA), to(#1B5AEF));\r\n");
      out.write("\tborder:50px solid #eee;\r\n");
      out.write("\twidth:350px;\r\n");
      out.write("\t-moz-border-radius:5px;\r\n");
      out.write("\t-webkit-border-radius:5px;\r\n");
      out.write("\tborder-radius:5px;\r\n");
      out.write("\t-moz-box-shadow:0 0 10px #4e707c;\r\n");
      out.write("\t-webkit-box-shadow:0 0 10px #4e707c;\r\n");
      out.write("\tbox-shadow:0 0 10px #4e707c;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("\t}\r\n");
      out.write("\t#login a, #login a:visited{color:#0283b2;}\r\n");
      out.write("\t#login a:hover{color:#111;}\r\n");
      out.write("\t#login h1{\r\n");
      out.write("\tbackground:-moz-linear-gradient(linear, 40% 20%, 50% 150%, from(#D1DDFA), to(#1B5AEF));\r\n");
      out.write("    background:-webkit-gradient(linear, 40% 20%, 50% 150%, from(#D1DDFA), to(#1B5AEF));\r\n");
      out.write("\tcolor:#5BACC4;\r\n");
      out.write("\ttext-shadow:#007dab 0 1px 0;\r\n");
      out.write("\tfont-size:14px;\r\n");
      out.write("\tpadding:18px 23px;\r\n");
      out.write("\tmargin:0 0 1.5em 0;\r\n");
      out.write("\tborder-bottom:1px solid #007dab;\r\n");
      out.write("\t}\r\n");
      out.write("\t#login .field{\r\n");
      out.write("\tborder:10px solid #585858;\r\n");
      out.write("\tcolor:white;\r\n");
      out.write("\twidth:180px;\r\n");
      out.write("\tfont-size:12px;\r\n");
      out.write("\tline-height:1.5em;\r\n");
      out.write("\tpadding:4px;\r\n");
      out.write("\t-moz-box-shadow:inset 0 0 5px #ccc;\r\n");
      out.write("\t-webkit-box-shadow:inset 0 0 5px #ccc;\r\n");
      out.write("\tbox-shadow:inset 0 0 50px #000000;\r\n");
      out.write("\t}\t\r\n");
      out.write("\t#login div.submit label{float:none;display:inline;font-size:11px;}\r\n");
      out.write("\t#login button{\r\n");
      out.write("\tborder:0;\r\n");
      out.write("\tpadding:0 30px;\r\n");
      out.write("\theight:30px;\r\n");
      out.write("\tline-height:30px;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tfont-size:12px;\r\n");
      out.write("\tcolor:#fff;\r\n");
      out.write("\ttext-shadow:#007dab 0 1px 0;\r\n");
      out.write("\tbackground:-moz-linear-gradient(linear, 40% 20%, 50% 150%, from(#D1DDFA), to(#1B5AEF));\r\n");
      out.write("    background:-webkit-gradient(linear, 40% 20%, 50% 150%, from(#D1DDFA), to(#1B5AEF));\r\n");
      out.write("\t-moz-border-radius:50px;\r\n");
      out.write("\t-webkit-border-radius:50px;\r\n");
      out.write("\tborder-radius:50px;\r\n");
      out.write("\tcursor:pointer;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");

int no=convert(request.getParameter("no"));
if(no==10)
{
      out.write("\r\n");
      out.write("\t<div class=\"downarrowdiv\" id=\"message\">\r\n");
      out.write("\t\t<p>");
      out.print(pro.getProperty("Invalid") );
      out.write("</p>\r\n");
      out.write("\t</div>\r\n");

Vector v=GetImages.getImages("");
Vector v1=new Vector();
for(int i=0;i<5;i++)
{
	
      out.write("\r\n");
      out.write("\t  \t&nbsp;&nbsp;<img height=\"50\" width=\"50\" src=\"");
      out.print(request.getContextPath() );
      out.write("/Files/Visual/");
      out.print(v.get(i) );
      out.write("\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t");
v1.add(v.get(i));
}
      out.write("\r\n");
      out.write("<body onload=\"startTimer()\">\r\n");
      out.write("\t<form name=\"f1\" id=\"login\" method=\"post\" action=\"");
      out.print(request.getContextPath() );
      out.write("/UserLogin\"> \r\n");
      out.write("\t    <h1>");
      out.print(pro.getProperty("LoginHeader_U") );
      out.write("</h1>\r\n");
      out.write("    \t<div>\r\n");
      out.write("    \t\t");
      out.print(pro.getProperty("T1_U") );
      out.write("\r\n");
      out.write("    \t\t<input type=\"text\" name=\"username\" id=\"login_username\" required=\"yes\"  />\r\n");
      out.write("    \t\t<input type=\"hidden\" name=\"no\" value=\"2\"/>\r\n");
      out.write("    \t</div>\t\t\t\r\n");
      out.write("\t    <div>\r\n");
      out.write("    \t\t");
      out.print(pro.getProperty("T2_U") );
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("    \t\t<input type=\"password\" name=\"password\" id=\"login_password\" required=\"yes\"  /><br>\r\n");
      out.write("    \t\t");
      out.print(pro.getProperty("T3_U") );
      out.write("\r\n");
      out.write("    \t\t<input type=\"text\" name=\"code\" id=\"login_username\" required=\"yes\"  />\r\n");
      out.write("    \t</div>\t\t\t\r\n");
      out.write("\t\t<p class=\"forgot\">");
      out.print(pro.getProperty("SignUp") );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath() );
      out.write("/UserLogin?no=1\">\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(pro.getProperty("SignUpLink") );
      out.write("</a></p>\r\n");
      out.write("    \t\r\n");
      out.write("    \t<div class=\"submit\">\r\n");
      out.write("        \t<button type=\"submit\">");
      out.print(pro.getProperty("Submit") );
      out.write("</button>   \r\n");
      out.write("\t\t    <label>\r\n");
      out.write("        \t\t<input type=\"checkbox\" name=\"remember\" id=\"login_remember\" value=\"yes\" />\r\n");
      out.write("\t           ");
      out.print(pro.getProperty("Remember") );
      out.write("\r\n");
      out.write("        \t</label>   \r\n");
      out.write("    \t</div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
session.setAttribute("v",v1);
}
else if(no==11)
{
      out.write("\r\n");
      out.write("\t<div class=\"downarrowdiv\" id=\"message\">\r\n");
      out.write("\t\t<p>");
      out.print(pro.getProperty("InvalidCode") );
      out.write("</p>\r\n");
      out.write("\t</div>\r\n");

Vector v=GetImages.getImages("");
Vector v1=new Vector();
for(int i=0;i<5;i++)
{
	
      out.write("\r\n");
      out.write("\t  \t&nbsp;&nbsp;<img height=\"50\" width=\"50\" src=\"");
      out.print(request.getContextPath() );
      out.write("/Files/Visual/");
      out.print(v.get(i) );
      out.write("\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t");
v1.add(v.get(i));
}
      out.write("\r\n");
      out.write("<body onload=\"startTimer()\">\r\n");
      out.write("\t<form name=\"f1\" id=\"login\" method=\"post\" action=\"");
      out.print(request.getContextPath() );
      out.write("/UserLogin\"> \r\n");
      out.write("\t    <h1>");
      out.print(pro.getProperty("LoginHeader_U") );
      out.write("</h1>\r\n");
      out.write("    \t<div>\r\n");
      out.write("    \t\t");
      out.print(pro.getProperty("T1_U") );
      out.write("\r\n");
      out.write("    \t\t<input type=\"text\" name=\"username\" id=\"login_username\" required=\"yes\"  />\r\n");
      out.write("    \t\t<input type=\"hidden\" name=\"no\" value=\"2\"/>\r\n");
      out.write("    \t</div>\t\t\t\r\n");
      out.write("\t    <div>\r\n");
      out.write("    \t\t");
      out.print(pro.getProperty("T2_U") );
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("    \t\t<input type=\"password\" name=\"password\" id=\"login_password\" required=\"yes\"  /><br>\r\n");
      out.write("    \t\t");
      out.print(pro.getProperty("T3_U") );
      out.write("\r\n");
      out.write("    \t\t<input type=\"text\" name=\"code\" id=\"login_username\" required=\"yes\"  />\r\n");
      out.write("    \t</div>\t\t\t\r\n");
      out.write("\t\t<p class=\"forgot\">");
      out.print(pro.getProperty("SignUp") );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath() );
      out.write("/UserLogin?no=1\">\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(pro.getProperty("SignUpLink") );
      out.write("</a></p>\r\n");
      out.write("    \t\r\n");
      out.write("    \t<div class=\"submit\">\r\n");
      out.write("        \t<button type=\"submit\">");
      out.print(pro.getProperty("Submit") );
      out.write("</button>   \r\n");
      out.write("\t\t    <label>\r\n");
      out.write("        \t\t<input type=\"checkbox\" name=\"remember\" id=\"login_remember\" value=\"yes\" />\r\n");
      out.write("\t           ");
      out.print(pro.getProperty("Remember") );
      out.write("\r\n");
      out.write("        \t</label>   \r\n");
      out.write("    \t</div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
session.setAttribute("v",v1);
}
else
{
      out.write("\r\n");
      out.write("<body onload=\"startTimer()\">\r\n");
      out.write("\t<form name=\"f1\" id=\"login\" method=\"post\" action=\"");
      out.print(request.getContextPath() );
      out.write("/UserLogin\"> \r\n");
      out.write("\t    <h1>");
      out.print(pro.getProperty("LoginHeader_U") );
      out.write("</h1>\r\n");
      out.write("    \t<div>\r\n");
      out.write("    \t\t");
      out.print(pro.getProperty("T1_U") );
      out.write("\r\n");
      out.write("    \t\t<input type=\"text\" name=\"username\" id=\"login_username\" required=\"yes\"  />\r\n");
      out.write("    \t\t<input type=\"hidden\" name=\"no\" value=\"0\"/>\r\n");
      out.write("    \t</div>\t\t\t\r\n");
      out.write("\t    <div>\r\n");
      out.write("    \t\t");
      out.print(pro.getProperty("T2_U") );
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("    \t\t<input type=\"password\" name=\"password\" id=\"login_password\" required=\"yes\"  />\r\n");
      out.write("    \t</div>\t\t\t\r\n");
      out.write("\t\t<p class=\"forgot\">");
      out.print(pro.getProperty("SignUp") );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath() );
      out.write("/UserLogin?no=1\">\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(pro.getProperty("SignUpLink") );
      out.write("</a></p>\r\n");
      out.write("    \t\r\n");
      out.write("    \t<div class=\"submit\">\r\n");
      out.write("        \t<button type=\"submit\">");
      out.print(pro.getProperty("Submit") );
      out.write("</button>   \r\n");
      out.write("\t\t    <label>\r\n");
      out.write("        \t\t<input type=\"checkbox\" name=\"remember\" id=\"login_remember\" value=\"yes\" />\r\n");
      out.write("\t           ");
      out.print(pro.getProperty("Remember") );
      out.write("\r\n");
      out.write("        \t</label>   \r\n");
      out.write("    \t</div>\r\n");
      out.write("</form>\r\n");
} 
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
