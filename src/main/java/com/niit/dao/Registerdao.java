package com.niit.dao;

import org.springframework.stereotype.Service;

import com.niit.model.Register;

@Service
public interface Registerdao {
	void edituser();
	void deleteuser();
	void getuser();
	void addUser(Register reg);
	


}
