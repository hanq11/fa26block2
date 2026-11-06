package com.example.sd21201sof3062.buoi2.service;

import com.example.sd21201sof3062.buoi2.entity.SinhVien;
import org.springframework.data.domain.Page;

import java.util.List;

public interface SinhVienService {
    public List<SinhVien> hienThi();
    public SinhVien getById(Integer id);
    public void themSinhVien(SinhVien sinhVien);
    public void suaSinhVien(SinhVien sinhVien);
    public void xoaSinhVien(Integer id);
    public Page phanTrang(int pageNumber);
    public List<SinhVien> searchByTen(String ten);
}
