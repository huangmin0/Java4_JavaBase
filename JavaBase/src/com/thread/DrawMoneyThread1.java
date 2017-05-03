package com.thread;

public class DrawMoneyThread1 extends Thread {
private Account1 account1;
private double amount;
public DrawMoneyThread1() {
	super();
}
public DrawMoneyThread1(String name,Account1 account1, double amount) {
	super();
	this.account1 = account1;
	this.amount = amount;
}
public void run(){
	for(int i=0;i<=10;i++){
		
			try {
				account1.draw(amount, i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			

		System.out.println("此次取钱结束");
	}
}
}
