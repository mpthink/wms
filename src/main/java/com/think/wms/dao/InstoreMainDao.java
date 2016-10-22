package com.think.wms.dao;

import java.util.List;
import java.util.Map;

import com.think.wms.entity.InstoreMain;

public interface InstoreMainDao {

	int insertInstoreMain(InstoreMain instoreMain);

	int deleteInstoreMain(int ismId);

	int updateInstoreMain(InstoreMain instoreMain);

	InstoreMain queryById(int ismId);

	InstoreMain queryWithInstoreSubsById(int ismId);

	List<InstoreMain> queryByFileds(Map<String, Object> map);

	List<InstoreMain> queryAll();

}
