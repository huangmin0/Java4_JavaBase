package com.ood3;

public class TestAbstractImpl
{

	public static void main(String[] args){
		IAAA aaa =new Zhangsan();
		aaa.play();
		Zhangsan zhangsan=(Zhangsan) aaa;
		zhangsan.sing();
	}

}
