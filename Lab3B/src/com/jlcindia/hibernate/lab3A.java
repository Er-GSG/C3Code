package com.jlcindia.hibernate;
import java.util.*;
import org.hibernate.*;
public class lab3A {
public static void main(String[] args) {

	try
	{
		 SessionFactory sf=HibernateUtil.getSessionFactory();
		 Session session =sf.openSession();
		 Transaction tx=session.beginTransaction();	
	 Student stu =(Student)session.load(Student.class,1);
	 System.out.println(stu.getSid()+"\t"+stu.getSname()+"\t"+stu.getDob());
	 for(String cn:stu.getCourses()) {
	 System.out.println(cn);
	 }
	 System.out.println(stu.getEmails());
	 System.out.println(stu.getMarks());
	 System.out.println(stu.getPhones());
	 System.out.println(stu.getRefs());
      tx.commit();
      session.close();
	  
	}
	catch (Exception e) {
		// TODO: handle exception
	e.printStackTrace();
	}
	
}
}
