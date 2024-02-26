package com.in.util;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	public static Session getSqlSession() {
		
		return new Configuration().configure().buildSessionFactory().openSession();
	}

}
