package com.iss.okair.db.mapper;

import java.util.List;

import com.iss.okair.db.entity.AssetsCar;
import com.iss.okair.model.AssetsCarModel;

public interface AssetsCarMapper {
	 List<AssetsCar> selectByExample(AssetsCarModel example );
	 int insertSelective(AssetsCar assets);
	 int countAll();
	 AssetsCar selectByPrimaryKey(String id);
	 int updateByPrimaryKeySelective(AssetsCar record);
}
