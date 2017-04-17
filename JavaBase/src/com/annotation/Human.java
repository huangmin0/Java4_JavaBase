package com.annotation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Human {
private String name;
private int age;
@Override
public String toString() {
	return "Human [name=" + name + ", age=" + age + "]";
}

}
