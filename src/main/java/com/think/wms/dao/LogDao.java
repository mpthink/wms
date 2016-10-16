package com.think.wms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mysql.jdbc.log.Log;

public interface LogDao {

	int insertLog(@Param("logAction") String logAction, @Param("userId") long userId);

	int deleteLog(int logId);

	List<Log> queryByUserId(long userId);

	List<Log> queryAll();

}
