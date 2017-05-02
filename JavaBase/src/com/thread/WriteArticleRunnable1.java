package com.thread;

public class WriteArticleRunnable1 implements Runnable {
	private Pen1 pen1;
	private Paper1 paper1;
	private boolean isRunning = true;
	private int count = 20;// 循环次数

	public WriteArticleRunnable1(Pen1 pen1, Paper1 paper1) {
		super();
		this.pen1 = pen1;
		this.paper1 = paper1;
	}

	@Override
	public void run() {
		while (isRunning) {
			if (!paper1.isIsprivate()) {
				paper1.setIsprivate(true);
				paper1.setOwner(Thread.currentThread().getName());
			} // 判断pen是否可以取到
			if (!pen1.isIsprivate()) {
				pen1.setIsprivate(true);
				pen1.setOwner(Thread.currentThread().getName());
			}
			Boolean getpaper1 = paper1.getOwner().equals(Thread.currentThread().getName());
			Boolean getpen1 = pen1.getOwner().equals(Thread.currentThread().getName());
			if (getpaper1 && getpen1) {
				System.out.println(Thread.currentThread().getName() + "同时得到纸和笔，我可以正常写作");
				System.out.println("系统正常退出");
				paper1.setIsprivate(false);
				pen1.setIsprivate(false);
				isRunning = false;
			} else if (getpaper1 && !getpen1) {
				System.out.println(Thread.currentThread().getName() + "得到了纸却没有得到笔，无法正常写作");
				System.out.println(Thread.currentThread().getName() + "我在等待钢笔资源");
				--count;
				if (count < 0) {
					System.out.println("i==" + count);
					System.out.println("我检测到死锁，我让一下");
					System.out.println("我释放资源你们写");
					paper1.setIsprivate(false);
					Thread.currentThread().setPriority(Thread.MIN_PRIORITY);// 降低线程优先级

				}

			} else if (!getpaper1 && getpen1) {
				System.out.println(Thread.currentThread().getName() + "我得到了笔却没有得到纸，无法正常写作");
				System.out.println(Thread.currentThread().getName() + "我要等待纸资源");

				if (count < 0) {
					System.out.println("我检测到死锁，我让一下");
					System.out.println("我释放资源你们写");
					pen1.setIsprivate(false);
					Thread.currentThread().setPriority(Thread.MIN_PRIORITY);// 降低线程等级
				}

			} else {
				System.out.println(Thread.currentThread().getName() + "我什么都没有得到，我很凄惨");
				System.out.println(Thread.currentThread().getName() + "我要继续等待纸和笔资源");
			}
		}

	}

	public void stop() {
		this.isRunning = false;
	}

}
