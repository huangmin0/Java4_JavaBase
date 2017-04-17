package com.thread;

public class DemoThreadSecure1 {

	public static void main(String[] args) {
		Account1 account1=new Account1("12345",2000);
		DrawMoneyRunnable1 drawMoneyRunnable1=new DrawMoneyRunnable1(account1, 700);
		Thread myThread1=new Thread(drawMoneyRunnable1);
		Thread myThread2=new Thread(drawMoneyRunnable1);
		Thread myThread3=new Thread(drawMoneyRunnable1);
		Thread myThread4=new Thread(drawMoneyRunnable1);
		Thread myThread5=new Thread(drawMoneyRunnable1);
		myThread1.start();
		myThread2.start();
		myThread3.start();
		myThread4.start();
		myThread5.start();
		
		
	}

}
