package com.clqpt.java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sun.applet.Main;

@Controller
public class HellowController {


    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){


        return "helloworld!!";
    }
}
