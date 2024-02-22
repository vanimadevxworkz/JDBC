package com.xworkz.branch.read;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class BtechRead {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("Class is connected");
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("findnameby");
			query.setParameter("nameby", "Civil");
			
			Object object=(Object)query.getSingleResult();
			String name=(String)object;
			System.out.println("name of the branch is:"+name);
		}
		catch(PersistenceException exception) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
		finally {
			entityManager.close();
			entityManagerFactory.close();
			System.out.println("entity is closed");
		}
	}

}
