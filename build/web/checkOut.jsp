<%-- 
    Document   : checkOut
    Created on : Oct 11, 2020, 8:53:27 PM
    Author     : Khue Nguyen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home | E-Shopper</title>
        <jsp:include page="Head.jsp"></jsp:include>
        <jsp:useBean id="a" class="ControllerDAO.DAO" scope="request"></jsp:useBean>
        </head>
        <body>
        <jsp:include page="Header.jsp"></jsp:include>
            <section id="cart_items">
                <div class="container">
                    <div class="breadcrumbs">
                        <ol class="breadcrumb">
                            <li><a href="#">Home</a></li>
                            <li class="active">Check out</li>
                        </ol>
                    </div><!--/breadcrums-->

                    <div class="shopper-informations">
                        <div class="row">
                            <div class="col-sm-5 clearfix">
                                <div class="bill-to">
                                    <p>Bill To</p>
                                    <div class="form-one">
                                        <form action="CheckOut" method="post">
                                            <input type="text" placeholder="Email*" name="email" value="${sessionScope.email}">
                                        <input type="text" placeholder="Title" name="title">
                                        <input type="text" placeholder="Name *" name="name" value="${sessionScope.user}">
                                        <input type="text" placeholder="Address 1 *" name="address"  value="${sessionScope.address}">
                                        <input type="text" placeholder="Phone *" name="phone" value="${sessionScope.phone}">
                                        <a class="btn btn-primary" href="CheckOut"> <button type="submit">Payment for the orders </button></a>
                                    </form>
                                </div>
                                <div class="form-two">
                                    <form action="CheckOut" method="post">
                                        <input type="text" placeholder="Zip / Postal Code *" name="ZipCode">

                                    </form>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-4">
                            <div class="order-message">
                                <p>Shipping Order</p>
                                <textarea name="message"  placeholder="Notes about your order, Special Notes for Delivery" rows="16"></textarea>
                                <label><input type="checkbox"> Shipping to bill address</label>
                            </div>	
                        </div>					
                    </div>
                </div>
                <div class="review-payment">
                    <h2>Review & Payment</h2>
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
                                <td class="delete">Delete</td>
                                <td></td>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${sessionScope.listC}" var="o">
                                <tr>
                                    <td class="cart_product">
                                        <a href=""><img src="${o.link}" alt="" style="width: 150px; height: 150px;"></a>
                                    </td>
                                    <td class="cart_description">
                                        <h4><a href="">${o.name}</a></h4>
                                        <p>${o.id}</p>
                                    </td>
                                    <td class="cart_price">
                                        <p>$ ${o.price}</p>
                                    </td>
                                    <td class="cart_quantity">
                                        <div class="cart_quantity_button">
                                            <input class="cart_quantity_input" type="text" name="quantity"  value="${o.quatity}" autocomplete="off" size="2">
                                        </div>
                                    </td>
                                    <td class="cart_total">
                                        <p class="cart_total_price">$ ${(o.price)}</p>
                                    </td>
                                    <td class="cart_delete">
                                        <a class="cart_quantity_delete" href="DeleteProduct?dId=${o.id}"><i class="fa fa-times"></i></a>
                                    </td>
                                </tr>
                            </c:forEach>
                            <tr>
                                <td colspan="4">&nbsp;</td>
                                <td colspan="2">
                                    <table class="table table-condensed total-result">
                                        <tr>
                                            <td>Tax</td>
                                            <td><span>$ ${sessionScope.Tax}</span></td>
                                            <td>Total</td>
                                            <td><span>$ ${sessionScope.Sum + sessionScope.Tax}</span></td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                        </tbody>
                    </table>      
                </div>
            </div>
        </section>

        <jsp:include page="Footer.jsp"></jsp:include>
    </footer><!--/Footer-->
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.scrollUp.min.js"></script>
    <script src="js/price-range.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/main.js"></script>
</body>
</html>
