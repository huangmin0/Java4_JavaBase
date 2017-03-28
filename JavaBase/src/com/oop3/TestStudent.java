package com.oop3;

public class TestStudent{

public static void main(String[] args){
	IStudent student = new StudentImpl();
	student.study();
	student.studyJava("java");
	student.studyJava("PHP");
	student.studyJava("core");
}

}
