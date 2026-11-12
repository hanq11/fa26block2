package com.example.sd21303jav203.buoi4.controller;

import com.example.sd21303jav203.buoi4.entity.SinhVien;
import com.example.sd21303jav203.buoi4.service.SinhVienService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/buoi4")
public class SinhVienController {
    SinhVienService sinhVienService = new SinhVienService();

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("listSinhVien", sinhVienService.hienThi());
        return "/buoi4/hien-thi"; // view path
    }

    @PostMapping("/them")
    public String themSinhVien(SinhVien sinhVien) {
        sinhVienService.themSinhVien(sinhVien);
        return "redirect:/buoi4/hien-thi"; // url
    }
}
