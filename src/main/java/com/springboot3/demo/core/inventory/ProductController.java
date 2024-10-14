package com.springboot3.demo.core.inventory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Product post(@RequestBody Product in){
        return productService.postOne(in);
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    Product patch(@RequestBody Product in, @PathVariable Long id){
        return productService.patchOne(in, id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<Product> getAll(){
        return productService.getAll();
    }
}
