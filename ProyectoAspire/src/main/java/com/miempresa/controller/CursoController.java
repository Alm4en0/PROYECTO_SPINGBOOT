package com.miempresa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.miempresa.modelo.Curso;
import com.miempresa.repository.ICursoRepository;
import com.miempresa.modelo.subCategoria;
import com.miempresa.repository.ISubCategoriaRepository;

@Controller
public class CursoController {
    
    @Autowired
    private ICursoRepository cursoRepo;

    @Autowired
    private ISubCategoriaRepository subCategoriaRepo;

    @GetMapping("/agregarCurso")
    public String agregarCurso(Model model) {
        // Se obtiene una subcategoría existente 
        subCategoria subCategoria = subCategoriaRepo.findById(1).orElse(null); 
        
        Curso curso = new Curso();
        curso.setSubCategoria(subCategoria);
        curso.setCodigo("CUR001");
        curso.setNombre("Curso Avanzado de Oratoria");
        curso.setDescripcion("Este curso avanzado te proporcionará técnicas y estrategias para mejorar tu habilidad en la oratoria y la expresión verbal.");
        curso.setDuracion(10.5); 
        curso.setEstado(true);
        curso.setUrlImg("/curso_imagenes/oratoria.png"); 
        
        Curso cursoGuardado = cursoRepo.save(curso);
        
        model.addAttribute("curso", cursoGuardado);
        return "curso_agregado";
    }
}
