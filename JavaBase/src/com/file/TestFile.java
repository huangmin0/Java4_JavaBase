package com.file;

import java.io.File;
import java.sql.Date;

public class TestFile
{

	public static void main(String[] args)
	{
		File f1=new File("a.jpg");
		File f2=new File("D:/temp/");
		
		System.out.println("Name:"+f1.getName());
		System.out.println("Path:"+f1.getPath());
		System.out.println("AbsolutePath:"+f1.getAbsolutePath());
		System.out.println("Parent:"+f1.getParent());
		System.out.println("LastModified:"+new Date(f1.lastModified()));
		System.out.println("Length:"+f1.length());
		System.out.println("Exists:"+f1.exists());
		System.out.println("canRead:"+f1.canRead());
		System.out.println("canWright:"+f1.canWrite());
		System.out.println("isFile:"+f1.isFile());
		System.out.println("isHidden:"+f1.isHidden());
		System.out.println("isDirectory:"+f1.isDirectory());
		System.out.println("isAbsolute:"+f1.isAbsolute());
		System.out.println("length:"+f1.length());
		f1.delete();
		
		System.out.println("这是");
		System.out.println("Name:"+f2.getName());
		System.out.println("Path:"+f2.getPath());
		System.out.println("AbsolutePath:"+f2.getAbsolutePath());
		System.out.println("Parent:"+f2.getParent());
		System.out.println("LastModified:"+new Date(f2.lastModified()));
		System.out.println("Length:"+f2.length());
		System.out.println("Exists:"+f2.exists());
		System.out.println("canRead:"+f2.canRead());
		System.out.println("canWright:"+f2.canWrite());
		System.out.println("isFile:"+f2.isFile());
		System.out.println("isHidden:"+f2.isHidden());
		System.out.println("isDirectory:"+f2.isDirectory());
		System.out.println("isAbsolute:"+f2.isAbsolute());
		System.out.println("length:"+f2.length());
		f2.delete();
		
		
		

	}

}
