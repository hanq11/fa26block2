package com.example.sd21303jav203.buoi4.service;

import com.example.sd21303jav203.buoi4.entity.SinhVien;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SinhVienService {
    List<SinhVien> danhSach = new ArrayList<>();

    public SinhVienService() {
        danhSach.add(new SinhVien(1, "Nguyen Van A", true, 9));
        danhSach.add(new SinhVien(2, "Nguyen Thi A", false, 8));
        danhSach.add(new SinhVien(3, "Tran Van B", true, 7));
    }

    public List<SinhVien> hienThi() {
        return danhSach;
    }
    public SinhVien getDetailById(Integer id) {
        for(SinhVien sinhVien: danhSach) {
            if(sinhVien.getId() == id) {
                return sinhVien;
            }
        }
        return null;
    }

    public void themSinhVien(SinhVien sinhVien) {
        danhSach.add(sinhVien);
    }

    public void suaSinhVien(SinhVien sinhVien) {
        int indexSua = -1;
        for (int i = 0; i < danhSach.size(); i++) {
            if(sinhVien.getId() == danhSach.get(i).getId()) {
                indexSua = i;
            }
        }
        danhSach.set(indexSua, sinhVien);
    }

    public void xoaSinhVien(Integer id) {
        danhSach.removeIf(sv -> sv.getId() == id);
    }
}
