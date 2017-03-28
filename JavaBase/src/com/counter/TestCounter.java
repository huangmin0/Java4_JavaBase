package com.counter;

public class TestCounter
{

	public static void main(String[] args)
	{
		Counter con1=new Counter();
		con1.a=10;
		con1.b=7;
		System.out.println(con1.add());
		
		Counter con2=new Counter();
		con2.a=10;
		con2.b=7;
		System.out.println(con2.minus());
		
		Counter con3=new Counter();
		con3.a=10;
		con3.b=7;
		System.out.println(con3.multiple());

		Counter con4=new Counter();
		con4.a=10;
		con4.b=7;
		System.out.println(con4.divide());
	}

}
