package com.mk.common.entity;

public class Region
{
	private String id;
	private String name;
	private String level;
	private String pid;
	private int validity;

	public Region()
	{
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getLevel()
	{
		return level;
	}

	public void setLevel(String level)
	{
		this.level = level;
	}

	public String getPid()
	{
		return pid;
	}

	public void setPid(String pid)
	{
		this.pid = pid;
	}

	public int getValidity()
	{
		return validity;
	}

	public void setValidity(int validity)
	{
		this.validity = validity;
	}

	@Override
	public String toString()
	{
		return "Region [id=" + id + ", name=" + name + ", level=" + level + ", pid=" + pid + ", validity=" + validity
				+ "]";
	}
	
}
