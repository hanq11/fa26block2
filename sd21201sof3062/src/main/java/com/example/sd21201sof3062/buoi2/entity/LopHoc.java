package com.example.sd21201sof3062.buoi2.entity;
//CREATE TABLE lop_hoc (
//        id int PRIMARY KEY IDENTITY(1,1),
//        ten varchar(50),
//        so_tin_chi int
//        )
//        GO
//
//        INSERT INTO lop_hoc
//        VALUES
//        ('SOF101', 3),
//        ('SOF102', 2),
//        ('SOF103', 4),
//        ('SOF104', 3);

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
@Table(name = "lop_hoc")
public class LopHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten")
    private String ten;

    @Column(name = "so_tin_chi")
    private Integer soTinChi;
}
