package com.example.sd21201sof3062.buoi4.request;

import com.example.sd21201sof3062.buoi4.entity.LoaiPhong;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PhongRequest {
    private Integer id;

    @NotBlank(message = "Ten phong khong duoc de trong")
    private String tenPhong;

    @NotNull(message = "gia khong duoc de trong")
    @Min(value = 10, message = "gia phai lon hon 10")
    private Integer giaMoiDem;

    private Boolean conTrong;

    private String ngayCapNhat;

    private LoaiPhong loaiPhong;
}
