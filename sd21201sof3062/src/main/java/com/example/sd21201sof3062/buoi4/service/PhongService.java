package com.example.sd21201sof3062.buoi4.service;

import com.example.sd21201sof3062.buoi4.entity.Phong;
import org.springframework.data.domain.Page;

import java.util.List;

public interface PhongService {
    public List<Phong> hienThi();
    public Phong getById(Integer id);
    public void themPhong(Phong phong);
    public void suaPhong(Phong phong);
    public void xoaPhong(Integer id);
    public Page phanTrang(int pageNumber);
    public List<Phong> searchByTen(String ten);
}
