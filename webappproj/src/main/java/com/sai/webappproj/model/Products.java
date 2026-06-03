package com.sai.webappproj.model;

import org.springframework.stereotype.Service;




public class Products {
    private int prodid;
    private String prodname;
    private int price;
    public Products() {
    }

    public Products(int prodid, String prodname, int price) {
        this.prodid = prodid;
        this.prodname = prodname;
        this.price = price;
    }

    public int getProdid() {
        return prodid;
    }

    public void setProdid(int prodid) {
        this.prodid = prodid;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
