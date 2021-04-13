package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Account_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <div class=\"left-sidebar\">\n");
      out.write("                            <h2>Information User</h2>\n");
      out.write("                            <div class=\"panel-group category-products\" id=\"accordian\"><!--category-productsr-->\n");
      out.write("                                <div class=\"panel panel-default\">\n");
      out.write("                                    <div class=\"panel-heading\">\n");
      out.write("                                        <h4 class=\"panel-title\"><a href=\"#\"><i class=\"fa fa-user-circle\"></i>Account</a></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel panel-default\">\n");
      out.write("                                    <div class=\"panel-heading\">\n");
      out.write("                                        <h4 class=\"panel-title\"><a href=\"#\">My Order</a></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel panel-default\">\n");
      out.write("                                    <div class=\"panel-heading\">\n");
      out.write("                                        <h4 class=\"panel-title\"><a href=\"#\">Notification</a></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-9 padding-right\">\n");
      out.write("                        <form action=\"SaveInformationUser\" method=\"post\">\n");
      out.write("                            <div class=\"form-group col-md-9\">\n");
      out.write("                                <input type=\"text\" name=\"id\" class=\"form-control\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required=\"required\" placeholder=\"ID\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-md-9\">\n");
      out.write("                            <input type=\"text\" name=\"name\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  required=\"required\" placeholder=\"Name\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-md-9\">\n");
      out.write("                            <input type=\"email\" name=\"email\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required=\"required\" placeholder=\"Email\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-md-9\">\n");
      out.write("                            <input type=\"text\" name=\"address\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required=\"required\" placeholder=\"Address\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-md-9\">\n");
      out.write("                            <input type=\"text\" name=\"phone\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required=\"required\" placeholder=\"Phone number\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-md-9\">\n");
      out.write("                            <input type=\"text\" name=\"date\" class=\"form-control\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.date1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required=\"required\" placeholder=\"Date\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-md-9\">\n");
      out.write("                            <input type=\"text\" name=\"subject\" class=\"form-control\" required=\"required\" placeholder=\"Subject\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-md-9\">\n");
      out.write("                            <input class=\"btn btn-primary\" type=\"submit\" value=\"Save\" style=\"margin-bottom: 20px\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
