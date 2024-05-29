package com.miempresa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.miempresa.modelo.Categoria;
import com.miempresa.modelo.subCategoria;
import com.miempresa.repository.ICategoriaRepository;
import com.miempresa.repository.ISubCategoriaRepository;

@Controller
public class SubCategoriaController {
	
	@Autowired
    private ICategoriaRepository categoriaRepo;
    
    @Autowired
    private ISubCategoriaRepository subCategoriaRepo;

	
	@GetMapping("/agregarSubCategoria")
    public String agregarSubCategoria(Model model) {
        // Se obtiene una categoría existente
        Categoria categoria = categoriaRepo.findById(1).orElse(null); 
        
        subCategoria subCategoria = new subCategoria();
        subCategoria.setCategoria(categoria);
        subCategoria.setNombre("Comunicacion Efectiva");
        subCategoria.setDescripcion("Curso para mejorar habilidades de comunicación interpersonal.");
        subCategoria.setEstado(true);
        subCategoria.setCodigo("DP001-SC001");
        
        subCategoriaRepo.save(subCategoria);
        
        model.addAttribute("subCategoria", subCategoria);
        return "subcategoria_agregada";
	}
    
}
