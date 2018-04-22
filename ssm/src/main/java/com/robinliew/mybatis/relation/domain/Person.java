package com.robinliew.mybatis.relation.domain;

import java.util.List;  

/**
 * Person和Orders构成多对多
 * @author RobinLiew
 *
 */
public class Person {  
  
    private int id;  
    private String name;  
    /*一对多*/
    private List<Orders> orderList;  
  
    public int getId() {  
        return id;  
    }  
  
    public void setId(int id) {  
        this.id = id;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public List<Orders> getOrderList() {  
        return orderList;  
    }  
  
    public void setOrderList(List<Orders> orderList) {  
        this.orderList = orderList;  
    }  
  
    @Override  
    public String toString() {  
        return "Person [id=" + id + ", name=" + name + "]";  
    }  
  
    public Person() {  
        super();  
        // TODO Auto-generated constructor stub  
    }  
  
    public Person(int id, String name, List<Orders> orderList) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.orderList = orderList;  
    }  
  
}  
