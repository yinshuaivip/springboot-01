package com.mr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by YinShuai on 2018/11/2.
 */
@Controller
public class TestController {

    @ResponseBody
    @RequestMapping("test")
    public String test(){
        return "ok";
    }
}
