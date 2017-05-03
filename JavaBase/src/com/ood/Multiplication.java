package com.ood;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Multiplication {

	public  void show() throws FileNotFoundException {

		PrintStream ps = new PrintStream("D://text1.txt");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j <= i) {
					ps.print(j + "*" + i + "=" + i * j + " ");
				} else
					ps.print(" ");
			}
			ps.println();
		}
	}

}
