package com.miempresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miempresa.modelo.Categoria;

public interface ICategoriaRepository extends JpaRepository <Categoria, Integer>{

}
