package com.springmvc.service;

import com.springmvc.model.UserModel;

public interface IUserService {

	UserModel findByUserNameAndPasswordAndStatus(String userName, String password,Integer status);
}
