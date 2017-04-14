package com.thread;

public class DepositeMoneyThread extends Thread
{
private Account account;
private double amount;
public DepositeMoneyThread(String threadName,Account account,double amount){
	super(threadName);
	this.account=account;
	this.amount=amount;
	
	
}
public void run(){
	for(int i=0;i<=10;i++){
		account.deposite(amount, i);
		
	}
	System.out.println("输出存钱已结束");
}


}