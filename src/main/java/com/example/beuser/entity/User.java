package com.example.beuser.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
    @Id //not null and private
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name") // định nghĩa naMe thành name có thể bỏ
                            // nếu k có naMe -> na_me
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;
}
