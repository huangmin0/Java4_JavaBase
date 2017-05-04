package com.commonclass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintfDemo
{

	public static void main(String[] args)
	{
	Date date=new Date();
	System.out.printf("全部日期和时间信息:%tc%n",date);
	System.out.printf("全部日期和时间信息:%tF%n",date);
	System.out.printf("全部日期和时间信息:%tD%n",date);
	System.out.printf("全部日期和时间信息:%tr%n",date);
	System.out.printf("全部日期和时间信息:%tR%n",date);
	}

}
