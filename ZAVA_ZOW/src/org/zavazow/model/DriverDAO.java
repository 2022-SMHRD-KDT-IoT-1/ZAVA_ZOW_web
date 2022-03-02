package org.zavazow.model;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DriverDAO {
	
	private static SqlSessionFactory sqlSessionFactory;

	static {

		try {
			String resource = "org/zavazow/mapper/config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// =========================================================
	// JOIN
	public int join(DriverVO dvo) {

		SqlSession session = sqlSessionFactory.openSession(true);

		int cnt = session.insert("joinDCon", dvo);

		
		session.close();

		return cnt;

	}

	// ==================================
	// LOGIN
	public DriverVO login(DriverVO dvo) {

		SqlSession session = sqlSessionFactory.openSession();

		DriverVO uvo = session.selectOne("loginDCon", dvo);

		session.close();

		return uvo;
	}

	// =========================³¡
}
