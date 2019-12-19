package com.xiong.controller;

import com.xiong.domain.User;
import com.xiong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login.do")
    public ModelAndView userLogin(User user) throws Exception {
        ModelAndView mv = new ModelAndView();
        System.out.println(user);
        System.out.println(user.getU_name());
        User user1 = userService.Login(user.getU_name(), user.getU_password());
        if (user1 != null){
            mv.setViewName("product-list");
        }else {
            mv.setViewName("/index.html");
            mv.addObject("mgs","账号密码错误");
        }
        return mv;
    }
}
