package org.zavazow.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ButtonDAO {
	
	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		try {
			String resource = "org/zavazow.mapper/config.xml";
		    InputStream inputStream = Resources.getResourceAsStream(resource);
		    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ButtonVO selectButton(String buttonnum) {
		SqlSession session = sqlSessionFactory.openSession();
	    ButtonVO vo = session.selectOne("selectButton",buttonnum);
	    session.close();
	    
	    return vo;
	
	}
	
	public int updateButton(ButtonVO vo) {
		SqlSession session = sqlSessionFactory.openSession(true);
		
		int cnt = session.update("updateButton",vo);
		
		session.close();
		
		return cnt;
		
	}
	
	

}
