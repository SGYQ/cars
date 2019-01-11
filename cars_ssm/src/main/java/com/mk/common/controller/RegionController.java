package com.mk.common.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.mk.common.entity.Region;
import com.mk.common.service.RegionService;

@Controller
public class RegionController
{
	@Autowired
	private RegionService regionService;
	
	@RequestMapping("/getReions")
	@ResponseBody
	public String queryRegions(HttpServletRequest request)
	{
		String pid = request.getParameter("pid");
		String level = request.getParameter("level");
		
		List<Region> list = regionService.findRegions(pid, level);
		
		String jsonStr = JSON.toJSONString(list);
		return jsonStr;
	}
	
}
