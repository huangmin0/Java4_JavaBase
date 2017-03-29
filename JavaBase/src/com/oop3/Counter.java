package com.oop3;
import java.util.Scanner;
public class Counter {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入运算符+-*/%？：");
	    String a=in.nextLine();
	    System.out.println("请输入两个相运算的数");
	    int b=in.nextInt();
	    int c=in.nextInt();
	    
	if (a.equals("+")){
		System.out.println(b+"+"+c+"="+(b+c));
	}else if(a.equals("-")){
		System.out.println(b+"-"+c+"="+(b-c));
	}else if(a.equals("*")){
		System.out.println(b+"*"+c+"="+(b*c));	
	}else if(a.equals("/")){
		System.out.println(b+"/"+c+"="+(b/c));	
	}else{
		System.out.println(b+">"+c+"?"+b+":"+c+"="+(b>c?b:c));	
		
		
	}
	}

}
