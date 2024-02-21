package com.xworkz.dances.read;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class DanceRead {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("class is connected");
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("findByname");
			query.setParameter("nameby","Bhartanatya");
			
			Object object=query.getSingleResult();
			String name=(String)object;
			System.out.println("this is class:"+name);
			
			
		}catch(PersistenceException e) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
		finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		
	}

}
