package com.iss.okair.controller.baseinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iss.okair.db.entity.DictType;
import com.iss.okair.db.entity.SysDictValue;
import com.iss.okair.service.baseinfo.SysDictValueService;
@RestController
@RequestMapping("/logic/baseInfo/sysDict")
public class SysDictController {
	@Autowired
	private SysDictValueService service;
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             

	@RequestMapping("/typeList")
	public List<DictType> typeList(){
		return service.typeList();
 }
	@RequestMapping("/find")
	public List< SysDictValue> find( SysDictValue example){
		return service.selectByExample(example);

	}
	@RequestMapping("/{typeCode}")
		public List<SysDictValue> getTypeCode(@PathVariable String typeCode ){
		return service.getTypeCode(typeCode);
	}

		
}
