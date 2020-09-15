package com.springmvc.service;

import java.util.List;

import com.springmvc.model.CategoryModel;

public interface ICategoryService {

	List<CategoryModel> findAll();

}
