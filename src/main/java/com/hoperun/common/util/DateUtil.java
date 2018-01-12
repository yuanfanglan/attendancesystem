package com.hoperun.common.util;

import java.util.Date;

/**
 * 日期工具
 * 
 * @author XHX
 * @date 2017年12月27日 下午4:11:10
 */
public class DateUtil {

	/**
	 * 获取指定日期的月初
	 * 
	 * @param date
	 * @return
	 */
	public static Date getStartOfMonth(Date date) {
		return new Date(date.getYear(), date.getMonth(), 1);
	};

	public static void main(String[] args) {

		System.out.println(getStartOfMonth(new Date()));
		System.out.println(getEndOfMonth(new Date()));

	}

	/**
	 * 获取指定日期下个月月初
	 * 
	 * @param date
	 * @return
	 */
	public static Date getEndOfMonth(Date date) {
		int year = date.getYear();
		int month = date.getMonth();
		// 超过12月
		if (date.getMonth() + 1 > 11) {
			month = -1;
			year += 1;
		}
		return new Date(year, month + 1, 1);
	};
}
