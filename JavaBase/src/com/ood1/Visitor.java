package com.ood1;

public class Visitor {
String name ;
int age;

public void show(){
	if(age>=18&&age<=60){
		System.out.println("name ："+name +",age："+age+",票价为20元");
	}else{
		System.out.println("name："+name+",age："+age+",免费");
	}
}
}
