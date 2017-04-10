package com.reflect;

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import lombok.ToString;

public class TestReflect2
{

	public static void main(String[] args)throws Exception
	{		
		PrintStream out=System.out;
		//第一种得到class方式
		Class<?> c1=Class.forName("com.reflect.Person");
		//第二种得到class方式
		Class<?> c2=Person.class;
		//第三种得到class方式
		Person e=new Person();
		Class c3=e.getClass();//或者Class c3=new Person().getClass;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());
		
		System.out.println(c1.getModifiers());
		System.out.println(c2.getSimpleName());
		System.out.println(c3.getTypeName());
		System.out.println(c3.getClassLoader());
		
		System.out.println("该类拥有的字段");
		Field[] fields=c1.getDeclaredFields();
		for (Field field : fields)
		{
			System.out.println(field);
		}
		System.out.println("该类拥有的方法");
		Method[] methods=c1.getDeclaredMethods();
		for (Method method : methods)
		{
			System.out.println(method);
		}
		//利用反射创建person实例
		Person obj =(Person) c1.newInstance();
		
		System.out.println("访问指定字段");
		Field fname=c1.getDeclaredField("name");
		Field fage=c1.getDeclaredField("age");
		fname.setAccessible(true);
		System.out.println(fname.get(obj));
		fage.setAccessible(true);
		System.out.println(fage.get(obj));
		
	System.out.println("通过反射设定属性");
	fname.set(obj, "lisi");
	fage.set(obj, 23);
	System.out.println(fname.get(obj));
	System.out.println(fage.get(obj));
	
	System.out.println(obj.toString());
	
	System.out.println("通过反射唤醒或执行被反射的方法");
	Method method=c1.getMethod("printPersonSelf");
	System.out.println("唤醒printPersonSelf");
	method.invoke(obj);
}
}