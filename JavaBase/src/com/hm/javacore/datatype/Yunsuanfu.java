package com.hm.javacore.datatype;

public class Yunsuanfu {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 25;
		int d = 25;
		System.out.println("a + b = "+(a+b));
		System.out.println("a - b = "+(a-b));
		System.out.println("a * b = "+(a*b));
		System.out.println("b / a = "+(b/a));
		System.out.println("b % a = "+(b%a));
		System.out.println("c % a = "+(c%a));
		System.out.println("a + + = "+(a++));
		System.out.println("a - - = "+(a--));
		System.out.println("d + + = "+(d++));
		System.out.println("+ + d = "+(++d));

		
		int g = 4;
		int h = 5;
		int result = g>h ? g :h;
		System.out.println("result:" + result);	
		
		
		boolean j=true;
		boolean k=false;
		System.out.println("(j&&k):"+(j&&k));		
		System.out.println("(j||k):"+(j||k));
		System.out.println("!j:"+!j);
		
		
		int l=17;
		int m1=7;
		System.out.println("l+=m1:"+(l+=m1));
		System.out.println("l-=m1:"+(l-=m1));
		System.out.println("l*=m1:"+(l*=m1));
		System.out.println("l/=m1:"+(l/=m1));
		System.out.println("l%=m1:"+(l%=m1));
		
		
		
		
		
		
		
		String address1 = "Anhui";
		String address2 = "Hefei";
		int code = 5;
		String ret = address1 +" "+ address2 +" "+ code+" 号";
		System.out.println("ret:"+ret);
		
		int num = 10000;
		short shot;
		shot= (short) num;
		System.out.println("shot=" +shot);
		
		System.out.println();
		System.out.println("char demo:");
		char m, n='c';
		m='a';
		System.out.println("m+n="+(m+n)+";");
		System.out.println("m="+m+";");
		System.out.println("n="+n+";");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
