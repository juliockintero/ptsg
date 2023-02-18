package com.example.demo.models;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Rol {

    @Id
    @Column(unique = true, nullable = false , length = 2)
    private Integer id;
    /*
    */





    @Column(name = "rol")
    private String rol;

    @Column(name = "estado")
    private Long estado;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Long getEstado() {
        return estado;
    }

    public void setEstado(Long estado) {
        this.estado = estado;
    }
}
