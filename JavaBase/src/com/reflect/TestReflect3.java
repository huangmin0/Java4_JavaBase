package com.reflect;

import java.lang.reflect.Method;

public class TestReflect3
{

	public static void main(String[] args) throws Exception
	{
		Class c1=new Person().getClass();
		Person obj=(Person) c1.newInstance();
		Method method=c1.getMethod("printPersonSelf");
		method.invoke(obj);
}
}