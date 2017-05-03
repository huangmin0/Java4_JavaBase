package com.ood2;

import java.util.jar.Attributes.Name;

public class Dog1 extends Pet1 {
public Dog1(){
	
}
public Dog1(String name){
	this.name=name;
	
}
public Dog1(String name,int age,int love){
	super();
	this.name=name;
	this.age=age;
	this.love=love;
}
public void eat(){
	System.out.println("Dog eat");
}
//狗狗玩飞碟的方法
public void catchFlyDisc(){
	System.out.println("和狗狗玩飞碟的方法");
}
}
