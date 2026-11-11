package com.example.sd21201sof3062.buoi4.controller;

import com.example.sd21201sof3062.buoi4.entity.Phong;
import com.example.sd21201sof3062.buoi4.service.PhongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buoi4")
public class PhongController {
    @Autowired
    PhongService phongService;
    @GetMapping("/hien-thi")
    public List<Phong> hienThi() {
        return phongService.hienThi();
    }
    @GetMapping("/{id}")
    public Phong getDetailById(@PathVariable("id") Integer id) {
        return phongService.getById(id);
    }
    @PostMapping("/them")
    public void themPhong(@RequestBody Phong phong) {
        phongService.themPhong(phong);
    }
    @PatchMapping("/sua")
    public void suaPhong(@RequestBody Phong phong) {
        phongService.suaPhong(phong);
    }
    @DeleteMapping("/xoa")
    public void xoaPhong(@RequestParam("id") Integer id) {
        phongService.xoaPhong(id);
    }
    @GetMapping("/phan-trang")
    public Page phanTrang(
            @RequestParam(
                    name = "pageNumber",
                    defaultValue = "0",
                    required = false) Integer pageNumber
            ) {
        return phongService.phanTrang(pageNumber);
    }
    @GetMapping("/searchTen")
    public List<Phong> searchByTen(@RequestParam("ten") String ten) {
        return phongService.searchByTen(ten);
    }
}
