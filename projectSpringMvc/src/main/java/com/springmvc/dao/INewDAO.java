package com.springmvc.dao;

import java.util.List;

import com.springmvc.model.NewModel;
import com.springmvc.paging.Pageble;

public interface INewDAO extends GenericDAO<NewModel> {

	List<NewModel> findBycategoryId(Long categoryId);

	Long save(NewModel newModel);

	NewModel findOne(Long id);

	void update(NewModel updateNew);

	void delete(long id);

	List<NewModel> findAll(Pageble pageble);

	int getTotalItem();
}
