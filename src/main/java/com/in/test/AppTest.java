package com.in.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.in.entity.Student;
import com.in.util.HibernateUtil;

public class AppTest {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSqlSession();
		Transaction tx = session.beginTransaction();
		Student student = new Student();
		student.setFirstName("Swapnil");
		student.setLastName("Patil");
		student.setMarks(95);
		session.save(student);
		tx.commit();
		session.evict(student);
		System.out.println("Data enter successfully");
		session.close();

//		Session session = HibernateUtil.getSqlSession();
//		Transaction tx = session.beginTransaction();
//		Student student = new Student();
//		//student.setSid(1);
//		student.setFirstName("Swapnil");
//		student.setLastName("Patil");
//		student.setMarks(85);
//		session.persist(student);
//		//session.save(student)
//		tx.commit();
//		System.out.println("Data added successfully");
//		session.close();	
	}
}
