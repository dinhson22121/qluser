package com.dinhon.qluser.Models;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "depart")
public class Depart implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;


    @Column(length = 100)
    private String name;
    @Column(length = 15)
    private Integer phone;
    @Column(length = 50)
    private String email;

    public Depart() {
    }

    public Depart(Integer id, String name, Integer phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
