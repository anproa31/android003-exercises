package com.rxmobileteam.lecture1.service;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface ProductRepository {
    boolean add(@NotNull Product product);
    List<Product> findAll();
}
