package com.oop4;

public abstract class Pet{
	String name;
	int age=50;
	int love=100;
	
	public Pet(){
		super();
	}
	public Pet(String name,int age,int love){
		super();
		this.name=name;
		this.age=age;
		this.love=love;	
	}
	public Pet(String name){
		super();
		this.name=name;
		
	}
	public  void print(){
		System.out.println("name:"+name+",age:"+age+",love"+love);
	}
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		

	}

}
