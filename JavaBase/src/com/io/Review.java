package com.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.function.LongToDoubleFunction;

import javax.sound.midi.MidiDevice.Info;
import javax.swing.plaf.basic.BasicCheckBoxMenuItemUI;
import javax.swing.plaf.synth.SynthStyle;

public class Review
{

	public static void main(String[] args) throws IOException
	{
	File file =new File("F://java四期视频//oop.wmv");
	File file2=new File("F://java四期视频//oop11.wmv");
	filefile2(file,file2);
	
		
	}

	private static void filefile2(File file, File file2) throws IOException
	{
		FileInputStream fis=new FileInputStream(file);
		FileOutputStream fps=new FileOutputStream(file2);
		BufferedInputStream bis=new BufferedInputStream(fis);
		BufferedOutputStream bos=new BufferedOutputStream(fps);
		
		byte[] unit=new byte[2048];
		long start=System.currentTimeMillis();
		System.out.println("使用缓冲器现在开始的时间"+start);
	while (bis.available()>0)
	{
		if(bis.available()>2048){
			bis.read(unit);
			bos.write(unit);
		}else{
			System.out.println("输出字节不足2048，剩余字节为"+bis.available());
			byte[] remain=new byte[bis.available()];
			bis.read(remain);
			bos.write(remain);
			
		}
	}
	bis.close();
	bos.close();
	long end=System.currentTimeMillis();
	long current=end-start;
	System.out.println("拷贝用时时间为"+current);
		}
}
