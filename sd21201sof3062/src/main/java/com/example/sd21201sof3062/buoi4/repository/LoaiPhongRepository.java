package com.example.sd21201sof3062.buoi4.repository;

import com.example.sd21201sof3062.buoi4.entity.LoaiPhong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiPhongRepository extends JpaRepository<LoaiPhong, Integer> {
}
