package lee;

import javax.sql.DataSource;
import java.sql.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class BeanTest
{
	public static void main(String[] args)
		throws Exception
	{
		// ʵ����Spring������Spring��������ʵ����Bean
		ApplicationContext ctx =
			new ClassPathXmlApplicationContext("beans.xml");
		// ��ȡ������idΪdataSource��Bean
		DataSource ds = ctx.getBean("dataSource", DataSource.class);
		// ͨ��DataSource����ȡ���ݿ�����
		Connection conn = ds.getConnection();
		// ͨ�����ݿ����ӻ�ȡPreparedStatement
		PreparedStatement pstmt = conn.prepareStatement(
			"insert into news_inf values(null , ? , ?)");
		pstmt.setString(1 , "java课程");
		pstmt.setString(2 , "Java学习网址");
		// ִ��SQL���
		pstmt.executeUpdate();
		// ������Դ���������ݿ�������Դ��
		if (pstmt != null)pstmt.close();
		if (conn != null)conn.close();
	}
}