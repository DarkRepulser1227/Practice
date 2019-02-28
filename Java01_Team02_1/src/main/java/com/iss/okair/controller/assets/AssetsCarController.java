package com.iss.okair.controller.assets;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iss.common.Message;
import com.iss.okair.db.entity.AssetsCar;
import com.iss.okair.model.AssetsCarModel;
import com.iss.okair.service.assets.AssetsCarService;

@RestController
@RequestMapping("/logic/assets/car")
public class AssetsCarController {
	@Autowired
	private AssetsCarService service;
	
	
	@RequestMapping("/list")
	public List<AssetsCar> AssetsCar(AssetsCarModel example){
		return service.selectByExample(example);
	}
	@RequestMapping("/save")
	public Message save(AssetsCar assets) {
		Message msg = new Message();
		boolean flag =service.save(assets);
		if (flag) {
			msg.setMsg("保存成功");
			msg.setError(false);
		}else {
			msg.setMsg("保存失败");
			msg.setError(true);
		}
		return msg;
	} 
	
}
