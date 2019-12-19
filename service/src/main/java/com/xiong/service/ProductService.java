package com.xiong.service;

import com.xiong.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll() throws Exception;

    void save(Product product) throws Exception;
}
