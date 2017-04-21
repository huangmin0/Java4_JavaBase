package com.oop;



/*打印乘法口诀表到文件中。
要求：
A.创建一个普通类，类里有一个普通的方法，打印乘法口诀表的方法；
B.在另一个测试类中，创建一个实现Runnable接口的线程；
C.在run()方法中，使用反射唤醒打印乘法口诀表的方法；
D.启动线程，打印乘法口诀表到文件中！
*/
public class Test
{
	public static void main(String[] args){
		Thread th=new Thread(new Test1());
		th.start();

	}
}