
package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo
{

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("请输入两个数");
		try
		{
		int	a = input.nextInt();
		int	b = input.nextInt();
			System.out.println("两个数相除："+(a/b));
		} catch (InputMismatchException ime){
			System.out.println("我捕捉到了InputMismatchException异常");
			ime.printStackTrace();
		}catch (ArithmeticException ae) {
			System.out.println("我捕捉到了ArithmeticException异常");
			ae.printStackTrace();
		}catch (Exception e) {
			System.out.println("我捕捉到了异常");
			System.out.println(e.getClass().getName());
	}
		System.out.println("程序执行到此处结束!");
	}
}
