package org.dependencyprac.springweb.service;

import org.dependencyprac.springweb.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products= Arrays.asList(new Product(101,"Iphone",5000),
                                            new Product(102,"Canon Camera",70000),
                                           new Product(103,"Shrure mic",100000));

    public List<Product>getProduct(){
        return products;
    }
}
