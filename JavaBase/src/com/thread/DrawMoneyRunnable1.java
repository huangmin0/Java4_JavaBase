package com.thread;

import java.util.concurrent.locks.ReentrantLock;

import javax.swing.LookAndFeel;

import org.omg.CORBA.PRIVATE_MEMBER;

public class DrawMoneyRunnable1 implements Runnable {
private Account1 account1;
private double drawAmount;
private final ReentrantLock look=new ReentrantLock();
 public DrawMoneyRunnable1( Account1 account1,double drawAmount) {
	super();
	this.account1=account1;
	this.drawAmount=drawAmount;
 }
@Override
public  void run() {
	System.out.println(Thread.currentThread().getName());
	look.lock();
	
	if(account1.getBalance()>drawAmount){
		System.out.println("取钱"+drawAmount);
		double balance=account1.getBalance()-drawAmount;
		account1.setBalance(balance);
		System.out.println("余额："+balance);
	}
	look.unlock();
}

}
