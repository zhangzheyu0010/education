package com.baizhi.controller;

import com.baizhi.entity.Category;
import com.baizhi.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("category")
public class CategoryController {
    @Resource
    private CategoryService categoryService;
    @GetMapping("queryCategory")
    public List<Category> queryCategory(){
        return categoryService.queryAll();
    }
    @DeleteMapping("deleteCategory/{id}")
    public void deleteCategory(@PathVariable("id") Integer id){
        categoryService.deleteService(id);
    }
    @PostMapping("insertCategory")
    public void insertCategory(@RequestBody Category category){
        categoryService.insertService(category);
    }
    @PutMapping("updateCategory")
    public void updateCategory(@RequestBody Category category){
        categoryService.updateService(category);
    }
}
