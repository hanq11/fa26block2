package com.example.sd21201sof3062.buoi2.repository;

import com.example.sd21201sof3062.buoi2.entity.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SinhVienRepository extends JpaRepository<SinhVien, Integer> {
    public List<SinhVien> findSinhViensByTenContains(String ten);
}
