package com.hm.implDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hm.bean.Student;
import com.hm.dao.StudentDao;
import com.hm.util.DBConnection;

public class StudentDaoImpl implements StudentDao
{
	Student student = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	@Override
	public void addStudent(Student student)
	{
		Connection conn = DBConnection.getConnection(); // 获得连接对象
		String addSQL = "insert into stu(id,name,age,phone) values(?,?,?,?)";
		try
		{
			pstmt = conn.prepareStatement(addSQL); // 获得预处理对象并赋值
			pstmt.setInt(1, student.getId()); // 设置第一个参数
			pstmt.setString(2, student.getName());// 设置第二个参数
			pstmt.setInt(3, student.getAge()); // 设置第三个参数
			pstmt.setInt(4, student.getPhone()); // 设置第四个参数
			pstmt.executeUpdate(); // 执行更新
		} catch (SQLException e)
		{
			e.printStackTrace();
		} finally
		{
			DBConnection.close(pstmt); // 关闭预处理对象
			DBConnection.close(conn); // 关闭连接对象
		}

	}

	@Override
	public void updateStudent(Student student)
	{
		Connection conn=DBConnection.getConnection();
		String findSQL="update stu set name=?,age=?,phone=? where id=?; ";
		try
		{
			pstmt=conn.prepareStatement(findSQL);
			pstmt.setInt(4, student.getId());
			pstmt.setString(1, student.getName());
			pstmt.setInt(2, student.getAge());
			pstmt.setInt(3, student.getPhone());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	@Override
	public void deleteStudent(int id)
	{
		Connection conn = DBConnection.getConnection(); // 获得连接对象
		String findSQL = "delete from stu where id=?";
		try
		{
			pstmt = conn.prepareStatement(findSQL);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	@Override
	public Student findAllStudent(int id)
	{
		
		Connection conn = DBConnection.getConnection(); // 获得连接对象
		String findSQL = "select * from stu where id=?";
		try
		{
			pstmt = conn.prepareStatement(findSQL);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if (rs.next())
			{
				student = new Student();
				student.setId(id);
				student.setName(rs.getString("name"));
				student.setAge(rs.getInt("age"));
				student.setPhone(rs.getInt("phone"));
				rs.close();
				pstmt.close();
				conn.close();
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}

		return student;

	}

}
