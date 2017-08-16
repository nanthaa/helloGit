package org.apache.jsp.Files.JSP.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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

	ResultSet rs=(ResultSet)request.getAttribute("rs");
	int id=0,cell=0;String userid="",name="",city="",mail="",add="",state="";
	

      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("p \r\n");
      out.write("{\r\n");
      out.write("\tfont-family: monospace;\r\n");
      out.write("\tfont-style: italic;\r\n");
      out.write("\tfont-variant: normal;\r\n");
      out.write("\tfont-weight: bolder;\r\n");
      out.write("\tfont-size: medium;\r\n");
      out.write("\tline-height: 200%;\r\n");
      out.write("\tword-spacing: 1.5ex;\r\n");
      out.write("\tletter-spacing: 0.1ex;\r\n");
      out.write("\ttext-transform: capitalize;\r\n");
      out.write("\ttext-indent: 0ex;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("} \r\n");
      out.write("div\r\n");
      out.write("{\r\n");
      out.write("\tborder-top-style:dotted;\r\n");
      out.write("\tborder-right-style:solid;\r\n");
      out.write("\tborder-bottom-style:dotted;\r\n");
      out.write("\tborder-left-style:solid;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/CSS/button.css\" type=\"text/css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

	while(rs.next())
	{
		id=rs.getInt(1);
		cell=rs.getInt(8);
		userid=rs.getString(2);
		name=rs.getString(4);
		add=rs.getString(5);
		city=rs.getString(6);
		state=rs.getString(7);
		mail=rs.getString(9);
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<a class=\"gradientbuttons\" href=\"");
      out.print(request.getContextPath() );
      out.write("/EditProfile1?id=");
      out.print(userid );
      out.write("\">Edit Profile</a>\r\n");
      out.write("<a class=\"gradientbuttons\" href=\"");
      out.print(request.getContextPath() );
      out.write("/ChangePassword1?id=");
      out.print(userid );
      out.write("\">Change Password</a>\r\n");
      out.write("<div>\r\n");
      out.write("<p id=\"al\">Your ID No : ");
      out.print(id );
      out.write("</p>\r\n");
      out.write("<p id=\"al\">Your Name : ");
      out.print(name );
      out.write("</p>\r\n");
      out.write("<p id=\"al\">Your User ID : ");
      out.print(userid );
      out.write("</p>\r\n");
      out.write("<p id=\"al\">Your Mail ID : ");
      out.print(mail );
      out.write("</p>\r\n");
      out.write("<p id=\"al\">Your Cell N0 : ");
      out.print(cell );
      out.write("</p>\r\n");
      out.write("<p id=\"al\">Your Address : ");
      out.print(add );
      out.write("</p>\r\n");
      out.write("<p id=\"al\">Your City : ");
      out.print(city );
      out.write("</p>\r\n");
      out.write("<p id=\"al\">Your Sate : ");
      out.print(state );
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
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
