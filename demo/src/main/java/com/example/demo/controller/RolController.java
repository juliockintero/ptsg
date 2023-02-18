package com.example.demo.controller;
import java.util.ArrayList;

import com.example.demo.models.Empresa;
import com.example.demo.models.Rol;
import com.example.demo.services.EmpresaService;
import com.example.demo.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/roles")
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
public class RolController {

    @Autowired
    RolService rolService;

    @GetMapping()
    public ArrayList<Rol> getRoles(){
        return rolService.getRoles();
    }
}
