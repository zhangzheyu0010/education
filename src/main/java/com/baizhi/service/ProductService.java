package com.baizhi.service;

import com.baizhi.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> queryAllProduct(Integer page, Integer rows);
    public Long queryTotalRow();
    public void deleteService(Integer id);
    public void insertService(Product product);
    public void updateService(Product product);
    public Product queryOneService(Integer id);
}
