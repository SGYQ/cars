package com.mk.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mk.car.entity.Car;
import com.mk.car.service.CarService;

@Controller
@RequestMapping("/")
public class CarController
{
	@Autowired
	private CarService carService;

	/**
	 * 查询数据列表(有/无条件)
	 * @param pn 页面索引
	 * @param carno 车牌号 
	 * @param id 车辆编号
	 * @param status 车辆状态
	 * @return
	 */
	@RequestMapping("/getCars")
	@ResponseBody
	public String queryCarsByPara(@RequestParam(value="pn",defaultValue="1")Integer pn,
			@RequestParam(value="carno",defaultValue="")String carno,
			@RequestParam(value="id",defaultValue="")String id,
			@RequestParam(value="status",defaultValue="")Integer status)
	{
		//放在第一句，(起始页，页面大小)
		PageHelper.startPage(pn, 5);
		//查询列表 ---##
		List<Car> list = carService.findCarsByPara(carno, id, status);
		//传入连续分页的页面索引数量
		PageInfo<Car> pageInfo = new PageInfo<Car>(list,7);
		
		String result = JSON.toJSONString(pageInfo);
		return result;
	}
}
