package com.ood1;

import java.util.jar.Attributes.Name;

public abstract class Pet
{
	String name;
	int age=50;
	 int love=100;

	public Pet(String name)
	{
		super();
		this.name = name;
	}

	public Pet(String name, int age, int love)
	{
		super();
		this.name = name;
		this.age = age;
		this.love = love;
	}

	public final void print()
	{
		System.out.println("name: " + name + ",age: " + age + ",love: " + love);
	}
	
	public abstract void print2();
	
	


}
