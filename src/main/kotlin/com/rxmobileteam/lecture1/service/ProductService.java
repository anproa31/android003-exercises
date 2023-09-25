package com.rxmobileteam.lecture1.service;

import com.rxmobileteam.lecture1.data.ProductDao;
import com.rxmobileteam.utils.ExerciseNotCompletedException;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * {@link ProductService} provides an API that allows to manage {@link Product}s.
 * <p>
 * TODO: 1. Using {@link ProductDao} implement method {@link ProductService#addProduct(Product)}}
 * TODO: 2. Using {@link ProductDao} implement method {@link ProductService#searchProducts(String)}
 */
public class ProductService {

    /**
     * Adds a new product to the system.
     *
     * @param product a product to add
     * @return {@code true} if a product was added, {@code false} otherwise.
     */
    public boolean addProduct(@NotNull Product product) {
        return new ProductDao().add(product);
        // TODO: implement this method
//        throw new ExerciseNotCompletedException();
    }

    /**
     * Returns all products that contains the given query in the name or description.
     *
     * @param query a search query
     * @return a list of found products
     */
    public List<Product> searchProducts(String query) {
        List<Product> listProduct = new ProductDao().findAll();
        List<Product> listProductFound = new ArrayList<>();
        listProduct.forEach(e -> {
            String name = e.getName();
            String description = e.getDescription();
            String price = String.valueOf(e.getPrice());
            if (name.contains(query) || description.contains(query) || price.contains(query)) {
                listProductFound.add(e);
            }
        });
        return listProductFound;
        // TODO: implement this method
//        throw new ExerciseNotCompletedException();
    }
}