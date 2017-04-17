package com.thread;

public class DepositeMoneyThread1 extends Thread{
private Account1 account1;
private double amount;
public DepositeMoneyThread1(String ppp,Account1 account1,double amount){
	super(ppp);
	this.account1=account1;
	this.amount=amount;
}
public void run(){
	for(int i=0;i<=10;i++){
		account1.deposite(amount, i);
	}
	System.out.println("取钱结束");
}
}
