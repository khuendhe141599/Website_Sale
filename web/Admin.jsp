<%-- 
    Document   : Admin
    Created on : Oct 17, 2020, 12:13:09 PM
    Author     : Khue Nguyen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="Head.jsp"></jsp:include>
        <jsp:useBean id="a" class="ControllerDAO.DAO" scope="request"></jsp:useBean>
        </head>
        <body>
        <jsp:include page="Header.jsp"></jsp:include>
            <div class="container">
                <table class="table table-striped table-dark">
                    <thead>
                        <tr>
                            <th scope="col">ProductID</th>
                            <th scope="col">ProductName</th>
                            <th scope="col">GroupProductID</th>
                            <th scope="col">Detail</th>
                            <th scope="col">Price</th>
                            <th scope="col">Image</th>
                            <th scope="col">Date</th>
                            <th scope="col">Order</th>
                            <th scope="col">EDIT</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${a.allImg}" var="o">
                        <tr>
                            <td>${o.productID}</td>
                            <td>${o.groupProductID}</td>
                            <td>${o.productName}</td>
                            <td>${o.detail}</td>
                            <td>${o.price}</td>
                            <td><img src="${o.image}"style="width: 150px; height: 150px;"/></td>
                            <td>${o.date}</td>
                            <td>${o.order}</td>
                            <td>
                                <a href="AdminCreate.jsp">CREATE</a>
                                <a href="AdminUpdate.jsp?id1=${o.productID}&pName=${o.productName}&gId=${o.groupProductID}&detail=${o.detail}&price=${o.price}&img=${o.image}&date=${o.date}&order=${o.order}">UPDATE</a>
                                <a href="DeteleProductController?id=${o.productID}"
                                   onclick="return confirm('Are you sure you want to DELETE?');" >DELETE</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>

        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.scrollUp.min.js"></script>
        <script src="js/price-range.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
