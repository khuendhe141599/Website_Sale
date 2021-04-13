<%-- 
    Document   : myorder
    Created on : Oct 31, 2020, 12:18:44 AM
    Author     : Khue Nguyen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Order Page</title>
        <jsp:include page="Head.jsp"/>
    </head>
    <body>
        <jsp:include page="Header.jsp"/>
        <div class="container">
            <table class="table table-striped table-dark">
                <thead>
                    <tr>
                        <th scope="col">MDH</th>
                        <th scope="col">Name</th>
                        <th scope="col">Price</th>
                        <th scope="col">Date</th>
                        <th scope="col">Order</th>
                        <th scope="col">Phone</th>
                        <th scope="col">EDIT</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listOrder}" var="o">
                        <tr>
                            <td>${o.mdh}</td>
                            <td>${o.name}</td>
                            <td>${o.totalPrice}</td>
                            <td>${o.date}</td>
                            <td>${o.address}</td>
                            <td>${o.phone}</td>
                            <td>
                                <a href="DeleteOrder?id=${o.mdh}"
                                   onclick="return confirm('Are you sure you want to DELETE?');" >Remove Order</a>
                            </td>
                            
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <jsp:include page="Footer.jsp"/>
    </body>
</html>
