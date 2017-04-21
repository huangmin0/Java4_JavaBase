package com.oop;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Multiplication {

	public  void show() throws FileNotFoundException {
		PrintStream a=new PrintStream("D:\\Text.txt");
		
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if (j<=i){
				 a.print(j+"*"+i+"="+i*j+" ");
				}else 
					 a.print(" ");
			}
			a.println();
		}
		
		
		
		
		
	}

}
