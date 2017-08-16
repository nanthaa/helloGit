package org.apache.jsp.Files.JSP.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class compose_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/CSS/form.css\" type=\"text/css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/CSS/button.css\" type=\"text/css\"/>\r\n");
      out.write("</head>\r\n");

	String id=session.getAttribute("id").toString();
	ResultSet rs1=(ResultSet)request.getAttribute("rs1");

      out.write('\r');
      out.write('\n');

int no=convert(request.getParameter("no"));
if(no==1)
{
      out.write("\r\n");
      out.write("<div class=\"gradientbuttons\" id=\"message\" style=\"position:absolute;top:100px;left:290px\">\r\n");
      out.write("\t<p>  Successfully Sent ...!!</p>\r\n");
      out.write("</div>\r\n");
}
if(no==2)
{
      out.write("\r\n");
      out.write("<div class=\"gradientbuttons\" id=\"message\" style=\"position:absolute;top:100px;left:0px\">\r\n");
      out.write("\t<p>OOP's Something Went Wrong ...!!</p>\r\n");
      out.write("</div>\r\n");
}
      out.write("\r\n");
      out.write("<body onload=\"startTimer()\">\r\n");
      out.write("<form action=\"");
      out.print(request.getContextPath() );
      out.write("/SendMail\" method=\"post\">\r\n");
      out.write("<input type=\"submit\" value=\"Send\" class=\"gradientbuttons\" ></input>\r\n");
      out.write("<br></br>\r\n");
      out.write("\tTo <select name=\"to\">\r\n");
      out.write("\t\t");

			while(rs1.next())
			{
				
      out.write("<option value=\"");
      out.print(rs1.getString(3) );
      out.write('"');
      out.write('>');
      out.print(rs1.getString(3) );
      out.write("</option>");

			}
		
      out.write("\r\n");
      out.write("\t</select>\r\n");
      out.write("\t<br></br>\r\n");
      out.write("\tSubject\r\n");
      out.write("\t<input type=\"text\" name=\"sub\"></input><br></br>\r\n");
      out.write("\t<textarea name=\"msg\" rows=\"12\" cols=\"60\"></textarea>\r\n");
      out.write("\t<input type=\"hidden\" value=");
      out.print(id );
      out.write(" name=\"from\"></input>\r\n");
      out.write("</form>\r\n");
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
