package com.baizhi;

import com.baizhi.entity.Category;
import com.baizhi.entity.Home;
import com.baizhi.service.CategoryService;
import com.baizhi.service.HomeService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@SpringBootTest(classes = AdminServiceApplication.class)
@RunWith(SpringRunner.class)
class AdminServiceApplicationTests {
@Resource
private HomeService homeService;
@Resource
private CategoryService categoryService;
    @Test
    void contextLoads() {
        List<Home> list= homeService.queryAllHome(1,0);
        System.out.println(list);
    }
    @Test
    public  void queryTotal(){
        homeService.queryHomeTotal();
    }
    @Test
    public void queryone(){
        System.out.println( homeService.queryOneService(1));

    }
    @Test
    public void update(){
        Home home=new Home(1,"李四",21,new Date(),"11111",null,2,"12345678910");
        homeService.updateService(home);
    }
    @Test
    public void query(){
        List<Category> list=categoryService.queryAll();
        for (Category category:list) {
            System.out.println("category = " + category);
        }
    }
    @Test
    public void insert(){
        Category category=new Category(5,"Springboot");
        categoryService.insertService(category);
    }
    @Test
    public void update1(){
        Category category=new Category(5,"SpringMvc");
        categoryService.updateService(category);
    }
    @Test
    public void delete(){
        categoryService.deleteService(5);
    }
}
