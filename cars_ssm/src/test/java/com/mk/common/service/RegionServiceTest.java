package com.mk.common.service;


import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mk.common.entity.Region;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = {"classpath:applicationContext.xml"}) 
public class RegionServiceTest
{
	@Autowired
	private RegionService regionService;
	
	@Before
	public void setUp() throws Exception
	{
	}

	@Test
	public void testFindRegions()
	{
		List<Region> list = regionService.findRegions("00031000000000", "B");
		
		for(Region r: list)
			System.out.println(r);
	}

}
