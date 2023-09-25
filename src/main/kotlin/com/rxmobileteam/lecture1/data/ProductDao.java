package com.rxmobileteam.lecture1.data;

import com.rxmobileteam.lecture1.service.Product;
import com.rxmobileteam.utils.ExerciseNotCompletedException;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * {@link ProductDao} represents a Data Access Object (DAO) for products.
 * The implementation is simplified, so it just uses {@link HashSet} to store. // HashMap to store.
 * <p>
 * todo: 1. Implement a method {@link ProductDao#add(Product)} that store new product into the set
 * todo: 2. Implement a method {@link ProductDao#findAll()} that returns a set of all products
 */
public class ProductDao{
//    private final Set<Product> products = new HashSet<>();
    private final HashMap<Integer, Product> products;

    public ProductDao() {
        this.products = new HashMap<>();
    }

    /**
     * Stores a new product
     *
     * @param product a product to store
     * @return {@code true} if a product was stored, {@code false} otherwise
     */
    public boolean add(@NotNull Product product) {
        if (product == null) {
            return false;
        }
        this.products.put(Integer.parseInt(product.getId()), product);
        return true;
//        throw new ExerciseNotCompletedException();
    }

    /**
     * Returns all stored products
     *
     * @return a set of all stored products
     */
//    public Set<Product> findAll() {
//        return new HashSet<>(this.products.values());
//        // TODO: implement this method
////        throw new ExerciseNotCompletedException();
//    }

    public List<Product> findAll() {
        List<Product> listProducts = new ArrayList<>();
        this.products.forEach((key, value) -> listProducts.add(value));
        return listProducts;
//        return new ArrayList<>(this.products.values());
    }

}