package com.mayab.desarrollo.orm;

import java.util.List;

import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  

public class Driver {

	public static void main(String[] args) {
		//Create typesafe ServiceRegistry object    
	    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	          
	   Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	   
	   //Para crear la sesión que nos permita la comunicación con la DB
	   SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	   Session session = factory.openSession();  
	   ////////////////////
	   Transaction t = session.beginTransaction();   
	            
	    Employee e1=new Employee();    
	    e1.setId(201);    
	    e1.setFirstName("Hola");    
	    e1.setLastName("Hola");    
	        
	    session.save(e1); 
	   
	    ////
	    e1=new Employee();    
	    e1.setId(301);    
	    e1.setFirstName("Hola2");    
	    e1.setLastName("Hola2");    
	        
	    session.save(e1);	    
	    t.commit();  
	    
	    System.out.println("successfully saved");    
	    
	    List<Employee> result = session.createQuery("from Employee").list();
	    for(Employee e : result)
	    {
	    	System.out.println("Name = " + e.getFirstName() + " " + e.getLastName());
	    }
	    
	    factory.close();  
	    session.close();    
	}

}
