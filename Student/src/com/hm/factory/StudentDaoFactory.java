package com.hm.factory;

import com.hm.dao.StudentDao;
import com.hm.implDao.StudentDaoImpl;

public class StudentDaoFactory
{
public static StudentDao getStudentDaoInstance(){//工厂方法，用来返回DAO实现类实例
	return new StudentDaoImpl();//返回DAO实现类实例
	
}
}
