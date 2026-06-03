package com.sai.webappproj.service;
import com.sai.webappproj.model.Products;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;


@Service
public class ProductService {

    List<Products>products=new ArrayList<>(Arrays.asList(new Products(1,"phone",50000),new Products(2,"laptop",70000)));
    public List<Products> getproducts(){
        return products;
    }
    public Products getprodbyid(int prodid){
        return products.stream().filter(p->p.getProdid()==prodid).findFirst().orElse(new Products(0,"noItem",0));
    }

    public void addprod(Products prod){
        products.add(prod);
    }

    public void upprod(Products prod) {
        int index=0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdid()==prod.getProdid()){
                index=i;
            }
            products.set(index,prod);
        }
    }

    public void del(int prodid) {
        int index=0;
        for(int i=0;i<products.size();i++) {
            if (products.get(i).getProdid() == prodid) {
                index = i;
            }
            products.remove(index);
        }
    }
}
