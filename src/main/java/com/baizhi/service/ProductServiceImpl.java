package com.baizhi.service;

import com.baizhi.dao.ProductDao;
import com.baizhi.entity.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class ProductServiceImpl implements ProductService{
    @Resource
    private ProductDao productDao;
    @Override
    public List<Product> queryAllProduct(Integer page, Integer rows) {
        int start=(page-1)*rows;
        return productDao.findAllProduct(start,rows);
    }

    @Override
    public Long queryTotalRow() {
        return productDao.findTotalRow();
    }
    @Transactional
    @Override
    public void deleteService(Integer id) {
        productDao.deleteProduct(id);
    }
    @Transactional
    @Override
    public void insertService(Product product) {
        productDao.insertProduct(product);
    }
    @Transactional
    @Override
    public void updateService(Product product) {
        productDao.updateProduct(product);
    }
    @Transactional
    @Override
    public Product queryOneService(Integer id) {
        return productDao.queryOne(id);
    }
}
