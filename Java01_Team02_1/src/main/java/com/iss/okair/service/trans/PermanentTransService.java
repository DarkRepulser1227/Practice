package com.iss.okair.service.trans;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.common.UuidTools;
import com.iss.okair.db.entity.Alltranslist;
import com.iss.okair.db.entity.Assetstrans;
import com.iss.okair.db.mapper.AlltranslistMapper;
import com.iss.okair.db.mapper.AssetsPermanentMapper;
import com.iss.okair.db.mapper.AssetstransMapper;

@Service
public class PermanentTransService {
	@Autowired
	private AssetsPermanentMapper assetsPermanentMapper;
	@Autowired
	private AssetstransMapper assetstransMapper;
	@Autowired
	private AlltranslistMapper alltranslistMapper;
	
	public int instock(Assetstrans trans) {
		trans.setTranstype("1");
		trans.setBatchno(
		PermanentTransService.buildBatchNO(assetsPermanentMapper.selectByPrimaryKey(trans.getAssetsid()).getAssetscode()));
		trans.setId(UuidTools.buildUUID());
		return assetstransMapper.insertSelective(trans);
	}
	
	public static String buildBatchNO(String assetsCode) {
		Calendar cal = Calendar.getInstance();
		String current = cal.getTimeInMillis()+"";
		String result = String.format("%s-%s", assetsCode,current);
		return result;
	}
	public List<Alltranslist> findByAssetsId(String assetsId){
		return alltranslistMapper.selectByAssetsId(assetsId);
	}
}
