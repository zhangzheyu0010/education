package com.baizhi.service;

import com.baizhi.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> queryAll();
    void deleteService(Integer id);
    void updateService(Category category);
    void insertService(Category category);
}
