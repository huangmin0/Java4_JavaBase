package com.serialize;

import java.util.Scanner;

public class TestsScannerString {

	public static void main(String[] args) {
		Scanner in =new Scanner("aaa:bbb:ccc");
		in.useDelimiter(":");
		String info =null;
		while (in.hasNext()) {
			info = in.next();
			System.out.println(info);
		}
		in.close();

	}

}
