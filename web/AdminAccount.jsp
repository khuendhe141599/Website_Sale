<%-- 
    Document   : AdminAccount
    Created on : Nov 17, 2020, 1:40:35 PM
    Author     : Khue Nguyen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:useBean id="a" class="ControllerDAO.DAO" scope="request"/>
        <jsp:include page="Head.jsp"/>
    </head>
    <body>
        <jsp:include page="Header.jsp"/>
        <div class="container">
            <table class="table table-striped table-dark">
                <thead>
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Username</th>
                        <th scope="col">Password</th>
                        <th scope="col">Email</th>
                        <th scope="col">Is Create</th>
                        <th scope="col">Address</th>
                        <th scope="col">Phone</th>
                        <th scope="col">Date</th>
                        <th scope="col">EDIT</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${a.allAccount}" var="o">
                        <tr>
                            <td>${o.id}</td>
                            <td>${o.username}</td>
                            <td>${o.password}</td>
                            <td>${o.email}</td>
                            <td>${o.isCreator}</td>
                            <td>${o.address}</td>
                            <td>${o.phone}</td>
                            <td>${o.date}</td>
                            <td>
                                <a href="deleteAccount?id=${o.id}"
                                   onclick="return confirm('Are you sure you want to DELETE?');" >Remove Account</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <jsp:include page="Footer.jsp"/>
    </body>
</html>
