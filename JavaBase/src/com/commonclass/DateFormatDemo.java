package com.commonclass;

import java.util.Calendar;
import java.util.Date;

public class DateFormatDemo
{

	public static void main(String[] args)
	{
/*	Date date=new Date();
	//使用toString() 显示日期
	System.out.println(date.toString());*/
	Calendar c1=Calendar.getInstance();
	int year=c1.get(Calendar.YEAR);
	System.out.println(year);
	int month=c1.get(Calendar.MONTH)+1;
	System.out.println(month);
	int date=c1.get(Calendar.DATE);
	System.out.println(date);
	int hour=c1.get(Calendar.HOUR_OF_DAY);
	System.out.println(hour);
	int minute=c1.get(Calendar.MINUTE);
	System.out.println(minute);
	int second=c1.get(Calendar.SECOND);
	System.out.println(second);
	int day=c1.get(Calendar.DAY_OF_WEEK);
	System.out.println(day);
	}

}
