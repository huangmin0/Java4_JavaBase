package com.thread;

import java.io.PrintStream;

public class MainThread
{

	public static void main(String[] args)
	{
		PrintStream out =System.out;
		Thread thread=Thread .currentThread();
		System.out.println("thread.getName()"+thread.getName());
		System.out.println("thread.getId()"+thread.getId());
		System.out.println("thread.getPriority()"+thread.getPriority());
		System.out.println("hread.isAlive()"+thread.isAlive());
		System.out.println("thread.isDaemon()"+thread.isDaemon());
		System.out.println("thread.isInterrupted()"+thread.isInterrupted());
		System.out.println("thread.toString()"+thread.toString());
		
		
		
		
	}

}
