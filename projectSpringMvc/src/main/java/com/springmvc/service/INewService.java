package com.springmvc.service;

import java.util.List;

import com.springmvc.model.NewModel;
import com.springmvc.paging.Pageble;

public interface INewService {

	List<NewModel> findBycategoryId(Long categoryId);

	NewModel save(NewModel newModel);

	NewModel update(NewModel updateNew);

	void delete(long[] ids);

	List<NewModel> findAll(Pageble pageble);

	int getTotalItem();

	NewModel findOne(long id);
}
