package com.mk.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mk.common.dao.RegionDao;
import com.mk.common.entity.Region;

@Service
public class RegionService
{
	@Autowired
	private RegionDao regionDao;
	
	/**
	 * <p> 根据上级编号、行政等级 查询 
	 * @param father_id
	 * @param level
	 * @return 列表 List
	 */
	public List<Region> findRegions(String father_id, String level)
	{
		return regionDao.selectRegions(father_id, level);
	}
}
