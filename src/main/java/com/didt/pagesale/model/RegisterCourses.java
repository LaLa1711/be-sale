package com.didt.pagesale.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "register_cources")
public class RegisterCourses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "clan")
    private String clan;

    @Column(name = "courses")
    private String courses;

    @Column(name = "createdDate")
    private Date createdDate;
    @Column(name = "modifiedDate")
    private Date modifiedDate;
    @Column(name = "createdBy")
    private String createdBy;
    @Column(name = "modifiedBy")
    private String modifiedBy;
}
