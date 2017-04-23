package com.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.BitSet;

public class BufferInputStream2
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		PrintStream out=System.out;
		File n1=new File("D:\\03Pot.wmv");
		File n2=new File("D:\\03PotBK.wmv");
		unUseBefferCopyFile(out, n1, n2);
	}
		private static void unUseBefferCopyFile(PrintStream out, File n1, File n2)throws IOException,InterruptedException {
			FileInputStream fis=new FileInputStream(n1);
			FileOutputStream fos=new FileOutputStream(n2);
			BufferedInputStream bis=new BufferedInputStream(fis);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			byte[] unit=new byte[8192];
			long start=System.currentTimeMillis();
			System.out.println("使用缓冲器，现在开始时间："+start+"ms");
			while (bis.available()>0) {
				if(bis.available()>=8192){
					bis.read(unit);
					bos.write(unit);
				
			}else{
				System.out.println("剩余的字节数不足8192，剩余为"+bis.available());
				byte[] remain=new byte[bis.available()];
				bis.read(remain);
				bos.write(remain);
			}
	}
			bis.close();
			bos.flush();
			bos.close();
			long end=System.currentTimeMillis();
			System.out.println("现在结束的时间："+end+"ms");
			long usetime=end-start;
			System.out.println("copy总共使用的时间"+usetime+"ms");
	}
}