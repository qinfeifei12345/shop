package com.actions;

import com.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserAction {
    @Resource
    private IUserService service;
    @RequestMapping("/getUser.action")
    public List getUsers(){
        System.out.println("*****************");
        return service.getAllUser();

    }

    @RequestMapping("/getUser1.action")
    public List getUsers1(){

        return service.getAllUser();

    }

    @RequestMapping("/zhuangzhang.action")
    public boolean  zhuanZhang(String userAccount,String user,int money){
        System.out.println(userAccount);
        return  service.zhuanzhang(userAccount,user,money);
    }

}
