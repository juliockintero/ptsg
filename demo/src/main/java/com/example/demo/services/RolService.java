package com.example.demo.services;
import java.util.ArrayList;

import com.example.demo.models.Empresa;
import com.example.demo.models.Rol;
import com.example.demo.repositories.EmpresaRepository;
import com.example.demo.repositories.RolRepository;
import com.example.demo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RolService {
    @Autowired
    RolRepository rolRepository;

    public ArrayList<Rol> getRoles(){
        return (ArrayList<Rol>) rolRepository.findAll();
    }
}
