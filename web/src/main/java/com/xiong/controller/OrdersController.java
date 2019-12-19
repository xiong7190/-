package com.xiong.controller;

import com.github.pagehelper.PageInfo;
import com.xiong.domain.Orders;
import com.xiong.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "page",required = true, defaultValue = "1") int page,
                                @RequestParam(name = "size",required = true,defaultValue = "4") int size) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Orders> ordersList = ordersService.findAll(page,size);
        PageInfo pageInfo = new PageInfo(ordersList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("orders-list");
        return mv;
    }
    @RequestMapping("findById.do")
    public ModelAndView findById(@RequestParam(name = "id",required = true) String orderId) throws Exception{
        ModelAndView mv = new ModelAndView();
        Orders order = ordersService.finById(orderId);
        mv.addObject("orders",order);
        mv.setViewName("orders-show");
        return mv;
    }

}
