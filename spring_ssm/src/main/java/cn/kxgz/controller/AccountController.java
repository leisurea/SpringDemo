package cn.kxgz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import cn.kxgz.domain.Account;
import cn.kxgz.service.AccountService;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService service;

    @RequestMapping(value = "/save", produces = "text/html;charset=UTF-8")
    @ResponseBody/*不展示界面，直接返回字符串*/
    public String save(Account account) {
        service.save(account);
        return "添加成功";
    }

    @RequestMapping("/findAll")
    public ModelAndView findAll() {
        List<Account> all = service.findAll();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("accountList", all);
        modelAndView.setViewName("accountList");

        return modelAndView;
    }


}
