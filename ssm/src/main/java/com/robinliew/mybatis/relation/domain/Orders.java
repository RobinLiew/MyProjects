package com.robinliew.mybatis.relation.domain;

public class Orders {  
    private int id;  
    private double price; 
    /*多对一*/
    private Person person;  
      
      
      
    public Person getPerson() {  
        return person;  
    }  
  
    public void setPerson(Person person) {  
        this.person = person;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public void setId(int id) {  
        this.id = id;  
    }  
  
  
  
    public double getPrice() {  
        return price;  
    }  
  
    public void setPrice(double price) {  
        this.price = price;  
    }  
  
  
      
  
    @Override  
    public String toString() {  
        return "Orders [id=" + id + ", price=" + price + "]";  
    }  
  
    public Orders() {  
        super();  
        // TODO Auto-generated constructor stub  
    }  
  
}  
