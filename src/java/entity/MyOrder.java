/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author Khue Nguyen
 */
public class MyOrder {

    private int mdh;
    private String userName;
    private String name;
    private float totalPrice;
    private Date date;
    private String address;
    private String phone;

    public MyOrder() {
    }

    public MyOrder(int mdh, String userName, String name, float totalPrice, Date date, String address, String phone) {
        this.mdh = mdh;
        this.userName = userName;
        this.name = name;
        this.totalPrice = totalPrice;
        this.date = date;
        this.address = address;
        this.phone = phone;
    }

    public int getMdh() {
        return mdh;
    }

    public void setMdh(int mdh) {
        this.mdh = mdh;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
