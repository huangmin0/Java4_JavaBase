package com.enumdemo;

import java.io.PrintStream;

import lombok.Setter;

public enum Test3 implements Behavior
{

	
	
		MONDAY(1, "星期一"), TUESDAY(2, "星期二"), WEDNESDAY(3, "星期三"), THURDAY(4, "星期四"), FRIDAY(5, "星期五"), SATURDAY(6,
				"星期六"), SUNDAY(7, "星期日");
		
	@Setter // @Setter不支持写在枚举上面
	private int index; // 索引
	@Setter
	private String desc; // 描述

	private Test3(int index, String desc) {
		this.index = index;
		this.desc = desc;
	}

	@Override
	public void print()
	{
		System.out.println("打印这个内容"+"----"+this.desc+"----"+this.index);

	}

	@Override
	public String getInfo()
	{

		return "Test3"+this.index+"------"+this.desc;
	}
	
		
	

}
