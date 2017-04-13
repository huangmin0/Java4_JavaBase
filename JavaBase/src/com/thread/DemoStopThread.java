package com.thread;

import java.util.FormatFlagsConversionMismatchException;

public class DemoStopThread
{

	public static void main(String[] args)throws Exception
	{
		MyThread2Stop thread=new MyThread2Stop();
		System.out.println("输出启动线程");
		
		thread.start();
		
		System.out.println("sleep两秒");
		thread.sleep(2000);
		thread.setFlag(false);
		System.out.println("子程序已经停止");
		
	}

}
