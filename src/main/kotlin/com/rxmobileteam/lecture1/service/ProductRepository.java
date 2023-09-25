package com.rxmobileteam.lecture1.service;


import java.util.List;

public interface ProductRepository {
    boolean add(Product product);
    List<Product> findAll();
}
