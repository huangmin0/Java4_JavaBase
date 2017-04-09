package com.serialize;

import java.util.Scanner;

public class TestStandardStream {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String message=null;
		do {
			System.out.println("请输入提示信息");
			message=in.next();
		if(!message.equals("quit")){
			System.out.println(message);
		}
		} while (!message.equals("quit"));
		in.close();

	}

}
