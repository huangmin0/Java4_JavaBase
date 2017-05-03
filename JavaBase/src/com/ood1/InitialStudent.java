package com.ood1;

public class InitialStudent {

	public static void main(String[] args) {
		Student student=new Student();
		student.name="胡小东";
		student.age=23;
		student.classNo="java4期";
		student.hobby="狂爱看直播";
		student.show();

		Student student1=new Student("zhangsan");
		student1.show();
	}
	

}
