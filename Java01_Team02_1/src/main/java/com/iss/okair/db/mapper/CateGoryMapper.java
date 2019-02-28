package com.iss.okair.db.mapper;

import java.util.List;

import com.iss.okair.db.entity.CateGory;

public interface CateGoryMapper {
	List< CateGory> find( CateGory example);
	List< CateGory> selectByExample( CateGory example);
	List< CateGory> list(Integer parentId);
	CateGory selectByPrimaryKey(Integer id);
	CateGory selectParentByPrimaryId(Integer id);
	
}
