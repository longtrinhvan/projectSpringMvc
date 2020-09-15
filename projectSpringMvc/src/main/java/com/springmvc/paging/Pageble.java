package com.springmvc.paging;

import com.sprngmvc.sort.Sorter;

public interface Pageble {
	Integer getPage();

	Integer getOffset();

	Integer getLimit();

	Sorter getSorter();
}
