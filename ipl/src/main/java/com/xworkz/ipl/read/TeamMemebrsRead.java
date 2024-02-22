package com.xworkz.ipl.read;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class TeamMemebrsRead {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("class is connected");
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("findnameandmembesby");
			query.setParameter("nameby", "csk");
			
			Object[] object=(Object[])query.getSingleResult();
			String team=(String)object[0];
			int members=(int)object[1];
			System.out.println("team name  AND total members :"+team+"======"+members);
			
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
