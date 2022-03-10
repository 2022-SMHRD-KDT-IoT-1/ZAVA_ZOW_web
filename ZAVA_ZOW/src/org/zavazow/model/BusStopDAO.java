package org.zavazow.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BusStopDAO {

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

	public List<BusStopVO> selectBusStop(String busStopName) {

		SqlSession session = sqlSessionFactory.openSession();

		List<BusStopVO> list = session.selectList("selectBusStop", busStopName);

		session.close();

		return list;
	}

	public int insertData(BusStopVO vo) {
		
		SqlSession session = sqlSessionFactory.openSession(true);

		int cnt = session.insert("insertData", vo);

		session.close();

		return cnt;

	}

}
