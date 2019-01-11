package com.mk.common.util;

public class StringUtils
{
	/**
	 * <p>判断字符串是否为 "" 或 null
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str)
	{
		if( "".equals(str)||str==null )
			return true;
		return false;
	}
	
	
	
}
