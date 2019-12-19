package com.xiong.service.impl;

import com.github.pagehelper.PageHelper;
import com.xiong.dao.OrdersDao;
import com.xiong.domain.Orders;
import com.xiong.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersDao ordersDao;
    @Override
    public List<Orders> findAll(int page,int size) throws Exception {
        PageHelper.startPage(page,size);
        return ordersDao.finAll();
    }

    @Override
    public Orders finById(String orderId) throws Exception{
        return ordersDao.finById(orderId);
    }
}
