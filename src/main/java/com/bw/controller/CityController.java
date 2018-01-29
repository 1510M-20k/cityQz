package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.service.CityService;
import com.bw.vo.City;
import com.bw.vo.Qz;

@Controller
public class CityController {
	@Autowired
	private CityService cityService;
	//列表
	@RequestMapping("list")
	public String list(Model m){
		List<Qz> qlist=cityService.getQzList();
	/*	List<City> clist=cityService.getCityList();*/
		m.addAttribute("qlist", qlist);
		/*m.addAttribute("clist", clist);*/
		return "list";
	}
}
