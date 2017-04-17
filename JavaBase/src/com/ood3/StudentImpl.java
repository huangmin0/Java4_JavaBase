package com.ood3;

public class StudentImpl extends Human implements IStudent
{

	@Override
	public void study()
	{
		System.out.println("我在学习，学习程序");

	}

	@Override
	public void studyJava(String java)
	{
		
		System.out.println("我在学习程序接口"+java);

	}

	@Override
	public void showInfo()
	{
	
		System.out.println("这是showInfo");
	}

	
}
