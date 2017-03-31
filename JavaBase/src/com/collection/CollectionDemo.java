package com.collection;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
public class CollectionDemo
{

	public static void main(String[] args)
	{
		
		ArrayList<String> list=new ArrayList<String>();
		ArrayList<String> l=new ArrayList<String>();
		
		list.add("中");
		list.add("华");
		list.add("人");
		list.add("民");
		list.add("共");
		list.add("和");
		list.add("国");
		list.add("国");
		l.add("人");
		l.add("民");
		
		//foreach输出
		System.out.println("输出list的内容：");
		for (String string : list)
		{
			System.out.println(string);
		}
		list.add(0,"我");
		list.add(1,"爱");
		System.out.println("指定的元素再添加");
		System.out.println(list);
		//获取元素
		System.out.println("list.get(0):"+list.get(0));
		
		System.out.println("使用迭代输出");
		Iterator iterator= (Iterator) list.iterator();
		while (iterator.hasNext())
		{
			String string = (String) iterator.next();
			System.out.println(string);
		}
		//删除list的元素
		list.remove(0);
		System.out.println("删除指定位置的元素，0位置  "+list.remove(0));
		System.out.println("删除list的元素0后使用迭代输出");
		Iterator<String> iterator1=list.iterator();
		while (iterator1.hasNext())
		{
			String string = (String) iterator1.next();
			System.out.println(string);
		}
		//包含测试
		System.out.println("list 包含 华："+list.contains("华"));
		//测试非空
		System.out.println("list 非空："+list.isEmpty());
		//测试list容量
		System.out.println("list 容量："+list.size());
		list.remove("华");
		System.out.println("删除华后用迭代输出");
		Iterator iterator3= (Iterator) list.iterator();
		while (iterator3.hasNext())
		{
			String string = (String) iterator3.next();
			System.out.println(string);
		}
		
		System.out.println("list.indexOf国:"+list.indexOf("国"));
		System.out.println("list.lastindexOf国:"+list.lastIndexOf("国"));
		System.out.println("list.subList:"+list.subList(0, 4));
		List<String> list2= list.subList(2, 6);//修改list2 会影响list
		System.out.println("list.containsAll(list2):"+list.containsAll(list));
		//list2添加元素
		list2.add("CN");
		System.out.println(list2);
		System.out.println(list);
		System.out.println("list.containsAll(list2):"+list.containsAll(list2));
		
		/*list.removeAll(list);//删除所有的元素
		System.out.println("list.size()"+list.size());
		
		list.clear();//清除所有的元素
*/		
		list.retainAll(l);
		System.out.println("list.size()"+list.size());
		System.out.println(list);
		
		
		
		
		
		
		
	}

}
