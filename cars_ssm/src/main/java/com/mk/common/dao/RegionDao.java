package com.mk.common.dao;

import java.util.List;

import com.mk.common.entity.Region;

public interface RegionDao
{	
	/**
	 * <p> 根据上级编号、行政等级 查询 
	 * @param father_id
	 * @param level
	 * @return 列表 List
	 */
	public List<Region> selectRegions(String father_id, String level);
}
