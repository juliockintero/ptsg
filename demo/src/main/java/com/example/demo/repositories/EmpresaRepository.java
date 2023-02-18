package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Empresa;

@Repository
public interface EmpresaRepository extends CrudRepository<Empresa, Long> {

}
