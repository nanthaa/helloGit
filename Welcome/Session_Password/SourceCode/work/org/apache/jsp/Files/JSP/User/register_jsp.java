package org.apache.jsp.Files.JSP.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.nitin.util.*;
import java.io.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
	in = new FileInputStream(path+"\\Files\\Properties\\register.properties");
}
catch(Exception ex)
{
	out.println("<center>Opp's.........lables.properties is missing...!</center>");
	System.out.println(ex);
}
pro.load(in);

      out.write("\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/CSS/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");

int no=convert(request.getParameter("no"));
int no1=convert(request.getParameter("no1"));
if(no==1)
{
	
      out.write(" <form action=\"");
      out.print(request.getContextPath() );
      out.write("/StoreImage\">");

	String id=request.getParameter("id");
	String type=request.getParameter("type");
	Vector v=new Vector();
	if(type.equalsIgnoreCase("color"))
		v=GetImages.getImages();
	else
		v=GetImages.getImages(id);
	Vector v1=new Vector();
	for(int i=0;i<no1;i++)
	{
		
      out.write("<img height=\"100\" width=\"100\" src=\"");
      out.print(request.getContextPath() );
      out.write("/Files/Pimages/");
      out.print(v.get(i) );
      out.write("\">&nbsp;&nbsp;&nbsp;\t\r\n");
      out.write("\t\t");
v1.add(v.get(i));
	}
	for(int i=0;i<v1.size();i++)
	{
		System.out.println("======================= > :"+v1.get(i));
	}
	
      out.write("<br>");

	for(int i=0;i<no1;i++)
	{
		
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t \t<input type=\"text\" name=\"i");
      out.print(i );
      out.write("\" size=\"1\">\r\n");
      out.write("\t \t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t");

	}
	session.setAttribute("v",v1);
	
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print(id );
      out.write("\"></input>\r\n");
      out.write("\t<input type=\"submit\"></input>\r\n");
      out.write("</form>\r\n");
}

else if(no==5)
{
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print(pro.getProperty("SuccessMSG") );
      out.write('\r');
      out.write('\n');
}
else
{
	if(no==4)
	{
      out.write("\r\n");
      out.write("\t\t<div class=\"downarrowdiv\" id=\"message\">\r\n");
      out.write("\t\t\t<p>");
      out.print(pro.getProperty("SuccessMSG") );
      out.write("</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t");
}
      out.write("\r\n");
      out.write("<body onload=\"startTimer()\">\r\n");
      out.write("<form action=\"");
      out.print(request.getContextPath() );
      out.write("/RegisterUser\">\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>");
      out.print(pro.getProperty("UserName") );
      out.write("</td><td><input type=\"text\" name=\"uname\" ></input></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>");
      out.print(pro.getProperty("UserID") );
      out.write("</td><td><input type=\"text\" name=\"uid\" required=\"yes\"></input></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t\t");
      out.print(pro.getProperty("SelectType") );
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t\t");
      out.print(pro.getProperty("Type1") );
      out.write("<input type=\"radio\" value=\"color\" name=\"type\" checked></input>\r\n");
      out.write("\t\t");
      out.print(pro.getProperty("Type2") );
      out.write("<input type=\"radio\" value=\"picture\" name=\"type\"></input>\r\n");
      out.write("\t</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>");
      out.print(pro.getProperty("SelectNoOfImages") );
      out.write("</td>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t\t<select name=\"select\">\r\n");
      out.write("\t\t\t<option value=\"2\">");
      out.print(pro.getProperty("Two") );
      out.write("</option>\r\n");
      out.write("\t\t\t<option value=\"4\">");
      out.print(pro.getProperty("Four") );
      out.write("</option>\r\n");
      out.write("\t\t\t<option value=\"6\">");
      out.print(pro.getProperty("Six") );
      out.write("</option>\r\n");
      out.write("\t\t\t<option value=\"8\">");
      out.print(pro.getProperty("Eight") );
      out.write("</option>\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>");
      out.print(pro.getProperty("UserPass") );
      out.write("</td><td><input type=\"password\" name=\"pass\" ></input></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>");
      out.print(pro.getProperty("City") );
      out.write("</td><td><input type=\"text\" name=\"city\" ></input></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>");
      out.print(pro.getProperty("State") );
      out.write("</td><td><input type=\"text\" name=\"state\" ></input></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>");
      out.print(pro.getProperty("ContactNo") );
      out.write("</td><td><input type=\"text\" name=\"cno\" ></input></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>");
      out.print(pro.getProperty("Email") );
      out.write("</td><td><input type=\"text\" name=\"mail\" ></input></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>&nbsp;</td><td><input type=\"submit\" ></input></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
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
