package com.collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo
{

	public static void main(String[] args)
	{
	ArrayList<String> arrayListist=new ArrayList<String>();
	arrayListist.add("东");
	arrayListist.add("哥");
	arrayListist.add("教");
	arrayListist.add("你");
	arrayListist.add("扶");
	arrayListist.add("墙");
	for (String string : arrayListist)
	{
		System.out.println(string);
	}
	System.out.println("用Iterator遍历");
	Iterator<String> iterator=arrayListist.iterator();
	while (iterator.hasNext())
	{
		String string = (String) iterator.next();
		System.out.print(string);
	}
			
	
	}

}
