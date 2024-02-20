package com.xworkz.monuments.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class HampiUpdate {

public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager()   ;
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("Class is connected");
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createQuery("UPDATE MonumentsEntity entity SET entity.founderName=:founderby WHERE entity.name=:nameby");
			query.setParameter("founderby", "Patta" );
			query.setParameter("nameby", "Pattadakallu");
			query.executeUpdate();
			entityTransaction.commit();
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
