package com.platzi.market.domain.repository;

import com.platzi.market.domain.Product;
<<<<<<< HEAD
import com.platzi.market.persistence.entity.Producto;
=======
>>>>>>> f6d05479592da77f62f29fd3c26a713e82f15bb5

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);
}
<<<<<<< HEAD
=======

>>>>>>> f6d05479592da77f62f29fd3c26a713e82f15bb5
