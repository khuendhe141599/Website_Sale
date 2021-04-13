package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
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
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <section id=\"slider\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                        <div id=\"slider-carousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                            <ol class=\"carousel-indicators\">\n");
      out.write("                                <li data-target=\"#slider-carousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                                <li data-target=\"#slider-carousel\" data-slide-to=\"1\"></li>\n");
      out.write("                                <li data-target=\"#slider-carousel\" data-slide-to=\"2\"></li>\n");
      out.write("                            </ol>\n");
      out.write("\n");
      out.write("                            <div class=\"carousel-inner\">\n");
      out.write("                                <div class=\"item active\">\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <h1><span>E</span>-SHOPPER</h1>\n");
      out.write("                                        <h2>Free E-Commerce Template</h2>\n");
      out.write("                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-default get\">Get it now</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <img src=\"images/home/girl1.jpg\" class=\"girl img-responsive\" alt=\"\" />\n");
      out.write("                                        <img src=\"images/home/pricing.png\"  class=\"pricing\" alt=\"\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item\">\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <h1><span>E</span>-SHOPPER</h1>\n");
      out.write("                                        <h2>100% Responsive Design</h2>\n");
      out.write("                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-default get\">Get it now</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <img src=\"images/home/girl2.jpg\" class=\"girl img-responsive\" alt=\"\" />\n");
      out.write("                                        <img src=\"images/home/pricing.png\"  class=\"pricing\" alt=\"\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"item\">\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <h1><span>E</span>-SHOPPER</h1>\n");
      out.write("                                        <h2>Free Ecommerce Template</h2>\n");
      out.write("                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-default get\">Get it now</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <img src=\"images/home/girl3.jpg\" class=\"girl img-responsive\" alt=\"\" />\n");
      out.write("                                        <img src=\"images/home/pricing.png\" class=\"pricing\" alt=\"\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <a href=\"#slider-carousel\" class=\"left control-carousel hidden-xs\" data-slide=\"prev\">\n");
      out.write("                                <i class=\"fa fa-angle-left\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"#slider-carousel\" class=\"right control-carousel hidden-xs\" data-slide=\"next\">\n");
      out.write("                                <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <div class=\"left-sidebar\">\n");
      out.write("                            <h2>Category</h2>\n");
      out.write("                            <div class=\"panel-group category-products\" id=\"accordian\"><!--category-productsr-->\n");
      out.write("                                <div class=\"panel panel-default\">\n");
      out.write("                                    <div class=\"panel-heading\">\n");
      out.write("                                        <h4 class=\"panel-title\"><a href=\"#\">Sweater</a></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel panel-default\">\n");
      out.write("                                    <div class=\"panel-heading\">\n");
      out.write("                                        <h4 class=\"panel-title\"><a href=\"#\">Evening jacket</a></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel panel-default\">\n");
      out.write("                                    <div class=\"panel-heading\">\n");
      out.write("                                        <h4 class=\"panel-title\"><a href=\"#\">Hoodies Men</a></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div><!--/category-products-->\n");
      out.write("                            <div class=\"price-range\"><!--price-range-->\n");
      out.write("                                <h2>Price Range</h2>\n");
      out.write("                                <div class=\"well\">\n");
      out.write("                                    <input type=\"text\" class=\"span2\" value=\"\" data-slider-min=\"0\" \n");
      out.write("                                           data-slider-max=\"600\" data-slider-step=\"5\" data-slider-value=\"[0,300]\" id=\"sl2\" ><br />\n");
      out.write("                                    <b>$ 0</b> <b class=\"pull-right\">$ 600</b>\n");
      out.write("                                </div>\n");
      out.write("                            </div><!--/price-range-->\n");
      out.write("                            <div class=\"shipping text-center\"><!--shipping-->\n");
      out.write("                                <img src=\"images/home/shipping.jpg\" alt=\"\" />\n");
      out.write("                            </div><!--/shipping-->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-9 padding-right\">\n");
      out.write("                        <div class=\"features_items\"><!--features_items-->\n");
      out.write("                            <h2 class=\"title text-center\">Features Items</h2>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div><!--features_items-->\n");
      out.write("                    \n");
      out.write("                    <div class=\"category-tab\"><!--category-tab-->\n");
      out.write("                        <div class=\"col-sm-12\">\n");
      out.write("                            <ul class=\"nav nav-tabs\">\n");
      out.write("                                <li class=\"active\"><a href=\"#tshirt\" data-toggle=\"tab\">T-Shirt</a></li>\n");
      out.write("                                <li><a href=\"#blazers\" data-toggle=\"tab\">Blazers</a></li>\n");
      out.write("                                <li><a href=\"#sunglass\" data-toggle=\"tab\">Sunglass</a></li>\n");
      out.write("                                <li><a href=\"#kids\" data-toggle=\"tab\">Kids</a></li>\n");
      out.write("                                <li><a href=\"#poloshirt\" data-toggle=\"tab\">Polo shirt</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"tab-content\">\n");
      out.write("                            <div class=\"tab-pane fade active in\" id=\"tshirt\" >\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <div class=\"product-image-wrapper\">\n");
      out.write("                                        <div class=\"single-products\">\n");
      out.write("                                            <div class=\"productinfo text-center\">\n");
      out.write("                                                <img src=\"images/home/gallery1.jpg\" alt=\"\" />\n");
      out.write("                                                <h2>$56</h2>\n");
      out.write("                                                <p>Easy Polo Black Edition</p>\n");
      out.write("                                                <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <div class=\"product-image-wrapper\">\n");
      out.write("                                        <div class=\"single-products\">\n");
      out.write("                                            <div class=\"productinfo text-center\">\n");
      out.write("                                                <img src=\"images/home/gallery2.jpg\" alt=\"\" />\n");
      out.write("                                                <h2>$56</h2>\n");
      out.write("                                                <p>Easy Polo Black Edition</p>\n");
      out.write("                                                <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <div class=\"product-image-wrapper\">\n");
      out.write("                                        <div class=\"single-products\">\n");
      out.write("                                            <div class=\"productinfo text-center\">\n");
      out.write("                                                <img src=\"images/home/gallery3.jpg\" alt=\"\" />\n");
      out.write("                                                <h2>$56</h2>\n");
      out.write("                                                <p>Easy Polo Black Edition</p>\n");
      out.write("                                                <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <div class=\"product-image-wrapper\">\n");
      out.write("                                        <div class=\"single-products\">\n");
      out.write("                                            <div class=\"productinfo text-center\">\n");
      out.write("                                                <img src=\"images/home/gallery4.jpg\" alt=\"\" />\n");
      out.write("                                                <h2>$56</h2>\n");
      out.write("                                                <p>Easy Polo Black Edition</p>\n");
      out.write("                                                <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"tab-pane fade\" id=\"blazers\" >\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <div class=\"product-image-wrapper\">\n");
      out.write("                                        <div class=\"single-products\">\n");
      out.write("                                            <div class=\"productinfo text-center\">\n");
      out.write("                                                <img src=\"images/home/gallery4.jpg\" alt=\"\" />\n");
      out.write("                                                <h2>$56</h2>\n");
      out.write("                                                <p>Easy Polo Black Edition</p>\n");
      out.write("                                                <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <div class=\"product-image-wrapper\">\n");
      out.write("                                        <div class=\"single-products\">\n");
      out.write("                                            <div class=\"productinfo text-center\">\n");
      out.write("                                                <img src=\"images/home/gallery3.jpg\" alt=\"\" />\n");
      out.write("                                                <h2>$56</h2>\n");
      out.write("                                                <p>Easy Polo Black Edition</p>\n");
      out.write("                                                <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <div class=\"product-image-wrapper\">\n");
      out.write("                                        <div class=\"single-products\">\n");
      out.write("                                            <div class=\"productinfo text-center\">\n");
      out.write("                                                <img src=\"images/home/gallery2.jpg\" alt=\"\" />\n");
      out.write("                                                <h2>$56</h2>\n");
      out.write("                                                <p>Easy Polo Black Edition</p>\n");
      out.write("                                                <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <div class=\"product-image-wrapper\">\n");
      out.write("                                        <div class=\"single-products\">\n");
      out.write("                                            <div class=\"productinfo text-center\">\n");
      out.write("                                                <img src=\"images/home/gallery1.jpg\" alt=\"\" />\n");
      out.write("                                                <h2>$56</h2>\n");
      out.write("                                                <p>Easy Polo Black Edition</p>\n");
      out.write("                                                <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"tab-pane fade\" id=\"sunglass\" >\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <div class=\"product-image-wrapper\">\n");
      out.write("                                        <div class=\"single-products\">\n");
      out.write("                                            <div class=\"productinfo text-center\">\n");
      out.write("                                                <img src=\"images/home/gallery3.jpg\" alt=\"\" />\n");
      out.write("                                                <h2>$56</h2>\n");
      out.write("                                                <p>Easy Polo Black Edition</p>\n");
      out.write("                                                <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <div class=\"product-image-wrapper\">\n");
      out.write("                                        <div class=\"single-products\">\n");
      out.write("                                            <div class=\"productinfo text-center\">\n");
      out.write("                                                <img src=\"images/home/gallery4.jpg\" alt=\"\" />\n");
      out.write("                                                <h2>$56</h2>\n");
      out.write("                                                <p>Easy Polo Black Edition</p>\n");
      out.write("                                                <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <div class=\"product-image-wrapper\">\n");
      out.write("                                        <div class=\"single-products\">\n");
      out.write("                                            <div class=\"productinfo text-center\">\n");
      out.write("                                                <img src=\"images/home/gallery1.jpg\" alt=\"\" />\n");
      out.write("                                                <h2>$56</h2>\n");
      out.write("                                                <p>Easy Polo Black Edition</p>\n");
      out.write("                                                <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <div class=\"product-image-wrapper\">\n");
      out.write("                                        <div class=\"single-products\">\n");
      out.write("                                            <div class=\"productinfo text-center\">\n");
      out.write("                                                <img src=\"images/home/gallery2.jpg\" alt=\"\" />\n");
      out.write("                                                <h2>$56</h2>\n");
      out.write("                                                <p>Easy Polo Black Edition</p>\n");
      out.write("                                                <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"tab-pane fade\" id=\"kids\" >\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <div class=\"product-image-wrapper\">\n");
      out.write("                                        <div class=\"single-products\">\n");
      out.write("                                            <div class=\"productinfo text-center\">\n");
      out.write("                                                <img src=\"images/home/gallery1.jpg\" alt=\"\" />\n");
      out.write("                                                <h2>$56</h2>\n");
      out.write("                                                <p>Easy Polo Black Edition</p>\n");
      out.write("                                                <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <div class=\"product-image-wrapper\">\n");
      out.write("                                        <div class=\"single-products\">\n");
      out.write("                                            <div class=\"productinfo text-center\">\n");
      out.write("                                                <img src=\"images/home/gallery2.jpg\" alt=\"\" />\n");
      out.write("                                                <h2>$56</h2>\n");
      out.write("                                                <p>Easy Polo Black Edition</p>\n");
      out.write("                                                <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <div class=\"product-image-wrapper\">\n");
      out.write("                                        <div class=\"single-products\">\n");
      out.write("                                            <div class=\"productinfo text-center\">\n");
      out.write("                                                <img src=\"images/home/gallery3.jpg\" alt=\"\" />\n");
      out.write("                                                <h2>$56</h2>\n");
      out.write("                                                <p>Easy Polo Black Edition</p>\n");
      out.write("                                                <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <div class=\"product-image-wrapper\">\n");
      out.write("                                        <div class=\"single-products\">\n");
      out.write("                                            <div class=\"productinfo text-center\">\n");
      out.write("                                                <img src=\"images/home/gallery4.jpg\" alt=\"\" />\n");
      out.write("                                                <h2>$56</h2>\n");
      out.write("                                                <p>Easy Polo Black Edition</p>\n");
      out.write("                                                <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"tab-pane fade\" id=\"poloshirt\" >\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <div class=\"product-image-wrapper\">\n");
      out.write("                                        <div class=\"single-products\">\n");
      out.write("                                            <div class=\"productinfo text-center\">\n");
      out.write("                                                <img src=\"images/home/gallery2.jpg\" alt=\"\" />\n");
      out.write("                                                <h2>$56</h2>\n");
      out.write("                                                <p>Easy Polo Black Edition</p>\n");
      out.write("                                                <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <div class=\"product-image-wrapper\">\n");
      out.write("                                        <div class=\"single-products\">\n");
      out.write("                                            <div class=\"productinfo text-center\">\n");
      out.write("                                                <img src=\"images/home/gallery4.jpg\" alt=\"\" />\n");
      out.write("                                                <h2>$56</h2>\n");
      out.write("                                                <p>Easy Polo Black Edition</p>\n");
      out.write("                                                <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <div class=\"product-image-wrapper\">\n");
      out.write("                                        <div class=\"single-products\">\n");
      out.write("                                            <div class=\"productinfo text-center\">\n");
      out.write("                                                <img src=\"images/home/gallery3.jpg\" alt=\"\" />\n");
      out.write("                                                <h2>$56</h2>\n");
      out.write("                                                <p>Easy Polo Black Edition</p>\n");
      out.write("                                                <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <div class=\"product-image-wrapper\">\n");
      out.write("                                        <div class=\"single-products\">\n");
      out.write("                                            <div class=\"productinfo text-center\">\n");
      out.write("                                                <img src=\"images/home/gallery1.jpg\" alt=\"\" />\n");
      out.write("                                                <h2>$56</h2>\n");
      out.write("                                                <p>Easy Polo Black Edition</p>\n");
      out.write("                                                <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div><!--/category-tab-->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <nav style=\"margin: 20px auto; width: 300px;\"aria-label=\"...\">\n");
      out.write("            <ul class=\"pagination pagination-lg\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    </footer><!--/Footer-->\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("    <script src=\"js/price-range.js\"></script>\n");
      out.write("    <script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        var input = document.getElementById('search');\n");
      out.write("        document.getElementById('search').setSelectionRange(input.value.length, input.value.length);\n");
      out.write("    </script>\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"col-sm-4\">\n");
          out.write("                                    <div class=\"product-image-wrapper\">\n");
          out.write("                                        <div class=\"single-products\">\n");
          out.write("                                            <div class=\"productinfo text-center\">\n");
          out.write("                                                <a href=\"ProductDetail.jsp?img=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&price=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&pName=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&sId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" /></a>\n");
          out.write("                                                <h2>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h2>\n");
          out.write("                                                <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
          out.write("                                            </div>\n");
          out.write("                                            <div class=\"product-overlay\">\n");
          out.write("                                                <div class=\"overlay-content\">\n");
          out.write("                                                    <h2>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h2>\n");
          out.write("                                                    <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"choose\">\n");
          out.write("                                            <ul class=\"nav nav-pills nav-justified\">\n");
          out.write("                                                <li><a href=\"#\"><i class=\"fa fa-plus-square\"></i>Add to wishlist</a></li>\n");
          out.write("                                                <li><a href=\"#\"><i class=\"fa fa-plus-square\"></i>Add to compare</a></li>\n");
          out.write("                                            </ul>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
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

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        <a href=\"login.jsp\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
        out.write("                                                    ");
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

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        <a href=\"CartController?img=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&price=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&pName=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&sId=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"btn btn-default add-to-cart\">\n");
        out.write("                                                            <i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
        out.write("                                                        ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setBegin(1);
    _jspx_th_c_forEach_1.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.totalPage()}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_1.setVar("o");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <li class=\"page-item\"><a class=\"page-link\" href=\"pagingController?index=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
