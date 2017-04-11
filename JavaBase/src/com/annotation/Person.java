package com.annotation;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Person extends Student
{   @Practice("dbd")
private String name="dbd1";
@Practice("25")
private int age=277; 
@Practice("65.55")
private double weight=44.66;

@Deprecated
	public void showInfo()
	{
		System.out.println("Person[name="+name+"age="+age+"weight="+weight+"]");
	}


	@Override
	public String toString()
	{
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}


	


}
