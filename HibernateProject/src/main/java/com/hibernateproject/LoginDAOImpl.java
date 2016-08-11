package com.hibernateproject;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class LoginDAOImpl extends HibernateUtil implements LoginDAO {
	
	Session sessions;

	public void setSessionFactory(SessionFactory sessionFactory){
		factory = sessionFactory;
	}
	
	public Session getSession(){
		return factory.openSession();
	}
	
	public boolean checkLogin(String username, String password){
		
		
		boolean userFound=false;
		String hql = "from entities.User where firstName= '" + username + "' and password= '" + password + "'";
		Query query = sessions.createQuery(hql);
		List list = query.list();
		
		if((list!=null) && (list.size() > 0)){
			userFound=true;
		}
		
		//session.close();
		return userFound;
		
		
		
	}

}
