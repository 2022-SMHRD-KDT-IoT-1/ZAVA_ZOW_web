package org.zavazow.model;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class AdminDAO {

	

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
	public int join(AdminVO avo) {

		SqlSession session = sqlSessionFactory.openSession(true);

		int cnt = session.insert("joinACon", avo);

		
		session.close();

		return cnt;

	}

	// ==================================
	// LOGIN
	public AdminVO login(AdminVO avo) {

		SqlSession session = sqlSessionFactory.openSession();

		AdminVO uvo = session.selectOne("loginACon", avo);

		session.close();

		return uvo;
	}
	//===================================
	// UPDATE
	public int update(AdminVO avo) {
		
		SqlSession session = sqlSessionFactory.openSession(true);

		int cnt = session.update("updateACon", avo);
		
		session.close();

		return cnt;
	}
	// ===============================
	// DELETE
	public int delete(String a_id) {
		SqlSession session = sqlSessionFactory.openSession(true);

		int cnt = session.delete("deleteACon", a_id);

		session.close();

		return cnt;
	}

	// =========================³¡
}
