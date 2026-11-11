package com.example.sd21201sof3062.buoi4.repository;

import com.example.sd21201sof3062.buoi4.entity.Phong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhongRepository extends JpaRepository<Phong, Integer> {
    public List<Phong> findPhongsByTenPhongContains(String tenPhong);
}
