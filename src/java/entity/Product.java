/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Khue Nguyen
 */
public class Product {

    private int ProductID;
    private String ProductName;
    private int GroupProductID;
    private String Detail;
    private float Price;
    private String image;
    private String Date;
    private int order;

    public Product() {
    }

    public Product(int ProductID, String ProductName, int GroupProductID, String Detail, float Price, String image, String Date, int order) {
        this.ProductID = ProductID;
        this.ProductName = ProductName;
        this.GroupProductID = GroupProductID;
        this.Detail = Detail;
        this.Price = Price;
        this.image = image;
        this.Date = Date;
        this.order = order;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public int getGroupProductID() {
        return GroupProductID;
    }

    public void setGroupProductID(int GroupProductID) {
        this.GroupProductID = GroupProductID;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Product{" + "ProductID=" + ProductID + ", ProductName=" + ProductName + ", GroupProductID=" + GroupProductID + ", Detail=" + Detail + ", Price=" + Price + ", image=" + image + ", Date=" + Date + ", order=" + order + '}';
    }
    
}
