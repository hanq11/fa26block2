package com.example.sd21303jav203.buoi3.controller;

import com.example.sd21303jav203.buoi3.entity.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    // demo forward
    @GetMapping("/login-forward")
    public String demoForward() {
        return "forward:/hello-world";
    }

    // demo redirect
    @GetMapping("/login-redirect")
    public String demoRedirect() {
        return "redirect:/hello-world";
    }

    @ResponseBody
    @GetMapping("/test-api")
    public List<Login> testAPI() {
        List<Login> danhSach = new ArrayList<>();
        danhSach.add(new Login("123", "234", true));
        danhSach.add(new Login("1234", "234", true));
        danhSach.add(new Login("456", "234", false));
        return danhSach;
    }
}
