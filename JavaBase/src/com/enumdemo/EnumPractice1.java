package com.enumdemo;

import java.security.KeyStore.Entry;
import java.util.EnumMap;
import java.util.EnumSet;

public class EnumPractice1 {

	public static void main(String[] args) {
	EnumMap<EnumPractice, String > em=new EnumMap<>(EnumPractice.class);
	em.put(EnumPractice.Monday, "一");
	em.put(EnumPractice.Thursday, "二");
	em.put(EnumPractice.Wednesday, "三");
	em.put(EnumPractice.Tuesday, "四");
	em.put(EnumPractice.Friday, "五");
	em.put(EnumPractice.Saturday, "六");
	em.put(EnumPractice.Sunday, "日");
		for (java.util.Map.Entry<EnumPractice, String> entry :em.entrySet()) {
		System.out.println(entry.getKey().getIndex()+"---"+entry.getKey().getDesc()+entry.getValue());
	}
	}
	}
