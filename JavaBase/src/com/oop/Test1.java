package com.oop;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test1 implements Runnable
{

	
	
	



	@Override
	public void run()
	{
		try
		{
		
			Class c=new Multiplication().getClass();
			Method method=c.getDeclaredMethod("show");
			Multiplication o=(Multiplication) c.newInstance();
			method.invoke(o);
		} catch (NoSuchMethodException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
