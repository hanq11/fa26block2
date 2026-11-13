package com.example.sd21201sof3062.buoi4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class DashboardController {

    @GetMapping("/admin")
    public String getAdmin() {
        return "Xin chao admin";
    }

    @GetMapping("/user")
    public String getUser() {
        return "Xin chao user";
    }
}
