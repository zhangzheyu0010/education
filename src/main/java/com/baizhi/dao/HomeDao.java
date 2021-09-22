package com.baizhi.dao;

import com.baizhi.entity.Home;

import java.util.List;

public interface HomeDao {
    List<Home> findAllHome(Integer start,Integer rows);
    Long findHomeTotal();
    void updateHome(Home home);
    Home queryOne(Integer id);
}
