package com.dirproveedor.dirproveedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dirproveedor.dirproveedor.entity.Users;
import com.dirproveedor.dirproveedor.services.UsersService;

@Controller
@RequestMapping("/api/v1/users")
@CrossOrigin(originPatterns = "*")
public class UsersController {
	@Autowired
	private UsersService usersService;

	@GetMapping
	private ResponseEntity<?> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(usersService.findAll());
	}

	@PostMapping
	private ResponseEntity<Users> save(@RequestBody Users users) {
		return ResponseEntity.status(HttpStatus.CREATED).body(usersService.save(users));
	}
}
