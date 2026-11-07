package com.example.sd21303jav203.buoi3.controller;

import com.example.sd21303jav203.buoi3.entity.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/buoi3")
public class LoginController {

    @GetMapping("/login")
    public String hienThiForm() {
        return "/buoi3/form";
    }

//    @PostMapping("/dang-nhap")
//    public String dangNhap(
//            @RequestParam("username") String username,
//            @RequestParam("password") String password,
//            @RequestParam(name = "remember", defaultValue = "false") Boolean remember,
//            Model model
//    ) {
//        model.addAttribute("usr", username);
//        model.addAttribute("pwd", password);
//        model.addAttribute("rm", remember);
//        return "/buoi3/thong-tin";
//    }

    @PostMapping("/dang-nhap")
    public String dangNhap(Login login, Model model) {
        model.addAttribute("usr", login.getUsername());
        model.addAttribute("pwd", login.getPassword());
        model.addAttribute("rm", login.getRemember());
        return "/buoi3/thong-tin";
    }

}
