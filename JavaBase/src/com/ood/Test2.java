package com.ood;

public class Test2 {

	public static void main(String[] args) {
		Thread thread=new Thread(new Test1());
		thread.start();
	}

}
