package com.miempresa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.miempresa.modelo.Categoria;
import com.miempresa.repository.ICategoriaRepository;


@Controller
public class CategoriaController {
    
    @Autowired
    private ICategoriaRepository categoriaRepo;
    
    @GetMapping("/agregarCategoria")
    public String agregarCategoria(Model model) {
        Categoria c = new Categoria();
        c.setNombre("Desarrollo Personal");
        c.setDescripcion("Cursos para mejorar habilidades personales.");
        c.setEstado(true);
        c.setCodigo("DP001");
        
        categoriaRepo.save(c);
        
        model.addAttribute("categoria", c);
        return "categoria_agregada";
    }
}
