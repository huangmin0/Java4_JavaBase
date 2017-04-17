package com.thread;

import java.util.function.DoubleUnaryOperator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account1 {
private String accountNo;
private double balance;
//标识是否有钱
private boolean hasMoney=false;
public Account1(){
	
}
public Account1(String accountNo,double balance){
	this.accountNo=accountNo;
	this.balance=balance;
}
public synchronized void draw(double drawMoney,int i){
	if(!hasMoney){
		try {
			System.out.println(Thread.currentThread().getName()+"开始执行wait操作"+"--i="+i);
			wait();
			System.out.println(Thread.currentThread().getName()+"执行了wait操作"+"--i="+i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//取钱
	}else{
		System.out.println(Thread.currentThread().getName()+"开始取钱"+drawMoney+"--i="+i);
		hasMoney=false;
		//唤醒其他线程
		notifyAll();
		System.out.println(Thread.currentThread().getName()+"取钱操作结束"+"--i="+i);
	}
}
public synchronized void deposite(double depositeMoney,int i){
	if(hasMoney){
		try {
			System.out.println(Thread.currentThread().getName()+"开始执行wait操作"+"--i="+i);
			wait();
			System.out.println(Thread.currentThread().getName()+"执行了wait操作"+"--i="+i);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//开始存钱
	}else{
	System.out.println(Thread.currentThread().getName()+"开始存钱"+depositeMoney+"--i="+i);
	hasMoney=true;
	//唤醒其他线程
	notifyAll();
	System.out.println(Thread.currentThread().getName()+"存钱结束"+"--i="+i);
	}
}
}
