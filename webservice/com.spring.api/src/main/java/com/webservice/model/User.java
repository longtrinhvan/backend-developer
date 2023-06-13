package com.webservice.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "users")
@Data
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    public int useId;

    @Column(name = "name")
    public String name;

    @Column(name = "creationdate")
    public LocalDate creationDate;

    @Column(name = "lastlogindate")
    public LocalDate lastLoginDate;

    @Column(name = "active")
    public boolean active;

    @Column(name = "age")
    public int age;

    @Column(name = "email")
    public String email;

    @Column(name = "status")
    public Integer status;
}