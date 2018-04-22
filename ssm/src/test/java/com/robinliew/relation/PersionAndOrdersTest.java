package com.robinliew.relation;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import com.robinliew.mybatis.relation.domain.Orders;
import com.robinliew.mybatis.relation.domain.Person;

public class PersionAndOrdersTest {  
	  
    private static SqlSessionFactory sessionFactory;  
      
    /** 
     * @throws java.lang.Exception 
     */  
    @BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();  
        InputStream inputStream = Resources.getResourceAsStream("config/test/sqlMapConfig.xml"); //从当前类所在的目录 
        sessionFactory = factoryBuilder.build(inputStream);  
  
    }  
      
    //一对多，查询person（一）级联查询订单order（多）  
    @Test  
    public void testSelectPersonFetchOrder() throws Exception {  
        SqlSession session = sessionFactory.openSession();  
        Person person = session.selectOne("com.robinliew.mybatis.relation,domain.Person.selectPersonFetchOrder", 1);  
        System.out.println(person);  
        System.out.println(person.getOrderList().size());  
        for(Orders orders : person.getOrderList()){  
            System.out.println(orders);  
        }  
        session.close();  
    }  
      
    //多对一，查询订单order（多）级联查询person（一）  
    @Test  
    public void testSelectOrdersFetchPerson() throws Exception{  
        SqlSession session = sessionFactory.openSession();  
        Orders orders = session.selectOne("com.robinliew.mybatis.relation,domain.Orders.selectOrdersFetchPerson", 1);  
        System.out.println(orders);  
        System.out.println(orders.getPerson());  
        session.close();  
    }  
      
}  
