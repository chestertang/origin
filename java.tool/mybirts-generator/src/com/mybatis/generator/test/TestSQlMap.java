package com.mybatis.generator.test;
 

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dao.UserMapper;
import com.model.User;
  
public class TestSQlMap {  
  
    public static void main(String[] args) throws Exception {  
        String resource = "test-config.xml";  
        Reader reader = Resources.getResourceAsReader(resource);  
        SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);  
        SqlSession sqlSession = sqlMapper.openSession();  
       
        try {  
        	UserMapper mapper = sqlSession.getMapper(UserMapper.class);  
            List<User> allRecords = mapper.selectByExample(null);  
            for (User s : allRecords){  
                System.out.println(s);  
            }
        } finally {  
            sqlSession.close();  
        }  
    }  
}  