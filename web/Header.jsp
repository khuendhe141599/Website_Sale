<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header id="header"><!--header-->
    <div class="header_top"><!--header_top-->
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    <div class="contactinfo">
                        <ul class="nav nav-pills">
                            <li><a href=""><i class="fa fa-phone"></i> +84 969-133-718</a></li>
                            <li><a href=""><i class="fa fa-envelope"></i> KhueNDHe141599@fpt.edu.vn</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="social-icons pull-right">
                        <ul class="nav navbar-nav">
                            <li><a href="https://www.facebook.com/tala.khue"><i class="fa fa-facebook"></i></a></li>
                            <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                            <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                            <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
                            <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div><!--/header_top-->

    <div class="header-middle"><!--header-middle-->
        <div class="container">
            <div class="row">
                <div class="col-md-4 clearfix">
                    <div class="logo pull-left">
                        <a href="pagingController"><img src="images/home/logo.png" alt="" /></a>
                    </div>
                </div>
                <div class="col-md-8 clearfix">
                    <div class="shop-menu clearfix pull-right">
                        <ul class="nav navbar-nav">

                            <c:if test="${sessionScope.account == null}">
                                <li><a href="login.jsp"><i class="fa fa-lock"></i> Login</a></li>
                                </c:if>

                            <c:if test="${sessionScope.account != null}">
                                <!--admin-->
                                <c:if test="${sessionScope.account.isCreator == 1}">
                                    <li><a href="Admin.jsp"><i class=""></i>ADMIN</a></li>
                                    <li><a href="LogoutController"><i class="fa fa-sign-out"></i>Logout</a></li>
                                    </c:if>
                                <!--User-->
                                <c:if test="${sessionScope.account.isCreator != 1}">
                                    <li><a href="LogoutController"><i class="fa fa-sign-out"></i>Logout</a></li>
                                    <li><a href=""><i class="fa fa-star"></i> Wishlist</a></li>
                                    <li><a href="Account.jsp"><i class="fa fa-user"></i>${sessionScope.user}</a></li>
                                    <li><a href="checkOut.jsp"><i class="fa fa-crosshairs"></i> Checkout</a></li>
                                    <li><a href="loadAllProductCart" style="color: red;">
                                            <i class="fa fa-shopping-cart"></i> Cart 
                                            <c:if test="${sessionScope.listC == null}">
                                                <sub>(<span>0</span>)</sub></a>
                                            </c:if>
                                            <c:if test="${sessionScope.listC != null}">
                                            <sub>(<span>${sessionScope.countProduct}</span>)</sub></a>
                                        </c:if>
                                    </li>
                                </c:if>
                            </c:if>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div><!--/header-middle-->

    <div class="header-bottom"><!--header-bottom-->
        <div class="container">
            <div class="row">
                <div class="col-sm-9">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </div>
                    <div class="mainmenu pull-left">
                        <div class="mainmenu pull-left">
                            
                            <!--List Admin-->
                            <c:if test="${sessionScope.id == 1}">
                                <a href="Admin.jsp">All Product</a>
                                <a href="loadMyOrder">All Order</a>
                                <a href="AdminAccount.jsp">Admin Account</a>
                            </c:if>  

                            <!--User-->
                            <c:if test="${sessionScope.id != 1}">
                                <ul class="nav navbar-nav collapse navbar-collapse">
                                    <li><a href="pagingController" class="active"><i class="fa fa-home"></i>Home</a></li>
                                    <li class="dropdown"><a href="#">Shop<i class="fa fa-angle-down"></i></a>
                                        <ul role="menu" class="sub-menu">
                                            <li><a href="pagingProduct"><i class="fa fa-product-hunt"></i>Products</a></li>
                                                <c:if test="${sessionScope.account == null}">
                                                <li><a href="login.jsp">Login</a></li> 
                                                </c:if>
                                                <c:if test="${sessionScope.account != null}">
                                                <li><a href="checkOut.jsp">Checkout</a></li> 
                                                <li><a href="loadAllProductCart">Cart</a></li> 
                                                <li><a href="Contact.jsp">Contact</a></li>   
                                                </c:if>
                                        </ul>
                                    </li> 
                                </ul>
                            </c:if>
                        </div>
                    </div>
                </div>

                <!--Search-->
                <div class="col-sm-3">
                    <div class="search_box pull-right">
                        <form action="SearchController" method="post">
                            <input type="text" placeholder="Search"
                                   oninput="this.form.submit()" autofocus name="search1" id="search" value="${txtValue}">
                        </form>
                    </div>
                </div>

            </div>
        </div>
    </div>
</header>
