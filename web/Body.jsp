<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="a" class="ControllerDAO.DAO" scope="request"></jsp:useBean>
    <section id="advertisement">
        <div class="container">
            <img src="images/shop/advertisement.jpg" alt="" />
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
                        </div>
                    </c:forEach>
                </div>
            </div><!--features_items-->
        </div>
    </div>
    <nav style="margin: 20px auto; width: 300px;"aria-label="...">
        <ul class="pagination pagination-lg">
            <c:forEach begin="1" end="${a.totalPage()}" var="o">
                <li class="page-item"><a class="page-link" href="pagingProduct?index=${o}">${o}</a></li>
                </c:forEach>
        </ul>
    </nav>
</section>