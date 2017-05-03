package com.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import javax.swing.UIManager;

public class StringDemo2 {

	public static void main(String[] args) throws Exception {
		Class c=Class.forName("java.lang.String");
		Object o=c.newInstance();
		Field[] fields=c.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getType().getSimpleName());
		}
		

	}

}
