package com.annotation;

import java.lang.reflect.Field;

public class Soccer3 {

	public static void main(String[] args) throws Exception{
		Class c=new Soccer2().getClass();
		Object o=c.newInstance();
		System.out.println("默认值");
		((Soccer2)o).showInfo();
		Field[] fields=c.getDeclaredFields();
		for (Field field : fields) {
			if(field.isAnnotationPresent(Soccer.class)){
				Soccer annotation=field.getAnnotation(Soccer.class);
				field.setAccessible(true);
				System.out.println(field.getType().getSimpleName().toString());
				switch (field.getType().getSimpleName().toString()) {
				case "int":
					field.set(o,Integer.valueOf(annotation.value()));
					break;
				case"double":
					field.set(o, Double.valueOf(annotation.value()));
					break;
				case"String":
					field.set(o, annotation.value());
					break;

				default:
					break;
				}
			}
		}
		
		System.out.println("注释后的值");
		((Soccer2)o).showInfo();
	}

}
