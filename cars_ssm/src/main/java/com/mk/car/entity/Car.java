package com.mk.car.entity;

import java.util.Date;

public class Car
{
	private int id;
	private String carno;  //车牌号
	private double weight; //空车重量(kg)
	private double maxload; //最大载重(kg)
	private double loading; //当前载重(kg)
	
	private Date serviceDate; //服役日期
	private int status; //车辆状态(0（营运）、1（闲置）、2（退役）)
	
	private String location; //当前位置(区划编号)
	private int trantsCounts; //运输次数
	private double kilometers; //运输公里数
	private String remark; //备注

	public Car()
	{
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getCarno()
	{
		return carno;
	}

	public void setCarno(String carno)
	{
		this.carno = carno;
	}

	public double getWeight()
	{
		return weight;
	}

	public void setWeight(double weight)
	{
		this.weight = weight;
	}

	public double getMaxload()
	{
		return maxload;
	}

	public void setMaxload(double maxload)
	{
		this.maxload = maxload;
	}

	public double getLoading()
	{
		return loading;
	}

	public void setLoading(double loading)
	{
		this.loading = loading;
	}

	public Date getServiceDate()
	{
		return serviceDate;
	}

	public void setServiceDate(Date serviceDate)
	{
		this.serviceDate = serviceDate;
	}

	public int getStatus()
	{
		return status;
	}

	public void setStatus(int status)
	{
		this.status = status;
	}

	public String getLocation()
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	public int getTrantsCounts()
	{
		return trantsCounts;
	}

	public void setTrantsCounts(int trantsCounts)
	{
		this.trantsCounts = trantsCounts;
	}

	public double getKilometers()
	{
		return kilometers;
	}

	public void setKilometers(double kilometers)
	{
		this.kilometers = kilometers;
	}

	public String getRemark()
	{
		return remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	@Override
	public String toString()
	{
		return "Car [id=" + id + ", carno=" + carno + ", weight=" + weight + ", maxload=" + maxload + ", loading="
				+ loading + ", serviceDate=" + serviceDate + ", status=" + status + ", location=" + location
				+ ", trantsCounts=" + trantsCounts + ", kilometers=" + kilometers + ", remark=" + remark + "]";
	}
	
	
}
