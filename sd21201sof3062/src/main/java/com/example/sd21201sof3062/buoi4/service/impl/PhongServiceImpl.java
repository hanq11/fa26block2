package com.example.sd21201sof3062.buoi4.service.impl;

import com.example.sd21201sof3062.buoi4.entity.Phong;
import com.example.sd21201sof3062.buoi4.exception.ApiException;
import com.example.sd21201sof3062.buoi4.repository.PhongRepository;
import com.example.sd21201sof3062.buoi4.request.PhongRequest;
import com.example.sd21201sof3062.buoi4.response.PhongResponse;
import com.example.sd21201sof3062.buoi4.service.PhongService;
import org.springframework.beans.BeanUtils;
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
    public List<PhongResponse> hienThi() {
        return phongRepository
                .findAll()
                .stream()
                .map(PhongResponse::new)
                .toList();
    }
    @Override
    public Phong getById(Integer id) {
        return phongRepository.findById(id).get();
    }
    @Override
    public void themPhong(PhongRequest phongRequest) {
//        int a = 2/0;
        Phong phong = new Phong();
        BeanUtils.copyProperties(phongRequest, phong);
        phongRepository.save(phong);
    }
    @Override
    public void suaPhong(PhongRequest phongRequest) {
        Phong phong = new Phong();
        BeanUtils.copyProperties(phongRequest, phong);
        phongRepository.save(phong);
    }

    @Override
    public void xoaPhong(Integer id) {
        phongRepository.findById(id).orElseThrow(
                () -> new ApiException("id phong khong ton tai", "D001")
        );
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
