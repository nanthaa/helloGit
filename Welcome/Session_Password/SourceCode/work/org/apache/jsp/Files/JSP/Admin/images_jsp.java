package org.apache.jsp.Files.JSP.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class images_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	Vector v=(Vector)request.getAttribute("v");
	Vector v1=(Vector)request.getAttribute("v1");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/CSS/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/CSS/button.css\" type=\"text/css\"/>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/Files/JS/jquery-1.6.4.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./fancybox/jquery.fancybox-1.3.4.pack.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./fancybox/jquery.fancybox-1.3.4.css\" media=\"screen\" />\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$('ul.hover_block li').hover(function(){\r\n");
      out.write("\t\t$(this).find('a').animate({top:'10px'},{queue:false,duration:500});\r\n");
      out.write("\t}, function(){\r\n");
      out.write("\t\t$(this).find('a').animate({top:'-10000px'},{queue:false,duration:500});\r\n");
      out.write("\t});\r\n");
      out.write("\t$(\"a#load\").fancybox({\r\n");
      out.write("\t\t'overlayShow'\t: true,\r\n");
      out.write("\t\t'transitionIn'\t: 'elastic',\r\n");
      out.write("\t\t'transitionOut'\t: 'elastic'\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\tul.hover_block li{\r\n");
      out.write("\t\t\tlist-style:none;\r\n");
      out.write("\t\t\tfloat:left;\r\n");
      out.write("\t\t\twidth:100px; position: relative;\r\n");
      out.write("\t\t\tmargin-right: 20px; }\r\n");
      out.write("\r\n");
      out.write("\t\tul.hover_block li a {\r\n");
      out.write("\t\t\tdisplay: block;\r\n");
      out.write("\t\t\tposition: relative;\r\n");
      out.write("\t\t\toverflow: hidden;\r\n");
      out.write("\t\t\theight: 150px;\r\n");
      out.write("\t\t\twidth: 268px;\r\n");
      out.write("\t\t\tpadding: 16px;\r\n");
      out.write("\t\t\tcolor:white;\r\n");
      out.write("\t\t\tfont: 1.0em/1.3 Helvetica, Arial, sans-serif;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tul.hover_block li a \r\n");
      out.write("\t\t{ \r\n");
      out.write("\t\ttext-decoration: none;\r\n");
      out.write("\t\t\tposition: absolute;\r\n");
      out.write("\t\t\ttop: -10000px;\r\n");
      out.write("\t\t\tleft: -25px;\r\n");
      out.write("\t\t\tborder: 0; \r\n");
      out.write("\t\t\t}\r\n");
      out.write("</style>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".nits {\r\n");
      out.write("\t-moz-box-shadow:inset 0px 0px 0px 0px #b5ccaa;\r\n");
      out.write("\t-webkit-box-shadow:inset 0px 0px 0px 0px #b5ccaa;\r\n");
      out.write("\tbox-shadow:inset 0px 0px 0px 0px #b5ccaa;\r\n");
      out.write("\tbackground-color:#a6a4eb;\r\n");
      out.write("\t-moz-border-radius:20px;\r\n");
      out.write("\t-webkit-border-radius:20px;\r\n");
      out.write("\tborder-radius:20px;\r\n");
      out.write("\tborder:2px solid #f5f5f5;\r\n");
      out.write("\tdisplay:inline-block;\r\n");
      out.write("\tcolor:#fcfcfc;\r\n");
      out.write("\tfont-family:arial;\r\n");
      out.write("\tfont-size:17px;\r\n");
      out.write("\tfont-weight:bold;\r\n");
      out.write("\tpadding:8px 11px;\r\n");
      out.write("\ttext-decoration:none;\r\n");
      out.write("\ttext-shadow:1px 0px 3px #000000;\r\n");
      out.write("}.nits:hover {\r\n");
      out.write("\tbackground-color:#d46a84;\r\n");
      out.write("}.nits:active {\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("\ttop:1px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");

int no=convert(request.getParameter("no"));
if(no==1)
{
      out.write("\r\n");
      out.write("<div class=\"gradientbuttons\" id=\"message\" style=\"position:absolute;top:10px;left:280px\">\r\n");
      out.write("\t<p>Image Updated Succeefully...!!</p>\r\n");
      out.write("</div>\r\n");
}
if(no==2)
{
      out.write("\r\n");
      out.write("<div class=\"gradientbuttons\" id=\"message\" style=\"position:absolute;top:10px;left:280px\">\r\n");
      out.write("\t<p>OOP's Something Went Wrong ...!!</p>\r\n");
      out.write("</div>\r\n");
}
      out.write("\r\n");
      out.write("<body onload=\"startTimer()\">\r\n");
      out.write("<ul class=\"hover_block\">\r\n");

	for(int i=0;i<v.size();i++)
	{
		
      out.write("\t<li>\r\n");
      out.write("\t\t\t<a href=\"/\">\r\n");
      out.write("\t\t\t<a id=\"load\" href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/JSP/Admin/changeimg.jsp?name=");
      out.print(((String)v.get(i)).charAt(0) );
      out.print(((String)v.get(i)).charAt(1) );
      out.write("\">\r\n");
      out.write("\t\t\t\t<div class=\"nits\">Change ?</div>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<img border=\"1\" height=\"80\" width=\"80\" src=\"");
      out.print(request.getContextPath() );
      out.write("/Files/Pimages/");
      out.print(v.get(i) );
      out.write("\">&nbsp;</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t");

	}

      out.write('\r');
      out.write('\n');

	for(int i=0;i<v1.size();i++)
	{
		
      out.write("\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t<a href=\"/\">\r\n");
      out.write("\t\t\t<a id=\"load\" href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/JSP/Admin/changeimg.jsp?name=");
      out.print(((String)v1.get(i)).charAt(0) );
      out.write("\">\r\n");
      out.write("\t\t\t\t<div class=\"nits\">Change ?</div>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<img border=\"1\" height=\"80\" width=\"80\" src=\"");
      out.print(request.getContextPath() );
      out.write("/Files/Pimages/");
      out.print(v1.get(i) );
      out.write("\">&nbsp;\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t");

	}

      out.write("\r\n");
      out.write("</ul>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
