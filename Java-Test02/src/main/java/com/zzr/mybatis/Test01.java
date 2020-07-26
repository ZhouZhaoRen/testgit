package com.zzr.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test01 {
	public static void main(String[] args) throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		// 使用设计工厂模式
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		// 生产SqlSession
		SqlSession session = factory.openSession();
		// 通过接口的方式，动态代理模式
		FlowerMapper mapper = session.getMapper(FlowerMapper.class);
		mapper.ins();
		List<Flower> selectList = session.selectList("a.b.selectAll");
		System.out.println(selectList);

		session.close();
	}
}
