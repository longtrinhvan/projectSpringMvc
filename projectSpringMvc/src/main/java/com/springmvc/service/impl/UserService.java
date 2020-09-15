package com.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.springmvc.dao.IUserDAO;
import com.springmvc.model.UserModel;
import com.springmvc.service.IUserService;

public class UserService implements IUserService{

	
	@Autowired
	private IUserDAO userDAO;
	@Override
	public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
		return userDAO.findByUserNameAndPasswordAndStatus(userName, password, status);
	}

}
