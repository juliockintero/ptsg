package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Usuario;
import com.example.demo.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<Usuario> getUsuarios() {
        return usuarioService.getUsers();
    }

    @PostMapping()
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioService.creatUsuario(usuario);
    }
    @GetMapping(path = "/{cedula}")
    public Optional<Usuario> getUserById(@PathVariable("cedula") String cedula) {
        return usuarioService.getUserById(cedula);
    }

    @DeleteMapping(path = "/{cedula}")
    public String deletePorId(@PathVariable("cedula") String cedula) {
        boolean ok = this.usuarioService.deleteUsuario(cedula);
        if (ok) {
            return "Se eliminó el usuario con id " + cedula;
        } else {
            return "No pudo eliminar el usuario con id" + cedula;
        }
    }

}
