package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Head.jsp", out, false);
      out.write("\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <form action=\"SaveContactUser\" method=\"post\">\n");
      out.write("                    <div class=\"form-group col-md-6\">\n");
      out.write("                        <input type=\"text\" name=\"id\" class=\"form-control\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required=\"required\" placeholder=\"ID\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-6\">\n");
      out.write("                    <input type=\"text\" name=\"name\" class=\"form-control\" required=\"required\" placeholder=\"Name\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-12\">\n");
      out.write("                    <input type=\"email\" name=\"email\" class=\"form-control\" required=\"required\" placeholder=\"Email\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-12\">\n");
      out.write("                    <input type=\"text\" name=\"address\" class=\"form-control\" required=\"required\" placeholder=\"Address\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-12\">\n");
      out.write("                    <input type=\"text\" name=\"phone\" class=\"form-control\" required=\"required\" placeholder=\"Phone number\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-12\">\n");
      out.write("                    <input type=\"date\" name=\"date\" class=\"form-control\" required=\"required\" placeholder=\"Date\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-12\">\n");
      out.write("                    <input type=\"text\" name=\"subject\" class=\"form-control\" required=\"required\" placeholder=\"Subject\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-12\">\n");
      out.write("                    <textarea name=\"message\" id=\"message\" required=\"required\" class=\"form-control\" rows=\"8\" placeholder=\"Your Message Here\"></textarea>\n");
      out.write("                </div>    \n");
      out.write("                <input class=\"btn btn-primary\" type=\"submit\" value=\"Submit\" style=\"margin-bottom: 20px\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("            <div class=\"contact-info\">\n");
      out.write("                <h2 class=\"title text-center\">Contact Info</h2>\n");
      out.write("                <address>\n");
      out.write("                    <p>E-Shopper Inc.</p>\n");
      out.write("                    <p>935 W. Webster Ave New Streets Chicago, IL 60614, NY</p>\n");
      out.write("                    <p>Newyork USA</p>\n");
      out.write("                    <p>Mobile: +2346 17 38 93</p>\n");
      out.write("                    <p>Fax: 1-714-252-0026</p>\n");
      out.write("                    <p>Email: info@e-shopper.com</p>\n");
      out.write("                </address>\n");
      out.write("                <div class=\"social-networks\">\n");
      out.write("                    <h2 class=\"title text-center\">Social Networking</h2>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-google-plus\"></i></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-youtube\"></i></a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("        <script src=\"js/price-range.js\"></script>\n");
      out.write("        <script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
