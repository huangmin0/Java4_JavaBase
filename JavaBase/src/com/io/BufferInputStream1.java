package com.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.net.SyslogAppender;

public class BufferInputStream1 {

	public static void main(String[] args) throws IOException {
		File file = new File("d://01.wmv");
		File file1 = new File("d://01cop.wmv");
		unfile(file, file1);

	}

	private static void unfile(File file, File file1) throws IOException {
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(file1);
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		byte[] unit = new byte[8192];
		long start = System.currentTimeMillis();
		System.out.println("使用缓冲器现在开始的时间" + start + "ms");
		while (bis.available() > 0) {
			if (bis.available() > 8192) {
				bis.read(unit);
				bos.write(unit);
			} else {
				System.out.println("所剩字节数不足8192，剩余为" + bis.available());
				byte[] remain = new byte[bis.available()];
				bis.read(remain);
				bos.write(remain);

			}
		}
		bis.close();
		bos.close();
		long end = System.currentTimeMillis();
		long current = end - start;
		System.out.println("拷贝所需要时间" + current + "ms");

	}
}