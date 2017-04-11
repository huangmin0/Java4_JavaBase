package com.annotation;

import java.lang.reflect.Field;

import lombok.Builder.Default;


public class test
{

	public static void main(String[] args)throws Exception
	{
		Class c=new Person().getClass();
		Object o=c.newInstance();
		Field[] fi=c.getDeclaredFields();
		
		for (Field field : fi)
		{
			if (field.isAnnotationPresent(Default.class)) {
				Default default1 = field.getAnnotation(Default.class);
				System.out.println("Default注解的值是：" + default1.toString());
				field.setAccessible(true); // 获取字段的数据类型
				System.out.println(field.getType().getSimpleName().toString());

				switch (field.getType().getSimpleName().toString()) {
				case "int":
					field.set(o, Integer.valueOf(default1.toString()));
					break;
				case "double":
					field.set(o, Double.valueOf(default1.toString()));
					break;
				case "String":
					field.set(o, default1.toString());
					break;
				default:
					break;
		}

}
}
		System.out.println("注解后的值：");
		((Person) o).showInfo();
	}
	}