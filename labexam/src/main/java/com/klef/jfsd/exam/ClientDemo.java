package com.klef.jfsd.exam;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ClientDemo {
	
	public static void Main(String[] args)
	{
		Project p = new Project();
		 Scanner sc = new Scanner(System.in);
		 
		 String name = sc.nextLine();
		 int duration = sc.nextInt();
		 int budget = sc.nextInt();
		 sc.nextLine();
		 String teamlead = sc.nextLine();
		  SessionFactory factory = new Configuration().configure().buildSessionFactory();
		  Session session = factory.openSession();
		  Transaction tx = session.beginTransaction();
		  p.setName(name);
		  p.setDuration(duration);
		  p.setBudget(budget);
		  p.setTeamlead(teamlead);
		  
		  session.save(p);
		  System.out.println("Inserted succesfully");
		  
		  
		  String hqlCount = "SELECT count(*) FROM Student";
	        String hqlSum = "SELECT sum(CGPA) FROM Student";
	        String hqlAvg = "SELECT avg(CGPA) FROM Student";
	        String hqlMin = "SELECT min(CGPA) FROM Student";
	        String hqlMax = "SELECT max(CGPA) FROM Student";
	        
	        Query queryCount = session.createQuery(hqlCount);
	        Query  querySum = session.createQuery(hqlSum);
	        Query queryAvg = session.createQuery(hqlAvg);
	        Query queryMin = session.createQuery(hqlMin);
	        Query queryMax = session.createQuery(hqlMax);
	        
	        System.out.println("count = "+queryCount);
	        System.out.println("sum = "+querySum);
	        System.out.println("avg = "+queryAvg);
	        System.out.println("min = "+queryMin);
	        System.out.println("max = "+queryMax);
	        
		  tx.commit();
		  session.close();
		  factory.close();
	}

}
