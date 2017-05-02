package com.thread;

public class DemoProducersConsumers1 {

	public static void main(String[] args) {
		Account1 account1=new Account1("12345",0);
	Thread drawMoney=new DrawMoneyThread1("取钱线程",account1, 700);
	Thread depositeMoney=new DepositeMoneyThread1("存钱线程", account1,700);
	drawMoney.start();
	depositeMoney.start();
	}

}
