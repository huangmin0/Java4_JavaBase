package com.hm.javacore.datatype;

public class Person {
private String name="Huxiaodong";
private int age=25;
private boolean married=true;

public Person(){}
public Person(String str,int i,boolean flag){
	name=str;
	age=i;
	married=flag;
}
public void display(){
	System.out.println(name+" "+age+" "+married);
}
	public static void main(String[] args) {
		Person person=new Person("Rose",26,false);
	    person.display();
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
