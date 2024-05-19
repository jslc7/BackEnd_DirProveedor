package com.dirproveedor.dirproveedor.services;

import java.util.List;

import com.dirproveedor.dirproveedor.entity.Empresas;

public interface EmpresasService {
	List<Empresas> findAll();

	Empresas save(Empresas empresas);

	void delete(Empresas empresas);
}
