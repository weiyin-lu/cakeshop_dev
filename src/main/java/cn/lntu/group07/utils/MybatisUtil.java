package cn.lntu.group07.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
    static SqlSession sqlSession;
    public static SqlSession getSqlSession() {
        InputStream resource;
        try {
            resource = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resource);
        sqlSession = factory.openSession(true);
        return sqlSession;
    }

    public static void closeSession() {
        sqlSession.close();
    }
}
