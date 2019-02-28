package com.iss.okair.db.mapper;

import java.util.List;

import com.iss.okair.db.entity.AssetsFinance;
import com.iss.okair.model.AssetsFinanceModel;

public interface AssetsFinanceMapper {
	int insertSelective(AssetsFinance record);
	List<AssetsFinance> selectByExample(AssetsFinanceModel model);
    AssetsFinance selectByPrimaryKey(String id);
    int updateByPrimaryKeySelective(AssetsFinance record);
	int countAll();
	
}
