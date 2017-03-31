package com.collection;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;

import javax.naming.ldap.SortControl;
public class CollectionDemo2
{

	public static void main(String[] args)
	{
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student("ID001", 20));
		list.add(new Student("ID002", 25));
		list.add(new Student("ID003", 19));
		list.add(new Student("ID004", 15));
		list.add(new Student("ID005", 30));
		System.out.println("list排序前"+list);
		//排序
		//Arrays//对数组排序
		Collections.sort(list);
		System.out.println("list排序后"+list);
		
		list.contains(new Student("ID001", 50));
		System.out.println("list.contains(new Student('ID001', 50))"+list.contains(new Student("ID001", 50)));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
