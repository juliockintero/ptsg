package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Usuario;
import com.example.demo.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<Usuario> getUsers() {
        return (ArrayList<Usuario>) usuarioRepository.findAll();
    }

    public Usuario creatUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public boolean deleteUsuario(String cedula) {
        try {
            usuarioRepository.deleteById(cedula);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

    public Optional<Usuario> getUserById(String cedula){
        return usuarioRepository.findById(cedula);
    }

}
