package com.iss.okair.controller.assets;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iss.common.Message;
import com.iss.okair.db.entity.AssetsFinance;
import com.iss.okair.model.AssetsFinanceModel;
import com.iss.okair.service.assets.AssetsFinanceService;

@RestController
@RequestMapping("/logic/assets/finance")
public class AssetsFinanceController {
	@Autowired
	private AssetsFinanceService service;
	/**
	 * 检索功能
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/list", method= {RequestMethod.POST})
	public List<AssetsFinance> findByExample(AssetsFinanceModel model) {
		return service.find(model);
	}
	@RequestMapping(value="/save", method= {RequestMethod.POST})
	public Message saveAssets(AssetsFinance assets) {
		
		Message msg = new Message();
		if(service.save(assets)) {
			msg.setError(false);
			msg.setMsg("保存成功");
		} else {
			msg.setError(true);
			msg.setMsg("保存失败");
		}
		
		return msg;
	}
	@RequestMapping(value="/{assetsId}", method= {RequestMethod.POST})
	public AssetsFinance findAssetsById(@PathVariable String assetsId) {
		return service.findById(assetsId);
	}
}