package com.io;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ObjectWriteDemo
{

	public static void main(String[] args)throws Exception
	{
		FileOutputStream fos=new FileOutputStream("Person.objects");
		ObjectOutputStream  oos=new ObjectOutputStream(fos);
		
		oos.writeObject(new Person(1,"zhangsan","12345"));
		oos.writeObject(new Person(2,"lisi","166345"));
		oos.writeObject(new Person(3,"wangwu","565778"));
		oos.writeObject(new Person(4,"wuer","12345"));
		
		fos.close();
		oos.close();
		System.out.println("写入成功");
	}

}
