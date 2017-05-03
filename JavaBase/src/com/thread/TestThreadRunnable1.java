package com.thread;

public class TestThreadRunnable1 {

	public static void main(String[] args) {
	Thread myThread=new MyThread1();
	Thread myRunnable=new Thread(new MyRunnable1());
	myThread.start();
	myRunnable.start();

	}

}
