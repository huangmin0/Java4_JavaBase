package com.hm.javacore.datatype;

import java.util.Scanner;

public class Branch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入奥巴马的成绩");
		int s = in.nextInt();
		if (s == 100) {
			System.out.println("爸爸给你买辆车");
		} else if (s >= 90) {
			System.out.println("母亲给你买个笔记本电脑");
		} else if (s >= 60) {
			System.out.println("母亲给你买部手机");
		} else if (s < 60) {
			if (s < 30) {
				System.out.println("賞賜三十大板");
			} else {
				System.out.println("沒有禮物");
				
			}
		}
	}
}




