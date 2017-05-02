package com.thread;

public class DepositeMoneyThread1 extends Thread {
private Account1 account1;
private double amount;
public DepositeMoneyThread1() {
	super();
}
public DepositeMoneyThread1(String name, Account1 account1, double amount) {
	super();
	this.account1 = account1;
	this.amount = amount;
}
public void run(){
	for(int i=0;i<=10;i++){
		try {
			account1.deposite(amount, i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("此次存钱结束");
	}
}
}
