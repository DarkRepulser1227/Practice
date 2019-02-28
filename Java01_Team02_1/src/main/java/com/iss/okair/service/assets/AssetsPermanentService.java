package com.iss.okair.service.assets;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.common.StringTools;
import com.iss.common.UuidTools;
import com.iss.okair.db.entity.AssetsPermanent;
import com.iss.okair.db.entity.CateGory;
import com.iss.okair.db.mapper.AssetsPermanentMapper;
import com.iss.okair.db.mapper.CateGoryMapper;
import com.iss.okair.model.AssetsPermanentModel;

@Service
public class AssetsPermanentService {
	@Autowired
	private AssetsPermanentMapper assetsPermanentMapper;
	@Autowired
	private CateGoryMapper cateGoryMapper;

	public List<AssetsPermanent> selectByExample(AssetsPermanentModel example) {
		return assetsPermanentMapper.selectByExample(example);
	}

	public boolean save(AssetsPermanent assets) {
		if (StringTools.isNullOrEmpty(assets.getId())) {
			assets.setAssetscode(this.buildAssetsCode(assets.getAssetstype()));
			assets.setId(UuidTools.buildUUID());
			return assetsPermanentMapper.insertSelective(assets) == 1 ? true : false;
		} else {
			if (assetsPermanentMapper.selectByPrimaryKey(assets.getId()) != null) {

				return assetsPermanentMapper.updateByPrimaryKeySelective(assets) == 1 ? true : false;
			} else {
				return false;
			}
		}
	}

	private String buildAssetsCode(Integer assetsType) {

		CateGory cateGory = cateGoryMapper.selectByPrimaryKey(assetsType);
		String code = cateGory.getCode();
		String tmp = String.format("PER%s-%06d", code, assetsPermanentMapper.countAll() + 1);
		return tmp;
	}

}
