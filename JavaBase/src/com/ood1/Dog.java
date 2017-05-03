package com.ood1;

public class Dog extends Pet{

	public Dog(String name, int age, int love)
	{
		super(name, age, love);
		
	}

	public Dog(String name)
	{
		super(name);
		
	}

	@Override
	public void print2()
	{
		name="宠物";
		age=100; 
		System.out.println("print2 name: " + name + ",age: " + age + ",love: " + love);

	}
	
	
}


