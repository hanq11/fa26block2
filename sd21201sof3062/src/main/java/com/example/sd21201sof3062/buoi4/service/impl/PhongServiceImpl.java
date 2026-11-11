package com.example.sd21201sof3062.buoi4.service.impl;

import com.example.sd21201sof3062.buoi4.entity.Phong;
import com.example.sd21201sof3062.buoi4.repository.PhongRepository;
import com.example.sd21201sof3062.buoi4.service.PhongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhongServiceImpl implements PhongService {
    @Autowired
    PhongRepository phongRepository;

    @Override
    public List<Phong> hienThi() {
        return phongRepository.findAll();
    }

    @Override
    public Phong getById(Integer id) {
        return phongRepository.findById(id).get();
    }

    @Override
    public void themPhong(Phong phong) {
        phongRepository.save(phong);
    }

    @Override
    public void suaPhong(Phong phong) {
        phongRepository.save(phong);
    }

    @Override
    public void xoaPhong(Integer id) {
        phongRepository.deleteById(id);
    }

    @Override
    public Page phanTrang(int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 2);
        return phongRepository.findAll(pageable);
    }

    @Override
    public List<Phong> searchByTen(String ten) {
        return phongRepository.findPhongsByTenPhongContains(ten);
    }
}
