package com.sai.webappproj.controller;

import com.sai.webappproj.model.Products;
import com.sai.webappproj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @GetMapping("/products")
    public List<Products> getprod(){
        return service.getproducts();
    }
    @GetMapping("/products/{prodid}")
    public Products getprodbyid(@PathVariable int prodid){
        return service.getprodbyid(prodid);
    }
    @PostMapping("/products")
    public void addprod(@RequestBody Products prod){
        service.addprod(prod);
    }
    @PutMapping("/products")
    public void upprod(@RequestBody Products prod){
        service.upprod(prod);
    }

    @DeleteMapping("/products/{prodid}")
    public void del(@PathVariable int prodid ){
        service.del(prodid);
    }



}
