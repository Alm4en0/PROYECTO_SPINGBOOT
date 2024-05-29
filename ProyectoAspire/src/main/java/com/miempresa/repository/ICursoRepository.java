package com.miempresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miempresa.modelo.Curso;

public interface ICursoRepository extends JpaRepository <Curso, Integer> {

}
