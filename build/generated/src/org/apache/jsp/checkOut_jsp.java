package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkOut_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home | E-Shopper</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Head.jsp", out, false);
      out.write("\n");
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
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("            <section id=\"cart_items\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"breadcrumbs\">\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li><a href=\"#\">Home</a></li>\n");
      out.write("                            <li class=\"active\">Check out</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div><!--/breadcrums-->\n");
      out.write("\n");
      out.write("                    <div class=\"table-responsive cart_info\">\n");
      out.write("                        <table class=\"table table-condensed\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr class=\"cart_menu\">\n");
      out.write("                                    <td class=\"image\">Item</td>\n");
      out.write("                                    <td class=\"description\"></td>\n");
      out.write("                                    <td class=\"price\">Price</td>\n");
      out.write("                                    <td class=\"quantity\">Quantity</td>\n");
      out.write("                                    <td class=\"total\">Total</td>\n");
      out.write("                                    <td class=\"delete\">Delete</td>\n");
      out.write("                                    <td></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td colspan=\"4\">&nbsp;</td>\n");
      out.write("                                <td colspan=\"2\">\n");
      out.write("                                    <table class=\"table table-condensed total-result\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Tax</td>\n");
      out.write("                                            <td><span>$ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.Tax}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></td>\n");
      out.write("                                            <td>Total</td>\n");
      out.write("                                            <td><span>$ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.Sum + sessionScope.Tax}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>      \n");
      out.write("                </div>\n");
      out.write("                <div class=\"shopper-informations\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-5 clearfix\">\n");
      out.write("                            <div class=\"bill-to\">\n");
      out.write("                                <p>Bill To</p>\n");
      out.write("                                <div class=\"form-one\">\n");
      out.write("                                    <form>\n");
      out.write("                                        <input type=\"text\" placeholder=\"Email*\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                        <input type=\"text\" placeholder=\"Title\" name=\"title\">\n");
      out.write("                                        <input type=\"text\" placeholder=\"Name *\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                        <input type=\"text\" placeholder=\"Address 1 *\" name=\"address\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-two\">\n");
      out.write("                                    <form>\n");
      out.write("                                        <input type=\"text\" placeholder=\"Zip / Postal Code *\" name=\"ZipCode\">\n");
      out.write("                                        <input type=\"text\" placeholder=\"Phone *\" name=\"phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-4\">\n");
      out.write("                            <div class=\"order-message\">\n");
      out.write("                                <p>Shipping Order</p>\n");
      out.write("                                <textarea name=\"message\"  placeholder=\"Notes about your order, Special Notes for Delivery\" rows=\"16\"></textarea>\n");
      out.write("                                <label><input type=\"checkbox\"> Shipping to bill address</label>\n");
      out.write("                            </div>\t\n");
      out.write("                        </div>\t\t\t\t\t\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"review-payment\">\n");
      out.write("                    <h2>Review & Payment</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"payment-options\">\n");
      out.write("                    <a class=\"btn btn-primary\" href=\"CheckOut\">Payment for the orders</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("    </footer><!--/Footer-->\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("    <script src=\"js/price-range.js\"></script>\n");
      out.write("    <script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.listC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <tr>\n");
          out.write("                                    <td class=\"cart_product\">\n");
          out.write("                                        <a href=\"\"><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.link}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" style=\"width: 150px; height: 150px;\"></a>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td class=\"cart_description\">\n");
          out.write("                                        <h4><a href=\"\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h4>\n");
          out.write("                                        <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td class=\"cart_price\">\n");
          out.write("                                        <p>$ ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td class=\"cart_quantity\">\n");
          out.write("                                        <div class=\"cart_quantity_button\">\n");
          out.write("                                            <input class=\"cart_quantity_input\" type=\"text\" name=\"quantity\"  value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.quatity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" autocomplete=\"off\" size=\"2\">\n");
          out.write("                                        </div>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td class=\"cart_total\">\n");
          out.write("                                        <p class=\"cart_total_price\">$ ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(o.price)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td class=\"cart_delete\">\n");
          out.write("                                        <a class=\"cart_quantity_delete\" href=\"DeleteProduct?dId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"fa fa-times\"></i></a>\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
