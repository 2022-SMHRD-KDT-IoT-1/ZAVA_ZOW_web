package org.zavazow.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ReservationDAO {

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

	public List<ReservationVO> selectReservation() {

		SqlSession session = sqlSessionFactory.openSession();

		List<ReservationVO> list = session.selectList("selectReservation");

		session.close();

		return list;
	}

	public int createReservation(ReservationVO vo) {
		
		SqlSession session = sqlSessionFactory.openSession(true);

		int cnt = session.insert("createReservation", vo);

		session.close();

		return cnt;

	}

}
