package com.iss.okair.controller.assets;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iss.common.Message;
import com.iss.okair.db.entity.AssetsCar;
import com.iss.okair.db.entity.AssetsPermanent;
import com.iss.okair.model.AssetsPermanentModel;
import com.iss.okair.service.assets.AssetsPermanentService;
@RestController
@RequestMapping("/logic/assets/permanent")


public class AssetsPermanentController {
	@Autowired
	private AssetsPermanentService service;
	
	@RequestMapping("/list")
	public List<AssetsPermanent> AssetsPermanent(AssetsPermanentModel model){
		return service.selectByExample(model);
	}
	@RequestMapping("/save")
	public Message save(AssetsPermanent assets) {
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
