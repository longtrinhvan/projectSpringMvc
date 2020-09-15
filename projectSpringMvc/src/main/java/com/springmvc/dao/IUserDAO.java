package com.springmvc.dao;

import com.springmvc.model.UserModel;

public interface IUserDAO extends GenericDAO<UserModel> {
	UserModel findByUserNameAndPasswordAndStatus(String userName, String password,Integer status);

}
