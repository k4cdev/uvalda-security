package com.springboot3.demo.core.inventory;

import java.util.List;

public interface ProductService {

    Product postOne(Product product);

    Product patchOne(Product product, Long id);

    List<Product> getAll();

    Product getOne(Long id);
}
