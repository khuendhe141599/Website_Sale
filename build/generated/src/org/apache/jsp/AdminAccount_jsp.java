package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      ControllerDAO.DAO a = null;
      synchronized (request) {
        a = (ControllerDAO.DAO) _jspx_page_context.getAttribute("a", PageContext.REQUEST_SCOPE);
        if (a == null){
          a = new ControllerDAO.DAO();
          _jspx_page_context.setAttribute("a", a, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Head.jsp", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <table class=\"table table-striped table-dark\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"col\">ID</th>\n");
      out.write("                        <th scope=\"col\">Username</th>\n");
      out.write("                        <th scope=\"col\">Password</th>\n");
      out.write("                        <th scope=\"col\">Email</th>\n");
      out.write("                        <th scope=\"col\">Is Create</th>\n");
      out.write("                        <th scope=\"col\">Address</th>\n");
      out.write("                        <th scope=\"col\">Phone</th>\n");
      out.write("                        <th scope=\"col\">Date</th>\n");
      out.write("                        <th scope=\"col\">EDIT</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.allAccount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"o\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.isCreator}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("<!--                        <td>\n");
      out.write("                            <a href=\"DeleteOrder?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                               onclick=\"return confirm('Are you sure you want to DELETE?');\" >Remove Order</a>\n");
      out.write("                        </td>-->\n");
      out.write("                    </tr>\n");
      out.write("                </c:forEach>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
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
