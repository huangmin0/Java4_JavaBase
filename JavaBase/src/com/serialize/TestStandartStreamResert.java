package com.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestStandartStreamResert {

	public static void main(String[] args)throws FileNotFoundException {
	System.setIn(new FileInputStream("C:/myInfo.info"));
	System.setOut(new PrintStream("C:/myBack.info"));
	Scanner in=new Scanner(System.in);
	String message=null;
	do {
		message=in.next();
		System.out.println(message);
	} while (in.hasNextLine());
	in.close();
	System.out.println("拷贝成功");
	}

}
