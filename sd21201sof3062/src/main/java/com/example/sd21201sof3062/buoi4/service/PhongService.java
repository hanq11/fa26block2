package com.example.sd21201sof3062.buoi4.service;

import com.example.sd21201sof3062.buoi4.entity.Phong;
import com.example.sd21201sof3062.buoi4.request.PhongRequest;
import com.example.sd21201sof3062.buoi4.response.PhongResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface PhongService {
    public List<PhongResponse> hienThi();
    public Phong getById(Integer id);
    public void themPhong(PhongRequest phongRequest);
    public void suaPhong(PhongRequest phongRequest);
    public void xoaPhong(Integer id);
    public Page phanTrang(int pageNumber);
    public List<Phong> searchByTen(String ten);
}
