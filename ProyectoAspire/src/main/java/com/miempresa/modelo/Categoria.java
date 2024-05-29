package com.miempresa.modelo;


import java.util.Set;

import jakarta.persistence.*;


@Entity
public class Categoria {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", nullable = false, length = 255)
    private String nombre;

    @Column(name = "descripcion", length = 200)
    private String descripcion;

    @Column(name = "estado", nullable = false)
    private boolean estado;

    @Column(name = "codigo", nullable = false, length = 50, unique = true)
    private String codigo;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<subCategoria> subCategorias;

    //Getters and Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Set<subCategoria> getSubCategorias() {
		return subCategorias;
	}

	public void setSubCategorias(Set<subCategoria> subCategorias) {
		this.subCategorias = subCategorias;
	}

 
	


    
}

