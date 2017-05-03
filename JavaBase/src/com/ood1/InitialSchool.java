package com.ood1;

public class InitialSchool {

	public static void main(String[] args) {
	School school=new School();
	System.out.println("初始化变量前");
	school.showCenter();
	
	System.out.println("初始化变量后");
	school.schoolName="新安人才培训中心";
	school.classNumber=23;
	school.labNunmber=10;
	school.showCenter();
	

	}

}
