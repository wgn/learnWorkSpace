package com.zhuani21.test.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.zhuani21.mybatis.model.Code_Map;

public class UUIDPrimaryKeyTest {

	@Test
	public void mybatisAccessDB() throws IOException{
		String configFilePath = "mybatis-config.xml";
		InputStream configInputStream = Resources.getResourceAsStream(configFilePath);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configInputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		saveCodeMap(sqlSession);
		
		sqlSession.close();
	}

	private void saveCodeMap(SqlSession sqlSession) {
		Code_Map codeMap  = new Code_Map();
		codeMap.setCode_type("gender");
		codeMap.setCode("1");
		codeMap.setName("male");
		
		sqlSession.insert("codeMap.saveCodeMap", codeMap);
		
		sqlSession.commit();
		System.out.println(codeMap.getId());
	}
}
