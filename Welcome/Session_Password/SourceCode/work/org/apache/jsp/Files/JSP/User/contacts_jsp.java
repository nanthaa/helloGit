package org.apache.jsp.Files.JSP.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class contacts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\r');
      out.write('\n');

	String id=session.getAttribute("id").toString();
	ResultSet rs=(ResultSet)request.getAttribute("rs");

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function hideMessage()\r\n");
      out.write("{\r\n");
      out.write("\tdocument.getElementById(\"message\").style.display=\"none\"; \r\n");
      out.write("}\r\n");
      out.write("function startTimer() \r\n");
      out.write("{\r\n");
      out.write("\tvar tim = window.setTimeout(\"hideMessage()\", 3000);  // 5000 milliseconds = 5 seconds\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style>#pageNavPosition{cursor:hand}</style>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/Files/JS/pagination.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/CSS/contact.css\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/CSS/button.css\" type=\"text/css\"/>\r\n");
      out.write("</head>\r\n");

int no=convert(request.getParameter("no"));
if(no==1)
{ResultSet rs1=(ResultSet)request.getAttribute("rs1");

      out.write("\r\n");
      out.write("<div class=\"gradientbuttons\" style=\"position:absolute;top:20px;left:300px\">\r\n");
      out.write("\t<form action=\"");
      out.print(request.getContextPath() );
      out.write("/AddContact1\">\r\n");
      out.write("\tSelect The Contact No......\r\n");
      out.write("\t\t<select name=\"contact\">\r\n");
      out.write("\t\t\t");

				while(rs1.next())
				{
					
      out.write("<option value=\"");
      out.print(rs1.getString(2) );
      out.write('"');
      out.write('>');
      out.print(rs1.getString(2) );
      out.write("</option>");

				}
			
      out.write("\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print(id );
      out.write("\"></input>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"task\" value=\"add1\"></input>\r\n");
      out.write("\t\t<input class=\"gradientbuttons\" type=\"submit\" value=\"add\" style=\"position:absolute;top:30px;left:180px\"></input>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
}
if(no==2)
{
      out.write("\r\n");
      out.write("<div class=\"gradientbuttons\" id=\"message\" style=\"position:absolute;top:50px;left:50px\">\r\n");
      out.write("\t<p>You Have Successfully Added ...!!</p>\r\n");
      out.write("</div>\r\n");
}
if(no==3)
{
      out.write("\r\n");
      out.write("<div class=\"gradientbuttons\" id=\"message\" style=\"position:absolute;top:50px;left:50px\">\r\n");
      out.write("\t<p>OOP's Something Went Wrong ...!!</p>\r\n");
      out.write("</div>\r\n");
}
if(no==4)
{
      out.write("\r\n");
      out.write("<div class=\"gradientbuttons\" id=\"message\" style=\"position:absolute;top:50px;left:50px\">\r\n");
      out.write("\t<p>Sorry Select Atleast One.....!!</p>\r\n");
      out.write("</div>\r\n");
}
if(no==5)
{
      out.write("\r\n");
      out.write("<div class=\"gradientbuttons\" id=\"message\" style=\"position:absolute;top:50px;left:50px\">\r\n");
      out.write("\t<p>You Have Successfully Deleted ...!!</p>\r\n");
      out.write("</div>\r\n");
}
      out.write("\r\n");
      out.write("<body onload=\"startTimer()\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"");
      out.print(request.getContextPath() );
      out.write("/DeleteContact\">\r\n");
      out.write("<a class=\"gradientbuttons\" href=\"");
      out.print(request.getContextPath() );
      out.write("/AddContact?id=");
      out.print(id );
      out.write("\">Add</a></li>\r\n");
      out.write("<input class=\"gradientbuttons\" type=\"submit\" value=\"Delete\"></input>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print(id );
      out.write("\"></input>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<table id=\"results\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>Select</th>\r\n");
      out.write("\t\t<th>Name</th>\r\n");
      out.write("\t\t<th>Contact ID</th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");

		while(rs.next())
		{
	
      out.write("\r\n");
      out.write("\t<tr id=\"color\">\r\n");
      out.write("\t\t<td><input name=\"chk\" type=\"checkbox\" value=\"");
      out.print(rs.getInt(1) );
      out.write("\"></input></td>\r\n");
      out.write("\t\t<td>");
      out.print(rs.getString(2) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(rs.getString(3) );
      out.write("</td>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</table>\r\n");
      out.write("<div id=\"pageNavPosition\"></div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\"><!--\r\n");
      out.write("        var pager = new Pager('results', 5); \r\n");
      out.write("        pager.init(); \r\n");
      out.write("        pager.showPageNav('pager', 'pageNavPosition'); \r\n");
      out.write("        pager.showPage(1);\r\n");
      out.write("    //--></script>\r\n");
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
