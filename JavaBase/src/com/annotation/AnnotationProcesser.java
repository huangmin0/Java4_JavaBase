package com.annotation;

import java.lang.reflect.Field;

public class AnnotationProcesser {

	public static void main(String[] args) throws Exception{
		Class c=new Person1().getClass();
		Object o=c.newInstance();
System.out.println("输出person1默认值");
((Person1) o).showInfo();
//获得所有字段
Field[] fields=c.getDeclaredFields();//不能获取到继承的属性

for (Field field : fields) {
	//判断该属性上有没有HelloWorld注解
	if(field.isAnnotationPresent(HelloWorld.class)){
		//获取指定注解
		HelloWorld annotation=field.getAnnotation(HelloWorld.class);
		System.out.println("HelloWorld注解的值是"+annotation.value());
		//打破封装
		field.setAccessible(true);
		field.set(o, annotation.value());
	}
}

System.out.println("注解后的值");
((Person1) o).showInfo();
	}

}
