package com.example.sd21303jav203.buoi2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

    @GetMapping("/hello-world")
//    @RequestMapping(value={"/hello-world"}, method = RequestMethod.GET)
    public String helloWorld(Model model) {
        model.addAttribute("lop", "SD21303");
        return "/buoi2/helloWorld";
    }
}
