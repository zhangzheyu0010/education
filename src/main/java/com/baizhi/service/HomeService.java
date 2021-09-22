package com.baizhi.service;

import com.baizhi.entity.Home;

import java.util.List;

public interface HomeService {
    List<Home> queryAllHome(Integer page,Integer rows);
    Long queryHomeTotal();
    void updateService(Home home);
    Home queryOneService(Integer id);

}
