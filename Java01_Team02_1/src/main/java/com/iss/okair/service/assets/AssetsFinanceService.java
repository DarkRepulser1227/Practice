package com.iss.okair.service.assets;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.common.StringTools;
import com.iss.common.UuidTools;
import com.iss.okair.db.entity.AssetsFinance;
import com.iss.okair.db.entity.CateGory;
import com.iss.okair.db.mapper.AssetsFinanceMapper;
import com.iss.okair.db.mapper.CateGoryMapper;
import com.iss.okair.model.AssetsFinanceModel;

@Service
public class AssetsFinanceService {
	@Autowired
	private AssetsFinanceMapper financeMapper;
	
	@Autowired
	private CateGoryMapper cateGoryMapper;
	
	public List<AssetsFinance> find(AssetsFinanceModel model) {
		AssetsFinance example = null;
		return financeMapper.selectByExample(model);
	}
	
	public boolean save(AssetsFinance assets) {
		// TODO Auto-generated method stub
		if(StringTools.isNullOrEmpty(assets.getId())) {
			assets.setAssetscode(this.buildAssetsCode(assets.getAssetstype()));
			assets.setId(UuidTools.buildUUID());
			return financeMapper.insertSelective(assets)==1?true:false;
		} else {
			if(financeMapper.selectByPrimaryKey(assets.getId())!=null) {
				return financeMapper.updateByPrimaryKeySelective(assets)==1?true:false;
			} else {
				return false;
			}
		}
	}
	private String buildAssetsCode(Integer assetsType) {
		CateGory currentCategory = cateGoryMapper.selectByPrimaryKey(assetsType);
		String tmp = String.format("FIN%s-%06d", currentCategory.getCode(), financeMapper.countAll() + 1);
		return tmp;
	}
	public AssetsFinance findById(String assetsId) {
		return financeMapper.selectByPrimaryKey(assetsId);
	}
}
