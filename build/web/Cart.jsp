<%-- 
    Document   : Cart
    Created on : Oct 18, 2020, 1:32:07 PM
    Author     : Khue Nguyen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="Head.jsp"></jsp:include>
        <jsp:useBean id="a" class="ControllerDAO.DAO" scope="request"></jsp:useBean>
        </head>
        <body>
        <jsp:include page="Header.jsp"></jsp:include>

            <section id="cart_items">
                <div class="container">
                    <div class="breadcrumbs">
                        <ol class="breadcrumb">
                            <li><a href="pagingController">Home</a></li>
                            <li class="active">Shopping Cart</li>
                        </ol>
                    </div>
                    <div class="table-responsive cart_info">
                        <table class="table table-condensed">
                            <thead>
                                <tr class="cart_menu">
                                    <td class="image">Item</td>
                                    <td class="description"></td>
                                    <td class="price">Price</td>
                                    <td class="quantity">Quantity</td>
                                    <td class="total">Total</td>
                                    <td></td>
                                </tr>
                            </thead>
                            <tbody>

                            <c:forEach items="${list}" var="o">
                                <tr>
                                    <td class="cart_product"> 
                                        <a href=""><img src="${o.link}" alt="" style="width: 150px; height: 150px;"></a>
                                    </td>
                                    <td class="cart_description">
                                        <h4>${o.name}</h4>
                                        <p>${o.id}</p>
                                    </td>
                                    <td class="cart_price">
                                        <p>$ ${o.price}</p>
                                    </td>
                                    <td class="cart_quantity">
                                        <div class="cart_quantity_button">
                                            <input class="cart_quantity_input" type="text" name="quantity" value="${o.quatity}" autocomplete="off" size="2">
                                        </div>
                                    </td>
                                    <td class="cart_total">
                                        <p class="cart_total_price">$ ${(o.price) * o.quatity}  </p>
                                    </td>
                                    <td class="cart_delete">
                                        <a class="cart_quantity_delete" href="DeleteProduct?dId=${o.id}"><i class="fa fa-times"></i></a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </section> <!--/#cart_items-->
        <c:if test="${sessionScope.listC != null}">
            <section id="do_action">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-6">
                            <div class="total_area">
                                <ul>
                                    <li>Cart Sub Total <span>$ ${Sum}</span></li>
                                    <li>Shipping Cost <span>$ ${sessionScope.Tax}</span></li>
                                    <li>Total <span>$ ${Sum + sessionScope.Tax}</span></li>
                                </ul>
                                <a class="btn btn-default update" href="">Update</a>
                                <a class="btn btn-default check_out" href="checkOut.jsp?Sum=${Sum}">Check Out</a>
                            </div>
                        </div>
                    </div>
                </div>
            </section><!--/#do_action-->
        </c:if>
        <jsp:include page="Footer.jsp"></jsp:include>

        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.scrollUp.min.js"></script>
        <script src="js/price-range.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
