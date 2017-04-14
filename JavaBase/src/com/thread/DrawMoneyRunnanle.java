package com.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class DrawMoneyRunnanle implements Runnable
{
	private final Lock lock=new ReentrantLock();
	private Account account;
	private double drawAmount;
	 public DrawMoneyRunnanle(Account account,double drawAmount)
	{
		super();
		this.account=account;
		this.drawAmount=drawAmount;
	}
	

	@Override
/*	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		if(account.getBalance()>=drawAmount){
			System.out.println("取钱成功取钱数为："+drawAmount);
			double balance=account.getBalance()-drawAmount;
			account.setBalance(balance);
			System.out.println("输出余额为："+balance);
			
		}
	}*/
	
/*	public synchronized void run() {
	
	System.out.println(Thread.currentThread().getName());
	if (account.getBalance() >= drawAmount) { // 1
		System.out.println("取钱成功， 取出钱数为：" + drawAmount);
		double balance = account.getBalance() - drawAmount;
		account.setBalance(balance);
		System.out.println("余额为：" + balance);
	}
	
}*/

	public void run()
	{
		lock.lock();
		System.out.println(Thread.currentThread().getName());
		if(account.getBalance()>=drawAmount){
			System.out.println("取钱成功取钱数为："+drawAmount);
			double balance=account.getBalance()-drawAmount;
			account.setBalance(balance);
			System.out.println("输出余额为："+balance);
			
		}
		lock.unlock();
	}
}
