package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "empresa")
public class Empresa {



    @Id
    @Column(name = "nit", unique = true, nullable = false , length = 12)
    private String nit;
    /*
     * 
     * 
     */


    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "estado", length = 1)
    private Integer estado;

    @Column(name = "libre", nullable = true ,length = 100)
    private String libre;

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getLibre() {
        return libre;
    }

    public void setLibre(String libre) {
        this.libre = libre;
    }
}
