package com.springboot3.demo.core.inventory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product postOne(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product patchOne(Product in, Long id) {
        Product current = this.getOne(id);
        BeanUtils.copyProperties(in, current, "id");
        return productRepository.save(current);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getOne(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
