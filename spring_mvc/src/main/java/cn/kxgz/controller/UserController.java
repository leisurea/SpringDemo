package cn.kxgz.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.kxgz.model.User;

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

    @RequestMapping("/quick3")//springmvc自动注入
    public ModelAndView save3(ModelAndView modelAndView) {
        modelAndView.addObject("username", "肾虚公子");
        modelAndView.setViewName("/success.jsp");
        return modelAndView;
    }

    @RequestMapping("/quick4")//springmvc自动注入
    public String save4(Model model) {
        model.addAttribute("username", "肾虚公子");
        return "/success.jsp";
    }


    @RequestMapping("/quick5")//springmvc自动注入-没必要，不常用
    public String save5(HttpServletRequest request) {
        request.setAttribute("username", "肾虚公子");
        return "/success.jsp";
    }


    @RequestMapping("/quick6")//springmvc自动注入-没必要，不常用
    public void save6(HttpServletResponse response) throws IOException {
        response.getWriter().println("空虚公子");
    }


    @RequestMapping(value = "/quick7")
    @ResponseBody()//不要进行页面跳转，直接返回字符串
    public String save7()  {
        return "空虚公子ggg";
    }


    @RequestMapping(value = "/quick8")
    @ResponseBody()//不要进行页面跳转，直接返回字符串
    public String save8() throws JsonProcessingException {
        User user = new User();
        user.setAge(18);
        user.setName("空虚公子");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        return json;
    }


}
