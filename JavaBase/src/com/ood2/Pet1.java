package com.ood2;

public class Pet1 {
String name;
int age=50;
int love=100;
public Pet1() {
	super();
}
public Pet1(String name, int age, int love) {
	super();
	this.name = name;
	this.age = age;
	this.love = love;
}
public Pet1(String name) {
	super();
	this.name = name;
}
public final void print(){
	System.out.println("name:"+name+"age:"+age+"love:"+love);
}
public  void eat(){
	System.out.println("Pet eat mrthod");
}
}
