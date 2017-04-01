package com.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo
{

	public static void main(String[] args)
	{
		TreeSet<Student> treeSet=new TreeSet<Student>();
		treeSet.add(new Student("TD001", 19));
		treeSet.add(new Student("TD002", 50));
		treeSet.add(new Student("TD003", 35));
		treeSet.add(new Student("TD004", 10));
		treeSet.add(new Student("TD005", 70));
		treeSet.add(new Student("TD006", 30));
		System.out.println(treeSet);
		Iterator<Student> iterator=treeSet.iterator();
		System.out.println("使用迭代器遍历");
		while (iterator.hasNext())
		{
			Student student = (Student) iterator.next();
			System.out.println(student);
			
		}
		System.out.println("使用foreach遍历");
	for (Student student : treeSet)
	{
		
		System.out.println(student);
	}
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		
		System.out.println("使用ceiling");
		System.out.println(treeSet.ceiling(new Student("TD00A",20)));
		System.out.println(treeSet.ceiling(new Student("TD00A",30)));
		System.out.println(treeSet.floor(new Student("TD00A",20)));
		System.out.println(treeSet.floor(new Student("TD00A",60)));
		System.out.println(treeSet.higher(new Student("TD00A",60)));
		
		System.out.println("使用treeSet.lower");
		System.out.println(treeSet.lower(new Student("TD00A",55)));
		System.out.println("使用treeSet.tailSet");
		System.out.println(treeSet.tailSet(new Student("TD00A",55)));
		System.out.println(treeSet.tailSet(new Student("TD00A",30)));
		
		Iterator<Student> descIterator= treeSet.descendingIterator();//得到降序迭代器
		while (descIterator.hasNext())
		{
			Student student = (Student) descIterator.next();
			System.out.print(student);
		}
		
	}
}
