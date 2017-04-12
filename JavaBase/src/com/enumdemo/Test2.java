package com.enumdemo;

import java.awt.Component.BaselineResizeBehavior;
import java.util.EnumMap;
import java.util.Map.Entry;

public class Test2
{

	public static void main(String[] args)
	{
		EnumTest test=EnumTest.TUE;
		int compareTo = test.compareTo(EnumTest.SUN);
		System.out.println(compareTo);
		//compare To
		if(test.compareTo(EnumTest.MON)<0){
			System.out.println("在TUE之前");
			
		}else if(test.compareTo(test.WED)>0){
			System.out.println("在TUE之后");
		}else{
			System.out.println("和TUE在同一位置");
		}
		//此方法有bug
		/*switch (test.compareTo(EnumTest.MON))
		{
		case -1:
			System.out.println("TUE在MON之前");
			break;
		case 1:
			System.out.println("TUE在MON之之后");
			break;

		default:
			System.out.println("TUE和MON在同一位置");
			break;
		}*/
		//getDeclaringClass
		System.out.println("getDeclaringClass():"+test.getDeclaringClass().getName());
		//name()和toString();
		System.out.println("name:"+test.name());
		System.out.println("toString:"+test.toString());
		//返回值是从0开始的
		System.out.println(test.ordinal());
		Behavior behavior=Test3.FRIDAY;
		behavior.print();
		behavior.getInfo();
	
	
	}

}
