package com.example.demo.services;
import java.util.ArrayList;

import com.example.demo.models.Empresa;
import com.example.demo.repositories.EmpresaRepository;
import com.example.demo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;

    public  ArrayList<Empresa> getCompanies(){
        return (ArrayList<Empresa>) empresaRepository.findAll();
    }
}
