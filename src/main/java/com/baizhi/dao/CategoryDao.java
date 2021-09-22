package com.baizhi.dao;

import com.baizhi.entity.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> findAllCategory();
    void deleteCategory(Integer id);
    void updateCategory(Category category);
    void insertCategory(Category category);
}
