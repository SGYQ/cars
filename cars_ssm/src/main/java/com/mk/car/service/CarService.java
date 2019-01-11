package com.mk.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mk.car.dao.CarDao;
import com.mk.car.entity.Car;

@Service
public class CarService
{
	@Autowired
	private CarDao carDao;
	
	/**
	 * 根据条件查询数据列表
	 * @param carno 车牌号,允许为空
	 * @param id 编号,允许为空
	 * @param status 车辆状态 ,允许为空
	 * @return
	 */
	public List<Car> findCarsByPara(String carno, String id, Integer status)
	{
		List<Car> list = carDao.selectCarsByPara(carno, status, id);
		
		return list;
	}
}
