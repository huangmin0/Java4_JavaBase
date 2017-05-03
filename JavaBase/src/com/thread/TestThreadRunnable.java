package com.thread;


import java.util.concurrent.ExecutionException;

import com.thread.MyRunnable;
import com.thread.MyThread;

public class TestThreadRunnable
{

	public static void main(String[] args)
	{
		//继承MyThread方式
		Thread mythread=new MyThread();
		mythread.setName("MyThread");
		mythread.start();//启动线程
		//继承MyRunnable方式
		Thread myRunable = new Thread(new MyRunnable());
		myRunable.setName("MyRunnable");
		myRunable.start();

	}

}
