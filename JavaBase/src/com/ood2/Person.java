package com.ood2;
public class Person {
private String name ="huxiaodong";
private int age =23;
private char sex='F';


public Person() {
	super();
}

public Person(String name, int age, char sex) {
	super();
	this.name = name;
	this.age = age;
	this.sex = sex;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public char getSex() {
	return sex;
}
public void setSex(char sex) {
	this.sex = sex;
}

@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
}

	
}