package com.enumdemo;

import java.security.KeyStore.Entry;
import java.util.EnumMap;
import java.util.EnumSet;

public class EnumTest2
{

	public static void main(String[] args)
	{
		System.out.println("EnumTest1.FRI.getValue()的值="+EnumTest1.MON.isRest());
		System.out.println("EnumTest1.FRI.getValue()的值="+EnumTest1.STA.isRest());
		System.out.println("EnumTest1.FRI.getValue()的值="+EnumTest1.SUN.isRest());
		EnumSet<EnumTest1> es=EnumSet.allOf(EnumTest1.class);
		System.out.println(es);
		for (EnumTest1 enumTest1 : es)
		{
			System.out.println(enumTest1.isRest());
		}

}
}