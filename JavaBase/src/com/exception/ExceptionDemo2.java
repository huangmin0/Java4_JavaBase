package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.spi.ThrowableRendererSupport;

public class ExceptionDemo2
{
	public static void main(String[] args) 
	{
		/*int ret=5;
		try
		{
			ret = div();
		} catch (Exception e)
		{
			
			e.printStackTrace();
		}
		System.out.println("返回的结果是：" + ret);
	}
*/
	
	try
	{
		exThrow(5);
	} catch (Exception e)
	{
		e.printStackTrace();
	}
	}
	public static void exThrow(int age) throws Exception{
		if (age<0)
		{
			throw new Exception("age不能小于0!!");
		}else{
			System.out.println("age="+age);
		}
	
		
	}
}
