package com.example.sd21201sof3062.buoi2.service;

import com.example.sd21201sof3062.buoi2.entity.SinhVien;

import java.util.List;

public interface SinhVienService {
    public List<SinhVien> hienThi();
    public SinhVien getById(Integer id);
    public void themSinhVien(SinhVien sinhVien);
    public void suaSinhVien(SinhVien sinhVien);
    public void xoaSinhVien(Integer id);
}
