package com.dirproveedor.dirproveedor.services;

import java.util.List;

import com.dirproveedor.dirproveedor.entity.Categorias;

public interface CategoriasService {

	List<Categorias> findAll();

	Categorias save(Categorias categorias);

	void delete(Categorias categorias);
	
}
