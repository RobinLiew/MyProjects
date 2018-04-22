package com.robinliew.user.dao;

import javax.annotation.Resource;  

import org.mybatis.spring.SqlSessionTemplate;  
import org.springframework.stereotype.Repository;

import com.robinliew.domain.User;  
   
/**
 * spring的持久层注解  
 * @author RobinLiew
 *
 */
@Repository  
public class UserDao {  
    @Resource(name="sqlSession")  
    private SqlSessionTemplate sqlSession;   
      
    public void addUser(User user) {  
          
        sqlSession.insert("addUser",user);  
    }  
  
}  
