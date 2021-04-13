<%-- 
    Document   : Contact
    Created on : Oct 18, 2020, 12:08:38 AM
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
            <div class="container"  id="contact-page">
                <div class="bg">
                    <div class="row">    
                        <div class="col-sm-8">
                            <form action="SaveContactUser" method="post">
                                <div class="form-group col-md-6">
                                    <input type="text" name="id" class="form-control" readonly value="${sessionScope.id}" required="required" placeholder="ID">
                            </div>
                            <div class="form-group col-md-6">
                                <input type="text" name="name" class="form-control" required="required" placeholder="Name">
                            </div>
                            <div class="form-group col-md-12">
                                <input type="email" name="email" class="form-control" required="required" placeholder="Email">
                            </div>
                            <div class="form-group col-md-12">
                                <input type="text" name="address" class="form-control" required="required" placeholder="Address">
                            </div>
                            <div class="form-group col-md-12">
                                <input type="text" name="phone" class="form-control" required="required" placeholder="Phone number">
                            </div>
                            <div class="form-group col-md-12">
                                <input type="date" name="date" class="form-control" required="required" placeholder="Date">
                            </div>
                            <div class="form-group col-md-12">
                                <input type="text" name="subject" class="form-control" required="required" placeholder="Subject">
                            </div>
                            <div class="form-group col-md-12">
                                <textarea name="message" id="message" required="required" class="form-control" rows="8" placeholder="Your Message Here"></textarea>
                            </div>    
                            <input class="btn btn-primary" type="submit" value="Submit" style="margin-bottom: 20px">
                        </form>
                    </div>
                    <div class="col-sm-4">
                        <div class="contact-info">
                            <h2 class="title text-center">Contact Info</h2>
                            <address>
                                <p>E-Shopper Inc.</p>
                                <p>935 Tòa nhà trung tâm Lotte Hà Nội, 54 Liễu Giai, phường Cống Vị, Quận Ba Đình, Hà Nội</p>
                                <p>HÀ NỘI</p>
                                <p>Mobile: +2346 17 38 93</p>
                                <p>Fax: 1-714-252-0026</p>
                                <p>Email: info@e-shopper.com</p>
                            </address>
                            <div class="social-networks">
                                <h2 class="title text-center">Social Networking</h2>
                                <ul>
                                    <li>
                                        <a href="#"><i class="fa fa-facebook"></i></a>
                                    </li>
                                    <li>
                                        <a href="#"><i class="fa fa-twitter"></i></a>
                                    </li>
                                    <li>
                                        <a href="#"><i class="fa fa-google-plus"></i></a>
                                    </li>
                                    <li>
                                        <a href="#"><i class="fa fa-youtube"></i></a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>    	
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
