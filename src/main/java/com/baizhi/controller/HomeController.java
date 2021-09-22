package com.baizhi.controller;

import com.baizhi.entity.Home;
import com.baizhi.service.HomeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("homes")
public class HomeController {
    @Resource
    private HomeService homeService;
     /** 分页查询用户
     * @param page  对应的页码  如果没有值 则默认获取第一页
     * @param rows 每个获取的用户数量 如果没有值  默认每页获取三个
     * @return  分页后的每页的用户对象*/

    @GetMapping("queryAll")
    public Map<String,Object> queryAllHome(@RequestParam(value = "page",defaultValue = "1")Integer page, @RequestParam(value ="rows",defaultValue = "3")Integer rows){
        HashMap<String,Object> result=new HashMap<>();
        //返回的分页后的对象
        List<Home> homes=homeService.queryAllHome(page,rows);
        Long total=homeService.queryHomeTotal();
        result.put("total",total);
        result.put("homes",homes);
        return result;
    }
    @PutMapping("update")
    public void String(@RequestBody Home home){
        homeService.updateService(home);
    }
    @GetMapping("queryOne")
    public Home String(Integer id){
        return homeService.queryOneService(id);
    }
}
