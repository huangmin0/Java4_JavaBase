package com.thread;

public class DemoProducersConsumers1 {

	public static void main(String[] args) {
		Account1 account1=new Account1("12345",0);
		double amount;
		String ppp;
		Thread drawMoneyThread1=new DrawMoneyThread1("取钱线程", account1, 700);
		Thread depositeMoneyThread1=new DepositeMoneyThread1("存钱线程", account1,700);
		drawMoneyThread1.start();
		depositeMoneyThread1.start();
	}

}
