package com.collection;

public class IntegerDemo
{

	public static void main(String[] args)
	{
		Integer integer1=127;
		Integer integer2=127;
		System.out.println(integer1==integer2);
		System.out.println(integer1.equals(integer2));
		
		System.out.println("------------------------------");
		Integer integer3=128;
		Integer integer4=128;
		System.out.println(integer3==integer4);
		System.out.println(integer3.equals(integer4));
		
		System.out.println("+++++++++++++++++++++++");
		Integer integerA=new Integer(126);
		Integer integerB=new Integer(126);
		System.out.println(integerA==integerB);
		System.out.println(integerA.equals(integerB));
		
	}

}
