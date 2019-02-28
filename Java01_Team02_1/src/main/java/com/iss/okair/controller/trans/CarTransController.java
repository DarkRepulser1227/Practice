package com.iss.okair.controller.trans;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iss.common.Message;
import com.iss.okair.db.entity.Alltranslist;
import com.iss.okair.db.entity.Assetstrans;
import com.iss.okair.service.trans.CarTransService;

@RestController
@RequestMapping("/logic/trans/car")
public class CarTransController {
	@Autowired
	private CarTransService service;
	@RequestMapping("/instock")
	public Message instock(Assetstrans trans) {
		System.out.println(trans.toString());
		Message msg = new Message();
		if(service.instock(trans)==1) {
			msg.setError(false);
		}else {
			msg.setError(true);
		}
		return msg;
	}
	@RequestMapping("/history/{assetsid}")
	public List<Alltranslist> findTransByAssetsId(@PathVariable String assetsid){
		return service.findByAssetsId(assetsid);
	}
}
