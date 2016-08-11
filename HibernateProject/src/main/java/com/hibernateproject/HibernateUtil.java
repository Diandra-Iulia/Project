package com.hibernateproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

//import entities.User;



public class HibernateUtil {
	
   public SessionFactory factory;
    Session session;
	ServiceRegistry serviceRegistry;
	Configuration configuration = new Configuration();
	
	public void hibernateConfiguration(){
		
		
		configuration.configure("hibernate.cfg.xml");
		
	    serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		
		factory = configuration.buildSessionFactory(serviceRegistry);
		
	    session = factory.getCurrentSession();
		
		session.getTransaction().begin();
		
		
		
		/*User user = new User();
		user.setFirstName("aaad");
		user.setLastName("aaa");
		user.setUserEmail("text@text.com");
		user.setPassword("passs");

		// Save
		session.save(user);*/

		// Commit transaction
		session.getTransaction().commit();
		
	}
	
	
}
