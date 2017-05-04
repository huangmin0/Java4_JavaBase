package com.commonclass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo
{

	public static void main(String[] args)
	{
	Date date=new Date();
	SimpleDateFormat ft=new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	System.out.println("输出当前时间："+ft.format(date));
	}

}
