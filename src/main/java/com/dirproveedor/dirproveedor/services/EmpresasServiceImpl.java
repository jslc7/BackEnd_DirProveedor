package com.dirproveedor.dirproveedor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dirproveedor.dirproveedor.entity.Empresas;
import com.dirproveedor.dirproveedor.repositories.EmpresasRepository;

@Service
public class EmpresasServiceImpl implements EmpresasService {

	@Autowired
	private EmpresasRepository empresasRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Empresas> findAll() {
		return (List<Empresas>) empresasRepository.findAll();
	}

	@Override
	public Empresas save(Empresas empresas) {
		return empresasRepository.save(empresas);
	}

	@Override
	public void delete(Empresas empresas) {
		empresasRepository.delete(empresas);
	}
}
