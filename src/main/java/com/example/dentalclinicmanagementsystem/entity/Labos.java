package com.example.dentalclinicmanagementsystem.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "labos")
public class Labos {
    @Id
    @Column(name = "labo_id")
    private Long laboId;

    @Column(name = "labo_name")
    private String laboName;

    @Column(name = "phone")
    private String phone;

}
