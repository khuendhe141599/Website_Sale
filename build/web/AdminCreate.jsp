<%-- 
    Document   : AdminCreate
    Created on : Oct 17, 2020, 10:51:31 PM
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
            <form action="CreateProductController" method="post">
                <div class="form-group col-md-12">
                    <input type="text" name="ProductName" class="form-control" required="required" placeholder="ProductName">
                </div>
                <div class="form-group col-md-12">
                    <input type="number" name="GroupProductID" class="form-control" required="required" placeholder="GroupProductID">
                </div>
                <div class="form-group col-md-12">
                    <input type="text" name="Detail" class="form-control" required="required" placeholder="Detail">
                </div>
                <div class="form-group col-md-12">
                    <input type="number" name="Price" class="form-control" required="required" placeholder="Price">
                </div>
                <div class="form-group col-md-12">
                    <input type="text" name="Image" class="form-control" required="required" placeholder="Image">
                </div>
                <div class="form-group col-md-12">
                    <input type="date" name="Date" class="form-control" required="required" placeholder="Date">
                </div>
                <div class="form-group col-md-12">
                    <input type="number" name="Order" class="form-control" required="required" placeholder="Order">
                </div>
                <input class="btn btn-primary" type="submit" value="Submit">
            </form>
        </div>
    </body>
</html>
