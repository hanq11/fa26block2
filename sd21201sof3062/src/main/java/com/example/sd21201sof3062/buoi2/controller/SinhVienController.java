package com.example.sd21201sof3062.buoi2.controller;

import com.example.sd21201sof3062.buoi2.entity.SinhVien;
import com.example.sd21201sof3062.buoi2.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buoi1")
public class SinhVienController {
    @Autowired
    SinhVienService sinhVienService;
    @GetMapping("/hien-thi")
    public List<SinhVien> hienThi() {
        return sinhVienService.hienThi();
    }
    @GetMapping("/{id}")
    public SinhVien getDetailById(@PathVariable("id") Integer id) {
        return sinhVienService.getById(id);
    }
    @PostMapping("/them")
    public void themSinhVien(@RequestBody SinhVien sinhVien) {
        sinhVienService.themSinhVien(sinhVien);
    }
    @PatchMapping("/sua")
    public void suaSinhVien(@RequestBody SinhVien sinhVien) {
        sinhVienService.themSinhVien(sinhVien);
    }
    @DeleteMapping("/xoa")
    public void xoaSinhVien(@RequestParam("id") Integer id) {
        sinhVienService.xoaSinhVien(id);
    }
    @GetMapping("/phan-trang")
    public Page phanTrang(
            @RequestParam(
                    name = "pageNumber",
                    defaultValue = "0",
                    required = false) Integer pageNumber
            ) {
        return sinhVienService.phanTrang(pageNumber);
    }
    @GetMapping("/searchTen")
    public List<SinhVien> searchByTen(@RequestParam("ten") String ten) {
        return sinhVienService.searchByTen(ten);
    }
}
