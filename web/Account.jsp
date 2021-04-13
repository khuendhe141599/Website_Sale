<%-- 
    Document   : Account
    Created on : Oct 23, 2020, 11:06:25 AM
    Author     : Khue Nguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="Head.jsp"></jsp:include>
        </head>
        <body>
        <jsp:include page="Header.jsp"></jsp:include>
            <div class="container">
                <div class="row">
                    <div class="col-sm-3">
                        <div class="left-sidebar">
                            <h2>Information User</h2>
                            <div class="panel-group category-products" id="accordian"><!--category-productsr-->
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title"><a href="Account.jsp"><i class="fa fa-user-circle"></i>Account</a></h4>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title"><a href="loadMyOrder">My Order</a></h4>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title"><a href="#">Notification</a></h4>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-9 padding-right">
                        <form action="SaveInformationUser" method="post">
                            <div class="form-group col-md-9">
                                <input type="text" name="id" class="form-control" readonly value="${sessionScope.id}" required="required" placeholder="ID">
                        </div>
                        <div class="form-group col-md-9">
                            <input type="text" name="name" class="form-control" value="${sessionScope.user}"  required="required" placeholder="Name">
                        </div>
                        <div class="form-group col-md-9">
                            <input type="email" name="email" class="form-control" value="${sessionScope.email}" required="required" placeholder="Email">
                        </div>
                        <div class="form-group col-md-9">
                            <input type="text" name="address" class="form-control" value="${sessionScope.address}" required="required" placeholder="Address">
                        </div>
                        <div class="form-group col-md-9">
                            <input type="text" name="phone" class="form-control" value="${sessionScope.phone}" required="required" placeholder="Phone number">
                        </div>
                        <div class="form-group col-md-9">
                            <input type="text" name="date" class="form-control"  value="${sessionScope.date1}" required="required" placeholder="Date">
                        </div>
                        <div class="form-group col-md-9">
                            <input type="text" name="subject" class="form-control" required="required" placeholder="Subject">
                        </div>
                        <div class="form-group col-md-9">
                            <input class="btn btn-primary" type="submit" value="Save" style="margin-bottom: 20px">
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <jsp:include page="Footer.jsp"></jsp:include>
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.scrollUp.min.js"></script>
        <script src="js/price-range.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
