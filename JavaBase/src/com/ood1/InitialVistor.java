package com.ood1;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class InitialVistor {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	Visitor v=new Visitor();
	System.out.println("请输入姓名");
	v.name=input.next();
	System.out.println("请输入年龄");
	v.age=input.nextInt();
	v.show();
	
	

	}

}
