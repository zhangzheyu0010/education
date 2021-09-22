package com.baizhi.service;

import com.baizhi.dao.CategoryDao;
import com.baizhi.entity.Category;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{
    @Resource
    private CategoryDao categoryDao;
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    @Override
    public List<Category> queryAll() {
       return categoryDao.findAllCategory();
    }

    @Override
    public void deleteService(Integer id) {
        categoryDao.deleteCategory(id);
    }

    @Override
    public void updateService(Category category) {
        categoryDao.updateCategory(category);
    }

    @Override
    public void insertService(Category category) {
        categoryDao.insertCategory(category);
    }
}
