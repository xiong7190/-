package com.xiong.service;

import com.xiong.domain.Orders;

import java.util.List;

public interface OrdersService {
    List<Orders> findAll(int page, int size) throws Exception;


    Orders finById(String orderId) throws  Exception;
}
