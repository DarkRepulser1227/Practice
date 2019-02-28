package com.iss.okair.db.mapper;

import com.iss.okair.db.entity.Assetstrans;

public interface AssetstransMapper {
	int insertSelective(Assetstrans record);
	Assetstrans selectByPrimaryKey(String id);
	int updateByPrimaryKey(Assetstrans record);
}
