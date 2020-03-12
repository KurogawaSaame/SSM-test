package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 账户web，控制器
 */
@Controller
//@RequestMapping(path = "/account")
public class AccountController {
    @RequestMapping(path = "/findAll")
    public String findAll(){
        System.out.println("表现层,查询所有账户信息");
        return "list";
    }
}
