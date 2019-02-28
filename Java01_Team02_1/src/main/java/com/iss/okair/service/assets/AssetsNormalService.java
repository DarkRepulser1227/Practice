package com.iss.okair.service.assets;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.common.StringTools;
import com.iss.common.UuidTools;
import com.iss.okair.db.entity.AssetsNormal;
import com.iss.okair.db.entity.CateGory;
import com.iss.okair.db.mapper.AssetsNormalMapper;
import com.iss.okair.db.mapper.CateGoryMapper;
import com.iss.okair.model.AssetsNormalModel;

@Service
public class AssetsNormalService {
	@Autowired
	private AssetsNormalMapper normalMapper;
	@Autowired
	private CateGoryMapper cateGoryMapper;
	/**
	 * 检索功能(根据实例进行检索)
	 * @param model
	 * @return
	 */
	public List<AssetsNormal> find(AssetsNormalModel model){
		
		return normalMapper.selectByExample(model);
	}
	
	public boolean save(AssetsNormal assets) {
		// TODO Auto-generated method stub
		if(StringTools.isNullOrEmpty(assets.getId())) {
			assets.setAssetscode(this.buildAssetsCode(assets.getAssetstype()));
			assets.setId(UuidTools.buildUUID());
			return normalMapper.insertSelective(assets)==1?true:false;
		} else {
			if(normalMapper.selectByPrimaryKey(assets.getId())!=null) {
				return normalMapper.updateByPrimaryKeySelective(assets)==1?true:false;
			} else {
				return false;
			}
		}
	}
	private String buildAssetsCode(Integer assetsType) {
		CateGory currentCategory = cateGoryMapper.selectByPrimaryKey(assetsType);
		String tmp = String.format("NOR%s-%06d", currentCategory.getCode(), normalMapper.countAll() + 1);
		return tmp;
	}
	public AssetsNormal findById(String assetsId) {
		return normalMapper.selectByPrimaryKey(assetsId);
	}
}
