package com.baizhi.service;

import com.baizhi.dao.HomeDao;
import com.baizhi.entity.Home;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class HomeServiceImpl implements HomeService{
    @Resource
    private HomeDao homeDao;
    @Override
    public List<Home> queryAllHome(Integer page, Integer rows) {
        int start=(page-1)*rows;
        return homeDao.findAllHome(start,rows);
    }

    @Override
    public Long queryHomeTotal() {
        return homeDao.findHomeTotal();
    }
    @Transactional
    @Override
    public void updateService(Home home) {
        homeDao.updateHome(home);
    }

    @Override
    public Home queryOneService(Integer id) {
       return homeDao.queryOne(id);
    }
}
