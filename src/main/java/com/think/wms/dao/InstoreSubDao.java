package com.think.wms.dao;

import java.util.List;
import java.util.Map;

import com.think.wms.entity.InstoreSub;

public interface InstoreSubDao {

	int insertInstoreSub(InstoreSub instoreSub);

	int insertInstoreSubList(List<InstoreSub> instoreSubs);

	int deleteInstoreSubByIssId(int issId);

	int deleteInstoreSubByIsmId(int ismId);

	int deleteInstoreSubByIssParentId(int issParentId);

	int updateInstoreSub(InstoreSub instoreSub);

	InstoreSub queryById(int issId);

	List<InstoreSub> queryByFileds(Map<String, Object> map);

	List<InstoreSub> queryAll();
}
