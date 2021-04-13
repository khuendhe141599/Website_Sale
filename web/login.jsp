<%-- 
    Document   : product
    Created on : Oct 11, 2020, 8:04:08 PM
    Author     : Khue Nguyen
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="Head.jsp"/>
    </head>
    <body>
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
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div><!--/header-middle-->
        </header>

        <section id="form"><!--form-->
            <div class="container">
                <div class="row">

                    <div class="col-sm-4 col-sm-offset-1">
                        <div class="login-form"><!--login form-->
                            <h2>Login to your account</h2>
                            <form action="Login" method="post">
                                <c:forEach items="${pageContext.request.cookies}" var="o">
                                    <c:if test="${o.name eq 'username'}">
                                        <c:set var="username" value="${o.value}"></c:set>
                                    </c:if>
                                    <c:if test="${o.name eq 'password'}">
                                        <c:set var="password" value="${o.value}"></c:set>
                                    </c:if>
                                </c:forEach>
                                <input type="text" placeholder="Username" name="user" value="${username}"required=""/>
                                <input type="password" placeholder="Enter Password" value="${password}"name="pass" required=""/>
                                <span>
                                    <input type="checkbox" class="checkbox" name="remember"> 
                                    Keep me signed in
                                </span>
                                <button type="submit" class="btn btn-default">Login</button>
                            </form>
                            <p style="color: red; padding-top: 20px;">${MessError}</p>
                        </div><!--/login form-->
                    </div>

                    <div class="col-sm-1">
                        <h2 class="or">OR</h2>
                    </div>

                    <div class="col-sm-4">
                        <div class="signup-form"><!--sign up form-->
                            <h2>New User Signup!</h2>
                            <form action="SignUPController" method="post">
                                <input type="text" placeholder="Username" name="user" required=""/>
                                <input type="email" placeholder="Email Address" name="email" required=""/>
                                <input type="password" placeholder="Password" name="pass" required=""/>
                                <input type="text" placeholder="Address" name="address" required=""/>
                                <input type="text" placeholder="phone" name="phone" required=""/>
                                <input type="date" placeholder="Date" name="date" required=""/>
                                <button type="submit" class="btn btn-default">Signup</button>
                            </form>
                            <p style="color: blue; padding-top: 20px;">${Mess}</p>
                        </div><!--/sign up form-->
                    </div>
                </div>
            </div>
        </section><!--/form-->

        <jsp:include page="Footer.jsp"/>

        <script src="js/jquery.js"></script>
        <script src="js/price-range.js"></script>
        <script src="js/jquery.scrollUp.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
