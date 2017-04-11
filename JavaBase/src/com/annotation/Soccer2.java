package com.annotation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Soccer2 extends Soccer1
{
	private int score=36;
	@Soccer("beijing")
private String address="shanghai";
	@Deprecated
 public void showInfo()

{
	System.out.println("["+score+","+address +"]"+super.toString()+getName()+getAge());
}
@Override
public String toString()
{
	return "Soccer2 [score=" + score + ", address=" + address + "]";
}
 
}
