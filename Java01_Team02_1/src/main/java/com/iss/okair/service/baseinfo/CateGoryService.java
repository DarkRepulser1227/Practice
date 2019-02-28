package com.iss.okair.service.baseinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.okair.db.entity.CateGory;
import com.iss.okair.db.entity.CateGoryParent;
import com.iss.okair.db.mapper.CateGoryMapper;
import com.iss.okair.db.mapper.CateGoryParentMapper;

@Service
public class CateGoryService {
	@Autowired
	private CateGoryMapper cateGoryMapper;

	@Autowired	
	private CateGoryParentMapper cateGoryParentMapper;
 
	public List<CateGoryParent> parentList(){
		return cateGoryParentMapper.selectAll();
	}
	public List< CateGory> selectByExample( CateGory example){
		return cateGoryMapper.selectByExample(example);
	}
	public List< CateGory> list( Integer parentId){
		return cateGoryMapper.list(parentId);
		}
	public CateGory selectByPrimaryKey(Integer id) {
		return cateGoryMapper.selectByPrimaryKey(id);
	}
	public CateGory selectParentByPrimaryId(Integer id) {
		return cateGoryMapper.selectParentByPrimaryId(id);
	}
}
