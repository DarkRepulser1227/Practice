package com.iss.okair.controller.baseinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iss.okair.db.entity.CateGory;
import com.iss.okair.db.entity.CateGoryParent;
import com.iss.okair.service.baseinfo.CateGoryService;

@RestController
@RequestMapping("/logic/baseInfo/category")
public class CateGoryControllrt {
	@Autowired
	private CateGoryService service;
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             

	@RequestMapping("/parentList")
	public List<CateGoryParent> parentList(){
		return service.parentList();
 }
	@RequestMapping("/find")
	public List<CateGory> find(CateGory example){		
	return service.selectByExample(example);
		
	}
	@RequestMapping("/list/{parentId}")
	public List<CateGory> list(@PathVariable Integer parentId){
		return service.list(parentId);
	}
	@RequestMapping("/{categoryId}")
	public CateGory findCategoryById(@PathVariable Integer categoryId ) {
		return  service.selectParentByPrimaryId(categoryId);
	}
}
