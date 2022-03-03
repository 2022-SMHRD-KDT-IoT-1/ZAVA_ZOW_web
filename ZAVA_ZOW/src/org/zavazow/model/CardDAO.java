package org.zavazow.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class CardDAO {

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
	
	
	public CardVO selectCard(String cardnum) {
		SqlSession session = sqlSessionFactory.openSession();
		
		CardVO vo = session.selectOne("selectCard", cardnum);
		
		session.close();

		return vo;
	}
	

	public int updateCard(CardVO vo) {
		SqlSession session = sqlSessionFactory.openSession(true);

		int cnt = session.update("updateCard", vo);

		session.close();

		return cnt;

	}

}
