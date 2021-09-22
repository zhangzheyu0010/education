package com.baizhi.dao;

import com.baizhi.entity.Product;

import java.util.List;

public interface ProductDao {
    public List<Product> findAllProduct(Integer start,Integer rows);
    public Long findTotalRow();
    public void deleteProduct(Integer id);
    public void insertProduct(Product product);
    public void updateProduct(Product product);
    public Product queryOne(Integer id);
}
