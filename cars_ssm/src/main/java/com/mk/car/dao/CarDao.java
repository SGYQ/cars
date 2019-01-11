package com.mk.car.dao;

import java.util.List;

import com.mk.car.entity.Car;

public interface CarDao
{
	//仅传入分页参数, 查询条件(车牌号、状态、编号)
	
	/**
	 * 根据查询条件查询数据
	 * @param carno 车牌号, 允许为空
	 * @param status 车辆状态, 允许为空
	 * @param id 车辆编号 , 允许为空
	 * @return 列表 List
	 */
	public List<Car> selectCarsByPara(String carno, Integer status, String id);
	
	/**
	 * 查询 总数
	 * @return
	 */
	public int selectCounts();
	
	/**
	 * 根据 查询条件 查询数目
	 * @param carno , 允许为空
	 * @param status, 允许为空
	 * @param id, 允许为空
	 * @return
	 */
	public int selectCountByPara(String carno, Integer status, String id);
	
	/**
	 * <p>添加信息
	 * @param car
	 * @return
	 * @throws Exception
	 */
	public int insertCar(Car car) throws Exception;
	
	/**
	 * <p> 根据车辆编号 删除信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int deleteCar(int id) throws Exception;
	
	/**
	 * <p> 编辑车辆信息
	 * @param car
	 * @return
	 * @throws Exception
	 */
	public int updateCar(Car car) throws Exception;
	
	/**
	 * <p>根据车辆编号查询
	 * @param id
	 * @return
	 */
	public Car selectCarById(int id);
	
	
}
