package com.thread;

import org.omg.CORBA.PUBLIC_MEMBER;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account1 {
private String accountNo;
private double balance;
private boolean hasMoney=false;
public Account1() {
	super();
}
public Account1(String accountNo, double balance) {
	super();
	this.accountNo = accountNo;
	this.balance = balance;
}
public synchronized void draw(double drawMoney,int i) throws InterruptedException{
	if(!hasMoney){
	System.out.println(Thread.currentThread().getName()+"账户没有钱需要执行等待"+"--i="+i);
	wait();
	System.out.println(Thread.currentThread().getName()+"执行了等待操作"+"--i="+i);

	}else{
		//取钱
		System.out.println(Thread.currentThread().getName()+"取钱"+drawMoney+"--i="+i);
		setBalance(getBalance()-drawMoney);
		System.out.println(Thread.currentThread().getName()+"取钱完毕"+"--i="+i);
		hasMoney=false;
		notifyAll();
	}
		
	}
public synchronized void deposite(double depositeMoney,int i) throws InterruptedException{
	if(hasMoney){
		System.out.println(Thread.currentThread().getName()+"账户有钱需要等待操作"+"--i="+i);
		wait();
		System.out.println(Thread.currentThread().getName()+"执行等待操作完毕"+"--i="+i);
		
	}else{
		//存钱
		System.out.println(Thread.currentThread().getName()+"存钱"+depositeMoney+"--i="+i);
		setBalance(getBalance()+depositeMoney);
		System.out.println(Thread.currentThread().getName()+"存钱结束"+"--i="+i);
		hasMoney=true;
		notifyAll();//唤醒其他线程
	}
	
	
}
}
