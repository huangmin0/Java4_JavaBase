package com.thread;

public class DemoWriteArticleDeathLock1 {

	public static void main(String[] args) {
		Pen1 p=new Pen1();
		Paper1 pa=new Paper1();
		WriteArticleRunnable1 wr=new WriteArticleRunnable1(p, pa);
		WriteArticleRunnable1 wr1=new WriteArticleRunnable1(p, pa);
		Thread thread=new Thread(wr,"zhangsan");
		Thread thread1=new Thread(wr1,"wanglaowu");
		thread.start();
		thread1.start();

	}

}
