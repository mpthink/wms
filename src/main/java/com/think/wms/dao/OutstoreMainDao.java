package com.think.wms.dao;

import java.util.List;
import java.util.Map;

import com.think.wms.entity.OutstoreMain;

public interface OutstoreMainDao {

	int insertOutstoreMain(OutstoreMain OutstoreMain);

	int deleteOutstoreMain(int ismId);

	int updateOutstoreMain(OutstoreMain OutstoreMain);

	OutstoreMain queryById(int osmId);

	OutstoreMain queryWithOutstoreSubsById(int osmId);

	List<OutstoreMain> queryByFileds(Map<String, Object> map);

	List<OutstoreMain> queryAll();

}
