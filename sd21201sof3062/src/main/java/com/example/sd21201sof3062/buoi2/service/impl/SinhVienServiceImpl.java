package com.example.sd21201sof3062.buoi2.service.impl;

import com.example.sd21201sof3062.buoi2.entity.SinhVien;
import com.example.sd21201sof3062.buoi2.repository.SinhVienRepository;
import com.example.sd21201sof3062.buoi2.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SinhVienServiceImpl implements SinhVienService {
    @Autowired
    SinhVienRepository sinhVienRepository;

    @Override
    public List<SinhVien> hienThi() {
        return sinhVienRepository.findAll();
    }

    @Override
    public SinhVien getById(Integer id) {
        return sinhVienRepository.findById(id).get();
    }

    @Override
    public void themSinhVien(SinhVien sinhVien) {
        sinhVienRepository.save(sinhVien);
    }

    @Override
    public void suaSinhVien(SinhVien sinhVien) {
        sinhVienRepository.save(sinhVien);
    }

    @Override
    public void xoaSinhVien(Integer id) {
        sinhVienRepository.deleteById(id);
    }
}
