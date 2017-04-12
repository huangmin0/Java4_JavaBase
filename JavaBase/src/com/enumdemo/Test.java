package com.enumdemo;

import com.annotation.test;

public class Test
{

	public static void main(String[] args)
	{
		for (EnumTest e : EnumTest.values())
		{
			System.out.println(e.toString()+"----"+e.ordinal());
		}
System.out.println("-----------这是分割线------");
EnumTest test=EnumTest.TUE;
switch (test)
{
case MON:
	System.out.println("今天是星期一");
	break;
case TUE:
System.out.println("今天是星期二");
break;
default:
	break;
}
	}

}
