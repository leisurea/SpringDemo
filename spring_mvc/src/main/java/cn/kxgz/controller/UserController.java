package cn.kxgz.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.kxgz.model.User;
import cn.kxgz.model.VO;

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
    public String save7() {
        return "空虚公子ggg";
    }


    @RequestMapping(value = "/quick8")
    @ResponseBody()//不要进行页面跳转，直接返回字符串
    public String save8() throws JsonProcessingException {
        User user = new User();
        user.setAge(18);
        user.setUsername("空虚公子");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        return json;
    }

    @RequestMapping(value = "/quick9")
    @ResponseBody()//不要进行页面跳转，直接返回字符串
    public User save9() throws JsonProcessingException {
        User user = new User();
        user.setAge(18);
        user.setUsername("空虚公子");
        return user;
    }

    @RequestMapping(value = "/quick11")
    @ResponseBody()//不要进行页面跳转，直接返回字符串
    public User save11(String username, int age) throws JsonProcessingException {
        User user = new User();
        user.setAge(age);
        user.setUsername(username);
        System.out.println(user);
        return user;
    }

    @RequestMapping(value = "/quick12")
    @ResponseBody()//不要进行页面跳转，直接返回字符串
    public User save12(User user) throws JsonProcessingException {
        //字段需要对的上，并且需要set方法
        return user;
    }

    @RequestMapping(value = "/quick13")
    @ResponseBody()//不要进行页面跳转，直接返回字符串
    public List<String> save13(String[] strs) throws JsonProcessingException {
        return Arrays.asList(strs);
    }

    @RequestMapping(value = "/quick14")
    @ResponseBody()//不要进行页面跳转，直接返回字符串
    public void save14(VO vo) {
        System.out.println(vo);
    }

    @RequestMapping(value = "/quick15", method = RequestMethod.POST)
    @ResponseBody()//不要进行页面跳转，直接返回字符串
    public List<User> save15(@RequestBody List<User> userList) {
        System.out.println(userList);
        return userList;
    }

    @RequestMapping(value = "/quick16")
    @ResponseBody()//不要进行页面跳转，直接返回字符串
    public String save16(@RequestParam(value = "name", required = true/*是否需要包含该参数*/, defaultValue = "空虚公子")/*将name映射成username*/ String username) {
        System.out.println(username);
        return username;
    }

    @GetMapping(value = "/quick17/{username}")//value跟地址的username必须一致
    @ResponseBody()//不要进行页面跳转，直接返回字符串
    public String save17(@PathVariable(value = "username") String username) {
        System.out.println(username);
        return username;
    }

    @RequestMapping(value = "/quick18")
    @ResponseBody()//不要进行页面跳转，直接返回字符串
    public String save17(Date date) {
        System.out.println(date);
        return date.toString();
    }

    @RequestMapping(value = "/quick20")
    @ResponseBody()//不要进行页面跳转，直接返回字符串
    public void save20(@RequestHeader(value = "User-Agent") String UA) {
        System.out.println(UA);
    }

    @RequestMapping(value = "/quick21")
    @ResponseBody()//不要进行页面跳转，直接返回字符串
    public void save21(@CookieValue(value = "JSESSIONID") String jsID) {
        System.out.println(jsID);
    }


}
