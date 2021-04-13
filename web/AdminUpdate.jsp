<%-- 
    Document   : AdminUpdate
    Created on : Oct 17, 2020, 12:57:13 PM
    Author     : Khue Nguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="Head.jsp"></jsp:include>
        </head>
        <body>
        <jsp:include page="Header.jsp"></jsp:include>
            <div class="container">
                <form action="UpdateProductController" method="post">
                    <div class="form-group col-md-6">
                        <input type="number" name="ProductID" class="form-control" value="${param.id1}" placeholder="ProductID" readonly="">
                </div>
                <div class="form-group col-md-6">
                    <input type="text" name="ProductName" class="form-control" value="${param.pName}" required="required" placeholder="ProductName">
                </div>
                <div class="form-group col-md-12">
                    <input type="number" name="GroupProductID" class="form-control" value="${param.gId}" required="required" placeholder="GroupProductID">
                </div>
                <div class="form-group col-md-12">
                    <input type="text" name="Detail" class="form-control" value="${param.detail}"required="required" placeholder="Detail">
                </div>
                <div class="form-group col-md-12">
                    <input type="text" name="Price" class="form-control" value="${param.price}"required="required" placeholder="Price">
                </div>
                <div class="form-group col-md-12">
                    <input type="text" name="Image" class="form-control" value="${param.img}"required="required" placeholder="Image">
                </div>
                <div class="form-group col-md-12">
                    <input type="text" name="Date" class="form-control" value="${param.date}"required="required" placeholder="Date">
                </div>
                <div class="form-group col-md-12">
                    <input type="number" name="Order" class="form-control" value="${param.order}"required="required" placeholder="Order">
                </div>
                <input class="btn btn-primary" type="submit" value="Submit">
            </form>
        </div>
    </body>
</html>
