package com.think.wms.dao;

import java.util.List;
import java.util.Map;

import com.think.wms.entity.OutstoreSub;

public interface OutstoreSubDao {

	int insertOutstoreSub(OutstoreSub outstoreSub);

	int insertOutstoreSubList(List<OutstoreSub> outstoreSubs);

	int deleteOutstoreSubByOssId(int ossId);

	int deleteOutstoreSubByOsmId(int osmId);

	int updateOutstoreSub(OutstoreSub outstoreSub);

	OutstoreSub queryById(int ossId);

	List<OutstoreSub> queryByFileds(Map<String, Object> map);

	List<OutstoreSub> queryAll();
}
