package com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestPrint {

	public static void main(String[] args) {
		try {
			FileReader input =new FileReader("myInfo.txt");
			BufferedReader br=new BufferedReader(input);
			FileWriter output=new FileWriter("myInfoBack.txt");
			PrintWriter pw=new PrintWriter(output);
			String s=br.readLine();
			while (s!=null) {
				pw.println(s);
				s=br.readLine();
			}
			br.close();
			pw.close();
			System.out.println("copy success");
		} catch (IOException e) {
			e.printStackTrace();
	
		}
	}

}
