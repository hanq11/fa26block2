package com.example.sd21303jav203.buoi4.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SinhVien {
    private Integer id;
    private String ten;
    private Boolean gioiTinh;
    private Integer diem;
}
