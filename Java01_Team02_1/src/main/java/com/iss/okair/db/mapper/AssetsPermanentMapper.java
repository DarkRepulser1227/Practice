package com.iss.okair.db.mapper;

import java.util.List;

import com.iss.okair.db.entity.AssetsPermanent;
import com.iss.okair.model.AssetsPermanentModel;

public interface AssetsPermanentMapper {
	List<AssetsPermanent> selectByExample(AssetsPermanentModel example );
	int insertSelective(AssetsPermanent assets);
	int countAll();
	AssetsPermanent selectByPrimaryKey(String id);
	int updateByPrimaryKeySelective(AssetsPermanent record);
	
}
