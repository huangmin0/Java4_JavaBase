package com.thread;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account
{
private String accountNo;
private double balance;
//标识账户中是否有存款
private boolean hasMoney=false;
public Account(){
	
}
public Account(String accountNo,double balance){
	this.accountNo=accountNo;
	this.balance=balance;
}
//取钱
public synchronized void draw( double drawAmount,int i){
	if(!hasMoney){
		// 账户中还没人存钱进去，此时当前线程需要等待阻塞
		try
		{
			System.out.println(Thread.currentThread().getName()+"开始要执行wait操作"+"执行了wait操作"+"--i="+i);
			wait();
			System.out.println(Thread.currentThread().getName()+"执行了wait操作"+"执行了wait操作"+"--i="+i);
		
			
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}else{
		//开始取钱
		System.out.println(Thread.currentThread().getName()+"取钱"+drawAmount+"--i"+i);
		setBalance(getBalance()-drawAmount);
		System.out.println("取出钱后余额"+getBalance());
		hasMoney=false;
		//唤醒其他线程
		notifyAll();
		System.out.println("取钱完毕"+Thread.currentThread().getName()+"取钱执行完毕"+"--i"+i);
	}
}
//存钱
public synchronized void deposite(double depositeAmount,int i){
	
	if(hasMoney){
		// 账户中已有人存钱进去，此时当前线程需要等待阻塞
		try
		{
			System.out.println(Thread.currentThread().getName()+"开始要执行wait操作"+"--i="+i);
			wait();
			System.out.println(Thread.currentThread().getName()+"执行了wait操作"+"--i="+i);
			
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		//开始存钱
		}else{	
			System.out.println(Thread.currentThread().getName()+"开始存钱"+depositeAmount+"--i"+i);
			setBalance(balance+depositeAmount);
			System.out.println("存钱后余额为"+depositeAmount);
			hasMoney=true;
			//唤醒其他线程
			notifyAll();
		System.out.println("输出存钱完毕"+"--i"+i);
		}
		}
}

