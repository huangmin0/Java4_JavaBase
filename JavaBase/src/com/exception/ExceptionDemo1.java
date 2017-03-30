package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1
{

	public static void main(String[] args)
	{
		int ret=div();
		System.out.println("返回的结果是："+ret);
	}

	public static int div()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("请输入两个数");
		try
		{
		int	a = input.nextInt();
		int	b = input.nextInt();
			System.out.println("两个数相除："+(a/b));
			return 0;
		} catch (InputMismatchException ime){
			System.out.println("我捕捉到了InputMismatchException异常");
			ime.printStackTrace();
			return 1;
		}catch (ArithmeticException ae) {
			System.out.println("我捕捉到了ArithmeticException异常");
			ae.printStackTrace();
			System.exit(1);//退出虚拟机
			return 2;
		}catch (Exception e) {
			System.out.println("我捕捉到了异常");
			System.out.println(e.getClass().getName());
			return 3;
			
	}finally {
		System.out.println("我是finally语句块中的内容");
		return 4;
	}
}
}