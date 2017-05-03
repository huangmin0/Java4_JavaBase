package com.thread;

import java.util.concurrent.CountDownLatch;

import javax.print.attribute.standard.PagesPerMinute;

import org.omg.CORBA.PUBLIC_MEMBER;

public class WriteArticleRunnable implements Runnable
{
	private  Pen pen;
	private Paper paper ;
	private boolean isRunning=true;
	private int count=20;//循环次数
	public  WriteArticleRunnable(Paper paper, Pen pen)
	{
		super();
		this.pen=pen;
		this.paper=paper;
	}

	@Override
	public void run()
	{
	while (isRunning)
	{
		if(!paper.isIsprivate()){
			paper.setIsprivate(true);
			paper.setOwner(Thread.currentThread().getName());
		}//判断pen是否可以取到
		if (!pen.isIsprivate())
		{
			pen.setIsprivate(true);
			pen.setOwner(Thread.currentThread().getName());
		}
	Boolean getPaper=paper.getOwner().equals(Thread.currentThread().getName());
	Boolean getPen=pen.getOwner().equals(Thread.currentThread().getName());
	if (getPaper&&getPen){
		System.out.println(Thread.currentThread().getName()+"得到了纸和笔，我可以正常写作");
		System.out.println("系统正常退出");
		paper.setIsprivate(false);
		pen.setIsprivate(false);
		this.isRunning=false;
	}else if(getPaper&&!getPen){
		System.out.println(Thread.currentThread().getName()+"得到了纸我缺少笔，不可以正常写作");
		System.out.println(Thread.currentThread().getName()+"我要等待钢笔资源");
		--count;
		
		if(count<0){
			System.out.println("i=="+count);
			System.out.println("我检测为死锁，我让一下");
			System.out.println("我释放资源，你们写");
			paper.setIsprivate(false);
			Thread.currentThread().setPriority(Thread.MIN_PRIORITY);//降低线程的优先级
			try {
				Thread.sleep(1000);	//休眠中
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}else if(!getPaper&&getPen){
		System.out.println(Thread.currentThread().getName()+"我得到了笔缺少纸资源，不可以正常写作");
		System.out.println(Thread.currentThread().getName()+"我要等待纸资源");

		if(count<0){
			System.out.println("i=="+count);
			System.out.println("我检测为死锁，我让一下");
			System.out.println("我释放资源，你们写");
			pen.setIsprivate(false);
			
			
		}
	}else{
		System.out.println("我什么都没有得到，我好悲剧"+Thread.currentThread().getName());
		System.out.println("我要继续等待资源"+Thread.currentThread().getName());
		
	}
	}
	}
	public void stop(){
		this.isRunning=false;
	}

}
