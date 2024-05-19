package com.dirproveedor.dirproveedor.repositories;

import org.springframework.data.repository.CrudRepository;

import com.dirproveedor.dirproveedor.entity.Empresas;

public interface EmpresasRepository extends CrudRepository<Empresas,Long> {
	
}
