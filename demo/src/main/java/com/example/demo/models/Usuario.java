package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @Column( name ="cedula", length = 12, unique = true, nullable = false)
    private String cedula;
    @Column(name = "primernombre",length = 50)
    private String primernombre;
    @Column(name = "segundonombre",length = 50)
    private String segundonombre;
    @Column(name = "primerapellido",length = 50)
    private String primerapellido;
    @Column(name = "segundoapellido", length = 50)
    private String segundoapellido;
    @Column(name = "password",length = 150)
    private String password;
    @Column(name = "email",length = 50)
    private String email;

    @Column(name = "estado" ,length = 1)
    private Integer estado;

    @ManyToOne
    @JoinColumn(name = "nitempresa", referencedColumnName = "nit")
    private Empresa empresa;

    @ManyToOne
    @JoinColumn(name = "rol", referencedColumnName = "id")
    private Rol rol;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPrimernombre() {
        return primernombre;
    }

    public void setPrimernombre(String primernombre) {
        this.primernombre = primernombre;
    }

    public String getSegundonombre() {
        return segundonombre;
    }

    public void setSegundonombre(String segundonombre) {
        this.segundonombre = segundonombre;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    public String getSegundoapellido() {
        return segundoapellido;
    }

    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
