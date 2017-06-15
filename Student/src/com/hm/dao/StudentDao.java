package com.hm.dao;

import com.hm.bean.Student;



public interface StudentDao
{
	public void addStudent(Student student);		//定义添加学生信息的方法
	public void updateStudent(Student student);	//定义修改学生信息的方法
	public void deleteStudent(int id);		//定义删除学生信息的方法
	public Student findAllStudent(int id);		//定义查询所有学生信息的方法
}
