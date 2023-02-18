package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Rol;

@Repository
public interface RolRepository extends CrudRepository<Rol, Long> {

}
