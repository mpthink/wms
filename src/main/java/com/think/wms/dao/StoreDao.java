package com.think.wms.dao;

import java.util.List;

import com.think.wms.entity.Store;

public interface StoreDao {

	int insertStore(Store store);

	int deleteStore(int storeId);

	int updateStore(Store store);

	Store queryById(int storeId);

	List<Store> queryParentStores();

	List<Store> queryByParentId(int storeSubParrent);

	List<Store> queryAll();
}
