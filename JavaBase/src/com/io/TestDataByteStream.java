package com.io;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.naming.spi.DirObjectFactory;

public class TestDataByteStream {

	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream("myfile.data");
			DataOutputStream dos=new DataOutputStream(fos);
			dos.writeUTF("罗斯福");
			dos.writeInt(40);
			dos.close();
			
			FileInputStream fis=new FileInputStream("myfile.data");
			DataInputStream dis=new DataInputStream(fis);
			System.out.println("name:"+dis.readUTF());
			System.out.println("age:"+dis.readInt());
			fis.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
