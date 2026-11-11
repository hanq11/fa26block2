package com.example.sd21201sof3062.buoi4.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "phong")
public class Phong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_phong")
    private String tenPhong;

    @Column(name = "gia_moi_dem")
    private Integer giaMoiDem;

    @Column(name = "con_trong")
    private Boolean conTrong;

    @Column(name = "ngay_cap_nhat")
    private String ngayCapNhat;

    @ManyToOne
    @JoinColumn(name = "loai_phong_id", referencedColumnName = "id")
    private LoaiPhong loaiPhong;
}
