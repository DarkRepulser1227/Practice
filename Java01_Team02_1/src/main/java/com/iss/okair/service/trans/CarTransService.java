package com.iss.okair.service.trans;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.common.UuidTools;
import com.iss.okair.db.entity.Alltranslist;
import com.iss.okair.db.entity.Assetstrans;
import com.iss.okair.db.mapper.AlltranslistMapper;
import com.iss.okair.db.mapper.AssetsCarMapper;
import com.iss.okair.db.mapper.AssetstransMapper;
@Service
public class CarTransService {
	@Autowired
	private AssetsCarMapper assetsCarMapper;
	@Autowired
	private AssetstransMapper assetstransMapper;
	@Autowired
	private AlltranslistMapper alltranslistMapper;
	

	public int instock(Assetstrans trans) {
		System.out.println(trans.toString());
		trans.setTranstype("1");
		System.out.println(trans.getAssetsid());
		trans.setBatchno(
		buildBatchNO(assetsCarMapper.selectByPrimaryKey(trans.getAssetsid()).getAssetscode()));
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
