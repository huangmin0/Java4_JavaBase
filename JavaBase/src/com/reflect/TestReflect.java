package com.reflect;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
public class TestReflect
{

	public static void main(String[] args)throws Exception
	{
		Class<?> c=null;
		try
		{
			c = Class.forName("com.reflect.Person");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		Person per1=null;
		Person per2=null;
		Person per3=null;
		Person per0=null;
		//	取得全部的构造函数
		try
		{
			Constructor<?> cons[]=c.getConstructors();
			per1=(Person) cons[3].newInstance();
			per2=(Person) cons[1].newInstance(25);
			per3=(Person) cons[2].newInstance("Mike");
			per0=(Person) cons[0].newInstance("Mike",25);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(per0);
		System.out.println(per1);
		System.out.println(per2);
		System.out.println(per3);
	}

}
