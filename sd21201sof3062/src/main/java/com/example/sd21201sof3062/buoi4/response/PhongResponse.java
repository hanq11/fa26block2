package com.example.sd21201sof3062.buoi4.response;

import com.example.sd21201sof3062.buoi4.entity.LoaiPhong;
import com.example.sd21201sof3062.buoi4.entity.Phong;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PhongResponse {
    private Integer id;

    private String tenPhong;

    private Integer giaMoiDem;

    private Boolean conTrong;

    private String ngayCapNhat;

    private LoaiPhong loaiPhong;

    public PhongResponse(Phong phong) {
        this.id = phong.getId();
        this.tenPhong = phong.getTenPhong();
        this.giaMoiDem = phong.getGiaMoiDem();
        this.conTrong = phong.getConTrong();
        this.ngayCapNhat = phong.getNgayCapNhat();
        this.loaiPhong = phong.getLoaiPhong();
    }
}
