package com.io;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileByteStream2
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
			FileInputStream fis=new FileInputStream("sun.txt");
			FileOutputStream fos=new FileOutputStream("sunBack.txt");
			int read=fis.read();
			while(read!=-1){
				fos.write(read);
				read=fis.read();
			}
			fis.close();
			fos.close();
			System.out.println("Copy Success");
		

	}

}
