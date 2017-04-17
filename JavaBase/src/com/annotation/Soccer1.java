package com.annotation;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public abstract class Soccer1
{	
	private String name;
	private int age;
	private  double weight;
	@Override
	public String toString() {
		return "Soccer1 [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
		
	

}
