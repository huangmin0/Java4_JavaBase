package com.annotation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Person1 extends Human {
@Default("23.4")
private double score=44.4;
	@HelloWorld("beijing")
private String address="hefei";

@Deprecated
public void showInfo() {
	System.out.println("Person1 [score=" + score + ",address=" + address + ", toString()=" + super.toString()
			+ ", getName()=" + getName() + ", getAge()=" + getAge() + "]");
}

@Override
public String toString() {
	return "Person1 [score=" + score + ", address=" + address + "]";
}

}
