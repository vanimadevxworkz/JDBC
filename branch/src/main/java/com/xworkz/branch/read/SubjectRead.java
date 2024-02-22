package com.xworkz.branch.read;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class SubjectRead {
	
public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("class is connected");
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("findsubby");
			query.setParameter("subjectby", 10);
			
			Object object=(Object)query.getSingleResult();
			int sub=(int)object;
			System.out.println("sub is:"+sub);
			
		}
		catch(PersistenceException exception) {
		if(entityTransaction.isActive()) {
			entityTransaction.rollback();
		}
		}
		finally {
			entityManager.close();
			entityManagerFactory.close();
			System.out.println("entity is close");
		}
	}

}
