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
public class productCart {

    private String id;
    private String link;
    private String price;
    private String name;
    private String userName;
    private int quatity;

    public productCart() {
    }

    public productCart(String id, String link, String price, String name, String userName, int quatity) {
        this.id = id;
        this.link = link;
        this.price = price;
        this.name = name;
        this.userName = userName;
        this.quatity = quatity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

}
