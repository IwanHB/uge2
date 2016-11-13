package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        \r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            body{\r\n");
      out.write("                font-family: Verdana;\r\n");
      out.write("            }\r\n");
      out.write("            textArea{\r\n");
      out.write("                width: 300px;\r\n");
      out.write("                height: 200px;\r\n");
      out.write("            }\r\n");
      out.write("            .bluebox{\r\n");
      out.write("                border: 2px solid blue;\r\n");
      out.write("                padding: 10px;\r\n");
      out.write("                width: 350px;\r\n");
      out.write("                height: 600px;\r\n");
      out.write("                margin: auto;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"bluebox\">\r\n");
      out.write("            <h1>Registration form</h1>\r\n");
      out.write("        <form action=\"Registration\" method=\"POST\">\r\n");
      out.write("            First Name:\r\n");
      out.write("            <input type=\"text\" name=\"firstname\"><br>\r\n");
      out.write("            Last Name:\r\n");
      out.write("            <input type=\"text\" name=\"lastname\"><br>\r\n");
      out.write("            Password:\r\n");
      out.write("            <input type=\"password\" name=\"password\"><br>\r\n");
      out.write("            Are you male or female?<br>\r\n");
      out.write("            <input type=\"radio\" name=\"sex\" value=\"male\">Male\r\n");
      out.write("            <input type=\"radio\" name=\"sex\" value=\"female\">Female<br>\r\n");
      out.write("            Check the languages you know<br>\r\n");
      out.write("            <input type=\"checkbox\" name=\"language\" value=\"html\">HTML<br>\r\n");
      out.write("            <input type=\"checkbox\" name=\"language\" value=\"java\">Java<br>\r\n");
      out.write("            <input type=\"checkbox\" name=\"language\" value=\"c#\">C#<br>\r\n");
      out.write("            <input type=\"checkbox\" name=\"language\" value=\"python\">Python<br>\r\n");
      out.write("            <input type=\"checkbox\" name=\"language\" value=\"javascript\">Javascript<br>\r\n");
      out.write("            In which country were you born<br>\r\n");
      out.write("            <select name=\"country\">\r\n");
      out.write("                <option value=\"Denmark\" selected>Denmark</option>\r\n");
      out.write("                <option value=\"Namibia\">Namibia</option>\r\n");
      out.write("                <option value=\"Pakistan\">Pakistan</option>\r\n");
      out.write("                <option value=\"Tibet\">Tibet</option>\r\n");
      out.write("                <option value=\"Colombia\">Colombia</option>\r\n");
      out.write("            </select><br>\r\n");
      out.write("            <textarea name=\"description\" placeholder=\"Descripe your self\"></textarea><br>\r\n");
      out.write("            <input type=\"submit\" value=\"submit\"><br>\r\n");
      out.write("        </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
