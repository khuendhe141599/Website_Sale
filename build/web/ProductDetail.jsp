<%-- 
    Document   : ProductDetail
    Created on : Oct 19, 2020, 11:03:13 AM
    Author     : Khue Nguyen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="Head.jsp"></jsp:include>
        </head>
        <body>
        <jsp:include page="Header.jsp"></jsp:include>

            <section>
                <div class="container">
                    <div class="row">
                        <div class="col-sm-3">
                            <div class="left-sidebar">
                                <h2>Category</h2>
                                <div class="panel-group category-products" id="accordian"><!--category-productsr-->
                                    <div class="panel panel-default">
                                        <div class="panel-heading">
                                            <h4 class="panel-title"><a href="#">Kids</a></h4>
                                        </div>
                                    </div>
                                    <div class="panel panel-default">
                                        <div class="panel-heading">
                                            <h4 class="panel-title"><a href="#">Fashion</a></h4>
                                        </div>
                                    </div>
                                    <div class="panel panel-default">
                                        <div class="panel-heading">
                                            <h4 class="panel-title"><a href="#">Households</a></h4>
                                        </div>
                                    </div>
                                </div><!--/category-products-->
                            </div>
                        </div>

                        <div class="col-sm-9 padding-right">
                            <div class="product-details"><!--product-details-->

                                <div class="col-sm-5">
                                    <div class="view-product">
                                        <img src="${param.img}" alt="" />
                                </div>
                                <div id="similar-product" class="carousel slide" data-ride="carousel">
                                    <!-- Wrapper for slides -->
                                    <!-- Controls -->
                                    <a class="left item-control" href="#similar-product" data-slide="prev">
                                        <i class="fa fa-angle-left"></i>
                                    </a>
                                    <a class="right item-control" href="#similar-product" data-slide="next">
                                        <i class="fa fa-angle-right"></i>
                                    </a>
                                </div>
                            </div>

                            <div class="col-sm-7">
                                <div class="product-information"><!--/product-information-->
                                    <img src="images/product-details/new.jpg" class="newarrival" alt="" />
                                    <h2>${param.pName}</h2>
                                    <p>${param.sId}</p>
                                    <img src="images/product-details/rating.png" alt="" />
                                    <span>
                                        <span>${param.price}</span>
                                        <label>Quantity:</label>
                                        <input type="number" value="1" min="1" name="number"/>
                                        <c:if test="${sessionScope.account == null}">
                                            <a href="login.jsp">
                                                <button type="submit" class="btn btn-fefault cart">
                                                    <i class="fa fa-shopping-cart"></i>
                                                    Add to cart
                                                </button>
                                            </a>
                                        </c:if>
                                        <c:if test="${sessionScope.account != null}">
                                            <a href="CartController?img=${param.img}&price=${param.price}&pName=${param.pName}&sId=${param.sId}&quality=<%=request.getParameter("number")%>">
                                                <button type="submit" class="btn btn-fefault cart">
                                                    <i class="fa fa-shopping-cart"></i>
                                                    Add to cart
                                                </button>
                                            </a>
                                        </c:if>
                                    </span>
                                </div>
                                <p><b>Availability:</b> In Stock</p>
                                <p><b>Condition:</b> New</p>
                                <p><b>Brand:</b> E-SHOPPER</p>
                                <a href=""><img src="images/product-details/share.png" class="share img-responsive"  alt="" /></a>
                            </div><!--/product-information-->
                        </div> 
                        <c:if test="${sessionScope.account != null}">
                            <c:if test="${sessionScope.account.isCreator == 1}">
                                <a href="AdminUpdate.jsp?id1=${param.sId}&pName=${param.pName}&price=${param.price}&img=${param.img}">
                                    <button class="btn btn-fefault cart">UPDATE</button></a>
                                <a href="AdminCreate.jsp"><button class="btn btn-fefault cart">CREATE</button></a>
                                <a href="DeteleProductController?id=${param.sId}" class="btn btn-fefault cart"
                                   onclick="return confirm('Are you sure you want to DELETE?');">DELETE</a>
                            </c:if>
                        </c:if>
                    </div><!--/product-details-->

                </div>
            </div>
        </section>
        <jsp:include page="Footer.jsp"></jsp:include>
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.scrollUp.min.js"></script>
        <script src="js/price-range.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
