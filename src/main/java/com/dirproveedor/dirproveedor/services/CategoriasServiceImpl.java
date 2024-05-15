package com.dirproveedor.dirproveedor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dirproveedor.dirproveedor.entity.Categorias;
import com.dirproveedor.dirproveedor.repositories.CategoriasRepository;

@Service
public class CategoriasServiceImpl implements CategoriasService{

	@Autowired 
	private CategoriasRepository categoriasRepository;

	@Override
	@Transactional(readOnly=true)
	public List<Categorias> findAll(){
		return (List<Categorias>) categoriasRepository.findAll();
	}

	@Override
	@Transactional
	public Categorias save(Categorias categorias){
		return categoriasRepository.save(categorias);
	}

	@Override
	@Transactional
	public void delete(Categorias categorias){
		categoriasRepository.delete(categorias);
	}
}
