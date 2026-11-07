package com.example.sd21303jav203.buoi3.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Login {
    private String username;
    private String password;
    private Boolean remember = false;
}
