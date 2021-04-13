<%-- 
    Document   : Products
    Created on : Oct 17, 2020, 11:55:30 PM
    Author     : Khue Nguyen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Page</title>
        <jsp:include page="Head.jsp"/>
        <jsp:useBean id="a" class="ControllerDAO.DAO" scope="request"></jsp:useBean>
        </head>
        <body>

        <jsp:include page="Header.jsp"/>

        <jsp:include page="Body.jsp"></jsp:include>

        <jsp:include page="Footer.jsp"/>

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