<%-- 
    Document   : homePage
    Created on : Oct 11, 2020, 2:24:40 PM
    Author     : Khue Nguyen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home | E-Shopper</title>
        <jsp:include page="Head.jsp"/>
        <jsp:useBean id="a" class="ControllerDAO.DAO" scope="request"></jsp:useBean>
        </head>
        <body>

        <jsp:include page="Header.jsp"/>

        <section id="slider">
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <div id="slider-carousel" class="carousel slide" data-ride="carousel">
                            <ol class="carousel-indicators">
                                <li data-target="#slider-carousel" data-slide-to="0" class="active"></li>
                                <li data-target="#slider-carousel" data-slide-to="1"></li>
                                <li data-target="#slider-carousel" data-slide-to="2"></li>
                            </ol>

                            <div class="carousel-inner">
                                <div class="item active">
                                    <div class="col-sm-6">
                                        <h1><span>E</span>-SHOPPER</h1>
                                        <h2>Free E-Commerce Template</h2>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                                        <button type="button" class="btn btn-default get">Get it now</button>
                                    </div>
                                    <div class="col-sm-6">
                                        <img src="images/home/girl1.jpg" class="girl img-responsive" alt="" />
                                        <img src="images/home/pricing.png"  class="pricing" alt="" />
                                    </div>
                                </div>
                                <div class="item">
                                    <div class="col-sm-6">
                                        <h1><span>E</span>-SHOPPER</h1>
                                        <h2>100% Responsive Design</h2>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                                        <button type="button" class="btn btn-default get">Get it now</button>
                                    </div>
                                    <div class="col-sm-6">
                                        <img src="images/home/girl2.jpg" class="girl img-responsive" alt="" />
                                        <img src="images/home/pricing.png"  class="pricing" alt="" />
                                    </div>
                                </div>

                                <div class="item">
                                    <div class="col-sm-6">
                                        <h1><span>E</span>-SHOPPER</h1>
                                        <h2>Free Ecommerce Template</h2>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                                        <button type="button" class="btn btn-default get">Get it now</button>
                                    </div>
                                    <div class="col-sm-6">
                                        <img src="images/home/girl3.jpg" class="girl img-responsive" alt="" />
                                        <img src="images/home/pricing.png" class="pricing" alt="" />
                                    </div>
                                </div>
                            </div>
                            <a href="#slider-carousel" class="left control-carousel hidden-xs" data-slide="prev">
                                <i class="fa fa-angle-left"></i>
                            </a>
                            <a href="#slider-carousel" class="right control-carousel hidden-xs" data-slide="next">
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </div>

                    </div>
                </div>
            </div>
        </section>

        <section>
            <div class="container">
                <div class="row">
                    <div class="col-sm-3">
                        <div class="left-sidebar">
                            <h2>Category</h2>
                            <div class="panel-group category-products" id="accordian"><!--category-productsr-->
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title"><a href="#">Sweater</a></h4>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title"><a href="#">Evening jacket</a></h4>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title"><a href="#">Hoodies Men</a></h4>
                                    </div>
                                </div>
                            </div><!--/category-products-->
                            <div class="price-range"><!--price-range-->
                                <h2>Price Range</h2>
                                <div class="well">
                                    <input type="text" class="span2" value="" data-slider-min="0" 
                                           data-slider-max="600" data-slider-step="5" data-slider-value="[0,300]" id="sl2" ><br />
                                    <b>$ 0</b> <b class="pull-right">$ 600</b>
                                </div>
                            </div><!--/price-range-->
                            <div class="shipping text-center"><!--shipping-->
                                <img src="images/home/shipping.jpg" alt="" />
                            </div><!--/shipping-->
                        </div>
                    </div>

                    <div class="col-sm-9 padding-right">
                        <div class="features_items"><!--features_items-->
                            <h2 class="title text-center">Features Items</h2>
                            <c:forEach items="${list}" var="o" >
                                <div class="col-sm-4">
                                    <div class="product-image-wrapper">
                                        <div class="single-products">
                                            <div class="productinfo text-center">
                                                <a href="ProductDetail.jsp?img=${o.image}&price=${o.price}&pName=${o.productName}&sId=${o.productID}">
                                                    <img src="${o.image}" alt="" /></a>
                                                <h2>${o.price}</h2>
                                                <p>${o.productName}</p>
                                                <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                            </div>
                                            <div class="product-overlay">
                                                <div class="overlay-content">
                                                    <h2>${o.price}</h2>
                                                    <p>${o.productName}</p>
                                                    <c:if test="${sessionScope.account == null}">
                                                        <a href="login.jsp" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                    </c:if>
                                                    <c:if test="${sessionScope.account != null}">
                                                        <a href="CartController?img=${o.image}&price=${o.price}&pName=${o.productName}&sId=${o.productID}" class="btn btn-default add-to-cart">
                                                            <i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                        </c:if>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="choose">
                                            <ul class="nav nav-pills nav-justified">
                                                <li><a href="likeProduct?likeId=${o.productID}"><i class="fa fa-plus-square"></i>Add to wishlist</a></li>
                                                <li><a href="#"><i class="fa fa-plus-square"></i>Add to compare</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </div><!--features_items-->

                </div>
            </div>
        </section>
        <nav style="margin: 20px auto; width: 300px;"aria-label="...">
            <ul class="pagination pagination-lg">
                <c:forEach begin="1" end="${a.totalPage()}" var="o">
                    <li class="page-item"><a class="page-link" href="pagingController?index=${o}">${o}</a></li>
                    </c:forEach>
            </ul>
        </nav>
        <jsp:include page="Footer.jsp"/>

    </footer><!--/Footer-->
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.scrollUp.min.js"></script>
    <script src="js/price-range.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/main.js"></script>
    <script>
        var input = document.getElementById('search');
        document.getElementById('search').setSelectionRange(input.value.length, input.value.length);
    </script>
</body>
</html>
