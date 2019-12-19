package com.xiong.service.impl;

import com.xiong.dao.ProductDao;
import com.xiong.domain.Product;
import com.xiong.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public List<Product> findAll() throws Exception {
        return productDao.finAll();
    }

    @Override
    public void save(Product product) throws Exception {
        productDao.save(product);
    }
}
