package com.ood1;

public class Student {
String name;
int age;
String classNo;
String hobby;
public Student(){
	
}
public  Student(String name ){
	System.out.println("Student构造函数开始执行");
	this.name=name;
	System.out.println("Student构造函数执行结束");
	
}
public void show(){
	System.out.println("name:"+name+",age:"+age+",classNo:"+classNo+",hobby:"+hobby);
}
}
