package com.think.wms.dao;

import java.util.List;
import java.util.Map;

import com.think.wms.entity.InstoreSub;

public interface InstoreSubDDao {

	int insertInstoreSub(InstoreSub instoreSub);

	int deleteInstoreSub(int issId);

	int updateInstoreSub(InstoreSub instoreSub);

	InstoreSub queryById(int issId);

	List<InstoreSub> queryByFileds(Map<String, Object> map);

	List<InstoreSub> queryAll();
}
