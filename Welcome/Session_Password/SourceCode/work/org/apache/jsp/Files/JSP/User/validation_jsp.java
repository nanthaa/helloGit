package org.apache.jsp.Files.JSP.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.nitin.DAO.*;
import java.sql.*;
import java.util.*;
import com.nitin.util.*;
import java.io.*;

public final class validation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("table.gridtable {\r\n");
      out.write("\tfont-family: verdana,arial,sans-serif;\r\n");
      out.write("\tfont-size:11px;\r\n");
      out.write("\tcolor:#333333;\r\n");
      out.write("\tborder-width: 1px;\r\n");
      out.write("\tborder-color: #666666;\r\n");
      out.write("\tborder-collapse: collapse;\r\n");
      out.write("}\r\n");
      out.write("table.gridtable th {\r\n");
      out.write("\tborder-width: 1px;\r\n");
      out.write("\tpadding: 8px;\r\n");
      out.write("\tborder-style: solid;\r\n");
      out.write("\tborder-color: #666666;\r\n");
      out.write("\tbackground-color: #dedede;\r\n");
      out.write("}\r\n");
      out.write("table.gridtable td {\r\n");
      out.write("\tborder-width: 1px;\r\n");
      out.write("\tpadding: 8px;\r\n");
      out.write("\tborder-style: solid;\r\n");
      out.write("\tborder-color: #666666;\r\n");
      out.write("\tbackground-color: #A9BCF5;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");

String id=session.getAttribute("id").toString();
Properties pro = new Properties();
Properties pro1 = new Properties();
FileInputStream in=null;
FileInputStream in1=null;
try
{
	in = new FileInputStream(request.getRealPath("")+"\\Files\\Properties\\"+id+".properties");
	in1 = new FileInputStream(request.getRealPath("")+"\\Files\\Properties\\lables.properties");
}
catch(Exception ex)
{
	out.println("<center>Opp's.........lables.properties is missing...!</center>");
	System.out.println(ex);
}
pro.load(in);
pro1.load(in1);

      out.write("\r\n");
      out.write("</head>\r\n");

int no=convert(request.getParameter("no"));
if(no==12)
{
      out.write("\r\n");
      out.write("\t<p>");
      out.print(pro1.getProperty("InvalidSessionPwd") );
      out.write("</p>\r\n");
}

      out.write("\r\n");
      out.write("<body>\r\n");

	String img_value="";
	String path=request.getRealPath("");
	UserDAO userDAO = UserDAO.initialize();
	ResultSet rs= userDAO.getUser(id,path);
	while(rs.next())
	{
		img_value=rs.getString(5);
	}
	Vector v=GetImages.getImageNames(request.getRealPath(""),id);
	Collections.shuffle(v);
	int count=1;
	for(int i=0;i<v.size();i++)
	{
		
      out.write("\r\n");
      out.write("\t\t  \t<img border=\"1\" height=\"80\" width=\"80\" src=\"");
      out.print(request.getContextPath() );
      out.write("/Files/Pimages/");
      out.print(v.get(i) );
      out.write("\">\r\n");
      out.write("\t\t");

		if(count%2==0)
			
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");

		count++;
//			out.println(pro.getProperty((String)v.get(i))); //  prints code of each image
	}
	
      out.write("</br>");

	int rows=img_value.length();
	int cols=img_value.length();
	int[][] data=new int[rows][cols];
	Random random=new Random();
	
      out.write("\r\n");
      out.write("\t\t<table class=\"gridtable\" border=1>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t");

	for (int i = 0; i < rows; i++) 
	{
        for (int j = 0; j < cols; j++) 
        {
        	
      out.write("<td>");

        	data[i][j]=random.nextInt(9);
       		out.print(data[i][j]);
        	
      out.write("</td>");

        }
        
      out.write("</tr>");

	}
	if(v.size()==2)
	{
		int a=Integer.parseInt(pro.getProperty((String)v.get(0)));
		int b=Integer.parseInt(pro.getProperty((String)v.get(1)));
		int pass=data[a-1][b-1];
		String sessionPass=new Integer(pass).toString();
		out.println("Your Session PWD : "+sessionPass);
		boolean result=userDAO.insertSessionPass(sessionPass,id,path);
	}
	else if(v.size()==4)
	{
		int a=Integer.parseInt(pro.getProperty((String)v.get(0)));
		int b=Integer.parseInt(pro.getProperty((String)v.get(1)));
		int c=Integer.parseInt(pro.getProperty((String)v.get(2)));
		int d=Integer.parseInt(pro.getProperty((String)v.get(3)));
		int pass=data[a-1][b-1];
		int pass1=data[c-1][d-1];
		String sessionPass=new Integer(pass).toString();
		sessionPass+=new Integer(pass1).toString();
		out.println("Your Session PWD : "+sessionPass);
		boolean result=userDAO.insertSessionPass(sessionPass,id,path);
	}
	else if(v.size()==6)
	{
		int a=Integer.parseInt(pro.getProperty((String)v.get(0)));
		int b=Integer.parseInt(pro.getProperty((String)v.get(1)));
		int c=Integer.parseInt(pro.getProperty((String)v.get(2)));
		int d=Integer.parseInt(pro.getProperty((String)v.get(3)));
		int e=Integer.parseInt(pro.getProperty((String)v.get(4)));
		int f=Integer.parseInt(pro.getProperty((String)v.get(5)));
		int pass=data[a-1][b-1];
		int pass1=data[c-1][d-1];
		int pass2=data[e-1][f-1];
		String sessionPass=new Integer(pass).toString();
		sessionPass+=new Integer(pass1).toString();
		sessionPass+=new Integer(pass2).toString();
		out.println("Your Session PWD : "+sessionPass);
		boolean result=userDAO.insertSessionPass(sessionPass,id,path);
	}
	else if(v.size()==8)
	{
		int a=Integer.parseInt(pro.getProperty((String)v.get(0)));
		int b=Integer.parseInt(pro.getProperty((String)v.get(1)));
		int c=Integer.parseInt(pro.getProperty((String)v.get(2)));
		int d=Integer.parseInt(pro.getProperty((String)v.get(3)));
		int e=Integer.parseInt(pro.getProperty((String)v.get(4)));
		int f=Integer.parseInt(pro.getProperty((String)v.get(5)));
		int g=Integer.parseInt(pro.getProperty((String)v.get(6)));
		int h=Integer.parseInt(pro.getProperty((String)v.get(7)));
		int pass=data[a-1][b-1];
		int pass1=data[c-1][d-1];
		int pass2=data[e-1][f-1];
		int pass3=data[g-1][h-1];
		String sessionPass=new Integer(pass).toString();
		sessionPass+=new Integer(pass1).toString();
		sessionPass+=new Integer(pass2).toString();
		sessionPass+=new Integer(pass3).toString();
		out.println("Your Session PWD : "+sessionPass);
		boolean result=userDAO.insertSessionPass(sessionPass,id,path);
	}

      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\t<form method=\"post\" action=\"");
      out.print(request.getContextPath() );
      out.write("/UserLogin1\">\r\n");
      out.write("\tSession Password\r\n");
      out.write("\t\t<input type=\"text\" size=\"4\" name=\"sessionPwd\" required=\"yes\"></input>\r\n");
      out.write("\t\t<input type=\"submit\" value=\"Login\"></input>\r\n");
      out.write("\t</form>\r\n");
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
