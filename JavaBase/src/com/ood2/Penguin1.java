package com.ood2;

public class Penguin1 extends Pet1 {
public Penguin1(){
	
}
public Penguin1(String name){
	super();
	this.name=name;
}
public Penguin1(String name, int age,int love){
	super();
	this.name=name;
	this.age=age;
	this.love=love;
	
}
public void eat(){
	System.out.println("Penguin eat");
}
public void swimming(){
	System.out.println("和企鹅游泳的方法");
}

}
