package com.io;

import java.awt.Frame;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileCharacterStream1 {

	public static void main(String[] args) throws IOException {
		File file = new File("myinfo.txt");
		file.createNewFile();
		FileReader fr = new FileReader("myinfo.txt");
		FileWriter fw = new FileWriter("myinfom.txt");
		int read = fr.read();
		while (read != -1) {
			fw.write(read);
			read = fr.read();
		}
		fr.close();
		fw.close();
		System.out.println("拷贝成功");
	}

}
