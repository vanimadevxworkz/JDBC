package com.xworkz.dances.read;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class KeralaRead {

	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("class is connected");
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("findnameandstatebyname");
			query.setParameter("nameby", "katakali");
			
			Object[] object=(Object[])query.getSingleResult();
			String name=(String)object[0];
			String state=(String)object[1];
			System.out.println("query is:"+name+"..... "+state);
			entityTransaction.commit();
				
			
		}catch(PersistenceException e) {
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
