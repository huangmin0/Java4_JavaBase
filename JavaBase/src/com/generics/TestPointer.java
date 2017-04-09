package com.generics;

import java.util.Vector;

public class TestPointer {
	public static void main(String[] args) {
		Vector<Integer> vi=new Vector<Integer>();
		vi.add(300);
		vi.add(500);
		shov(vi);
		Vector<Double> vd=new Vector<Double>();
		vd.add(3.45);
		vd.add(6.75);
		shov(vd);
	}
	public static void shov(Vector<?extends Number> v) {
		System.out.println(v);
	}
}
