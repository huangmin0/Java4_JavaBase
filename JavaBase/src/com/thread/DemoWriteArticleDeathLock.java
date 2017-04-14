package com.thread;

public class DemoWriteArticleDeathLock
{

	public static void main(String[] args)
	{
		Paper paper=new Paper();
		Pen pen=new Pen();
		WriteArticleRunable wr=new WriteArticleRunable(paper, pen);
		WriteArticleRunable wr1=new WriteArticleRunable(paper, pen);
		Thread zhangsan =new Thread(wr, "zhangsan");
		Thread wanglaowu=new Thread(wr1,"wanglaowu");
		zhangsan.start();
		wanglaowu.start();

	}

}
