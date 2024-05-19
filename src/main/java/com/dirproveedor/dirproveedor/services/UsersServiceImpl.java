package com.dirproveedor.dirproveedor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dirproveedor.dirproveedor.entity.Users;
import com.dirproveedor.dirproveedor.repositories.UsersRepository;


@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersRepository usersRepository;

	@Override
	@Transactional(readOnly=false)
	public List<Users> findAll(){
		return (List<Users>) usersRepository.findAll();
	}

	@Override
	@Transactional
	public Users save(Users users){
		return usersRepository.save(users);
	}

	@Override
	@Transactional
	public void delete(Users users){
		usersRepository.delete(users);
	}
}
