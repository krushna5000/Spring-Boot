package com.krushna.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Homecontroller
{
    @RequestMapping("/")
    @ResponseBody
    public String gteet(){
        return "Hello krushna";
    }
}

