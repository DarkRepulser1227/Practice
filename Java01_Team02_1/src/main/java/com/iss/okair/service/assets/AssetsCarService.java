package com.iss.okair.service.assets;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.common.StringTools;
import com.iss.common.UuidTools;
import com.iss.okair.db.entity.AssetsCar;
import com.iss.okair.db.entity.CateGory;
import com.iss.okair.db.mapper.AssetsCarMapper;
import com.iss.okair.db.mapper.CateGoryMapper;
import com.iss.okair.model.AssetsCarModel;

@Service
public class AssetsCarService {
	@Autowired
	private AssetsCarMapper assetsCarMapper;
	@Autowired
	private CateGoryMapper cateGoryMapper;

	public List<AssetsCar> selectByExample(AssetsCarModel example) {
		return assetsCarMapper.selectByExample(example);
	}

	public boolean save(AssetsCar assets) {
		if (StringTools.isNullOrEmpty(assets.getId())) {
			assets.setId(UuidTools.buildUUID());
			assets.setAssetscode(this.buildAssetsCode(assets.getAssetstype()));
			return assetsCarMapper.insertSelective(assets) == 1 ? true : false;
		} else {
			if (assetsCarMapper.selectByPrimaryKey(assets.getId()) != null) {
				return assetsCarMapper.updateByPrimaryKeySelective(assets) == 1?true:false;
			} else {
				return false;
			}
		}
	}

	private String buildAssetsCode(Integer assetsType) {

		CateGory cateGory = cateGoryMapper.selectByPrimaryKey(assetsType);
		String code = cateGory.getCode();
		String tmp = String.format("CAR%s-%06d", code, assetsCarMapper.countAll() + 1);
		return tmp;
	}

}
