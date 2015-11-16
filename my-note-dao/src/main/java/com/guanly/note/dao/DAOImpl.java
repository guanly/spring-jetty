package com.guanly.note.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * Created by guanly on 2015/8/4.
 */
public class DAOImpl {
    private SqlSessionFactory sqlSessionFactory;

    public  <T> T getDomain(String statement, Object obj) {
        SqlSession session = sqlSessionFactory.openSession();
        T result = session.selectOne(statement, obj);
        session.close();
        return result;
    }

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
        System.out.println(sqlSessionFactory);
    }
}
