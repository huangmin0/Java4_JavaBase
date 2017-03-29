package com.counter;
import java.util.Scanner;
public class Counter
{
	public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    System.out.println("请输入一个方法+-*/%?");
    String a=in.nextLine();
    int b=in.nextInt();
    int c=in.nextInt();
    System.out.println("请输入一个数");
    if(a.equals("+")){
    	System.out.println(b+"+"+c+"="+(b+c));
    }else if(a.equals("-")){
    	System.out.println(b+"-"+c+"="+(b-c));
    }else if(a.equals("*")){
    	System.out.println(b+"*"+c+"="+(b*c));
    }else if(a.equals("/")){
    	System.out.println(b+"/"+c+"="+(b/c));
    }else{
    	System.out.println(b+">"+c+"?"+b+":"+c+"="+(b/c));
    }
}
}