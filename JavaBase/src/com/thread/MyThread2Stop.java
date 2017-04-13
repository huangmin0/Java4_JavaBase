package com.thread;

import java.io.PrintStream;

import lombok.Getter;
import lombok.Setter;

public class MyThread2Stop extends Thread {	//继承Thread的方式
	@Setter
	@Getter
	private boolean flag=true;
	@Override
	 public void run(){
		 while (flag)
		{
			System.out.println("*********");
		}
		
	}
	
	
	

}
