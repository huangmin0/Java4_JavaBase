package com.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectReaderDemo
{

	public static void main(String[] args)throws Exception
	{
		
		FileInputStream fis=new FileInputStream("Person.objects");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Person person1=(Person) ois.readObject();
		Person person2=(Person) ois.readObject();
		Person person3=(Person) ois.readObject();
		Person person4=(Person) ois.readObject();
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person4);

	}

}
