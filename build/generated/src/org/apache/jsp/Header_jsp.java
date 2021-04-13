package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<header id=\"header\"><!--header-->\n");
      out.write("    <div class=\"header_top\"><!--header_top-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <div class=\"contactinfo\">\n");
      out.write("                        <ul class=\"nav nav-pills\">\n");
      out.write("                            <li><a href=\"\"><i class=\"fa fa-phone\"></i> +84 969-133-718</a></li>\n");
      out.write("                            <li><a href=\"\"><i class=\"fa fa-envelope\"></i> KhueNDHe141599@fpt.edu.vn</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <div class=\"social-icons pull-right\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <li><a href=\"https://www.facebook.com/tala.khue\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-dribbble\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div><!--/header_top-->\n");
      out.write("\n");
      out.write("    <div class=\"header-middle\"><!--header-middle-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 clearfix\">\n");
      out.write("                    <div class=\"logo pull-left\">\n");
      out.write("                        <a href=\"pagingController\"><img src=\"images/home/logo.png\" alt=\"\" /></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-8 clearfix\">\n");
      out.write("                    <div class=\"shop-menu clearfix pull-right\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div><!--/header-middle-->\n");
      out.write("\n");
      out.write("    <div class=\"header-bottom\"><!--header-bottom-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-9\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"mainmenu pull-left\">\n");
      out.write("                        <div class=\"mainmenu pull-left\">\n");
      out.write("                            <ul class=\"nav navbar-nav collapse navbar-collapse\">\n");
      out.write("                                <li><a href=\"pagingController\" class=\"active\"><i class=\"fa fa-home\"></i>Home</a></li>\n");
      out.write("                                <li class=\"dropdown\"><a href=\"#\">Shop<i class=\"fa fa-angle-down\"></i></a>\n");
      out.write("                                    <ul role=\"menu\" class=\"sub-menu\">\n");
      out.write("                                        <li><a href=\"pagingProduct\"><i class=\"fa fa-product-hunt\"></i>Products</a></li>\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </li> \n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"search_box pull-right\">\n");
      out.write("                        <form action=\"SearchController\" method=\"post\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Search\"\n");
      out.write("                                   oninput=\"this.form.submit()\" autofocus name=\"search1\" id=\"search\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${txtValue}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div><!--/header-bottom-->\n");
      out.write("</header><!--/header-->\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li><a href=\"login.jsp\"><i class=\"fa fa-lock\"></i> Login</a></li>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                <li><a href=\"LogoutController\" style=\"font-size: 20px;\"><i class=\"fa fa-sign-out\"></i>Logout</a></li>\n");
        out.write("                                <li><a href=\"Account.jsp\" style=\"font-size: 20px;\"><i class=\"fa fa-user\"></i>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a></li>\n");
        out.write("\n");
        out.write("                                <li><a href=\"loadAllProductCart\" style=\"font-size: 20px; color: red;\">\n");
        out.write("                                        <i class=\"fa fa-shopping-cart\"></i> Cart \n");
        out.write("                                        ");
        if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                </li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.isCreator == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <li><a href=\"Admin.jsp\"><i class=\"\"></i>ADMIN</a></li>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.listC == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <sub>(<span>0</span>)</sub></a>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.listC != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <sub>(<span>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.countProduct}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>)</sub></a>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <li><a href=\"login.jsp\" style=\"font-size: 20px;\">Contact</a></li>\n");
        out.write("                                            <li><a href=\"login.jsp\">Login</a></li> \n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(null);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <li><a href=\"Contact.jsp\">Contact</a></li>\n");
        out.write("                                            <li><a href=\"checkOut.jsp\">Checkout</a></li> \n");
        out.write("                                            <li><a href=\"loadAllProductCart\">Cart</a></li> \n");
        out.write("                                            <li><a href=\"Account.jsp\"><i class=\"fa fa-user\"></i>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a></li>\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }
}
