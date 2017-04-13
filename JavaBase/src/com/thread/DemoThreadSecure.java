package com.thread;

public class DemoThreadSecure
{

	public static void main(String[] args)
	{
		Account account=new Account("12345",2000);
		DrawMoneyRunnanle drawMoneyRunnanle=new DrawMoneyRunnanle(account, 700);
		Thread myThread1=new Thread(drawMoneyRunnanle);
		Thread myThread2=new Thread(drawMoneyRunnanle);
		Thread myThread3=new Thread(drawMoneyRunnanle);
		Thread myThread4=new Thread(drawMoneyRunnanle);
		Thread myThread5=new Thread(drawMoneyRunnanle);
		myThread1.start();
		myThread2.start();
		myThread3.start();
		myThread4.start();
		myThread5.start();
		
		

	}

}
