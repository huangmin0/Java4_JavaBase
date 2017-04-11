package com.annotation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public  class Student {
	private String name;
	private int age;
	private double weight;
	@Override
	public String toString()
	{
		return "Student [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

}
