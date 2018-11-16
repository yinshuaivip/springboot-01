package com.mr.controller;

import com.mr.pojo.User;
import com.mr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by YinShuai on 2018/11/3.
 */
@Controller
public class UerController {

    @Autowired
    private UserService userService;

    //新融入的jsp模块 测试方法
    @RequestMapping("toListPage")
    public String toListPage(){
        return "list";
    }

    //查询
    @RequestMapping("queryUser")
    public String queryUser(ModelMap map){
       List<User> userList = userService.queryUser();
       map.put("userList",userList);
       return "list";
    }

}
