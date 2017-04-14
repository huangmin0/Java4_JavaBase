package com.thread;

import java.io.PrintStream;

public class MainThread
{

	public static void main(String[] args)throws Exception
	{
		PrintStream out =System.out;
		Thread thread=Thread .currentThread();
	/*	System.out.println("thread.getName()"+thread.getName());
		System.out.println("thread.getId()"+thread.getId());
		System.out.println("thread.getPriority()"+thread.getPriority());
		System.out.println("hread.isAlive()"+thread.isAlive());
		System.out.println("thread.isDaemon()"+thread.isDaemon());
		System.out.println("thread.isInterrupted()"+thread.isInterrupted());
		System.out.println("thread.toString()"+thread.toString());
		System.out.println("thread.MAX_PRIORITY"+"---"+thread.MAX_PRIORITY);
		System.out.println("thread.MIN_PRIORITY"+"----"+thread.MIN_PRIORITY);
		System.out.println("thread.NORM_PRIORITY"+"----"+thread.NORM_PRIORITY);
		long start=System.currentTimeMillis();
		System.out.println("输出当前秒数");
		Thread.sleep(5000);
		long end=System.currentTimeMillis();
		System.out.println("用时时间："+(end-start));
		System.out.println("即将调用Thread.yield()");
		Thread.yield();
		System.out.println("调用yield结束");*/
		Thread myRunnable=new Thread(new MyRunnable());
		myRunnable.setName("My Runnable");
		myRunnable.setDaemon(true); //设置为后台运行
		myRunnable.start();
		//Thread.sleep(2000);//休眠两秒
		myRunnable.join();
		System.out.println("修改为后台守护运行"+myRunnable.isDaemon());
	}

}
