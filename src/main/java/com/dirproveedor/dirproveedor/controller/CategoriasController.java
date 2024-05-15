package com.dirproveedor.dirproveedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dirproveedor.dirproveedor.entity.Categorias;
import com.dirproveedor.dirproveedor.services.CategoriasService;

@Controller
@RequestMapping("/api/v1/categorias")
public class CategoriasController {
	@Autowired
	private CategoriasService categoriasService;

	@GetMapping
	public ResponseEntity<?> hola() {
		System.out.println("hola");
		return ResponseEntity.status(200).body("hola");
	}

	@PostMapping
	public ResponseEntity<Categorias> create(@RequestBody Categorias categorias) {
		System.out.println(categorias.getNombre());
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriasService.save(categorias));
	}
}
