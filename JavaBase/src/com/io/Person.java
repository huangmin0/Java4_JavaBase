package com.io;

import java.io.Serializable;

public class  Person implements Serializable
{
	/*序列化版本号*/
	private static final long serialVersionUID=1L;
	private transient  int  password;
	private String name;
	private String  passwordId;
	public Person()
	{
		super();
	}
	public Person(int password,String name, String passwordId)
	{
		super();
		this.name = name;
		this.password = password;
		this.passwordId = passwordId;
	}
	@Override
	public String toString()
	{
		return "Person [name=" + name + ", password=" + password + ", passwordId=" + passwordId + "]";
	}
	
	
	
}
