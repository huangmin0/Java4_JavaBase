package com.annotation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Soccer2 extends Soccer1 {
	@Soccer("hxd")
	private String name = "xhd";
	@Soccer("33")
	private int age = 23;
	@Soccer("67.08")
	private double weight = 70.55;

	@Deprecated
	public void showInfo()

	{
		System.out.println("[" + name + "," + age +","+ weight + "]");
	}

	@Override
	public String toString() {
		return "Soccer2 [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

}
