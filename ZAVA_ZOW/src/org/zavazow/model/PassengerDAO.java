package org.zavazow.model;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class PassengerDAO {

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
	public int join(PassengerVO vo) {

		SqlSession session = sqlSessionFactory.openSession(true);

		int cnt = session.insert("joinCon", vo);

		session.close();

		return cnt;

	}

	// ==================================
	// LOGIN
	public PassengerVO login(PassengerVO vo) {

		SqlSession session = sqlSessionFactory.openSession();

		PassengerVO uvo = session.selectOne("loginCon", vo);

		session.close();

		return uvo;
	}
	
	//===================================
	// UPDATE
	public int update(PassengerVO vo) {
		
		SqlSession session = sqlSessionFactory.openSession(true);

		int cnt = session.update("updateCon", vo);
		
		session.close();

		return cnt;
	}
	//===============================
	// DELETE
	public int delete(String id) {
		SqlSession session = sqlSessionFactory.openSession(true);
		
		int cnt = session.delete("deleteCon", id); 
		
		session.close();
		
		return cnt;
	}

	// =========================³¡
}
