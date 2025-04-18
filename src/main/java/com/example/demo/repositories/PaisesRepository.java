package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Paises;

@Repository
public interface PaisesRepository extends CrudRepository<Paises, Integer> {
}