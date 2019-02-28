package com.iss.okair.service.baseinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.okair.db.entity.DictType;
import com.iss.okair.db.entity.SysDictValue;
import com.iss.okair.db.mapper.DictTypeMapper;
import com.iss.okair.db.mapper.SysDictValueMapper;
@Service
public class SysDictValueService {
	@Autowired
	private DictTypeMapper dictTypeMapper;

	@Autowired	
	private SysDictValueMapper sysDictValueMapper;
 
	public List<DictType> typeList(){
		return dictTypeMapper.selectAll();
	}
	public List< SysDictValue> selectByExample( SysDictValue example){
		return sysDictValueMapper.selectByExample(example);
	}
	public List<SysDictValue> getTypeCode(String typeCode){
		return sysDictValueMapper.getTypeCode(typeCode);
	}
	public 	List<SysDictValue> getCity(String city){
		return sysDictValueMapper.getCity(city);
	}
}
