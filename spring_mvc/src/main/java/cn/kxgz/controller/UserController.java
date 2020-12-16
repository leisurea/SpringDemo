package cn.kxgz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/quick")//请求映射
    public String save() {
        System.out.println("UserController save running...");
        return "/success.jsp";
    }

    @RequestMapping("/quick2")//请求映射
    public ModelAndView save2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username", "空虚公子");
        modelAndView.setViewName("/success.jsp");
        return modelAndView;
    }


}
