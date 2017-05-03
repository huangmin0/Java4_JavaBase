package com.thread;

public class DemoWriteArticleDeathLock
{

	public static void main(String[] args)
	{
		Paper paper=new Paper();
		Pen pen=new Pen();
		WriteArticleRunnable wr=new WriteArticleRunnable(paper, pen);
		WriteArticleRunnable wr1=new WriteArticleRunnable(paper, pen);
		Thread zhangsan =new Thread(wr, "zhangsan");
		Thread wanglaowu=new Thread(wr1,"wanglaowu");
		zhangsan.start();
		wanglaowu.start();

	}

}
