package com.dirproveedor.dirproveedor.services;

import java.util.List;

import com.dirproveedor.dirproveedor.entity.Users;

public interface UsersService {
	List<Users> findAll();

	Users save(Users users);

	void delete(Users users);
}
