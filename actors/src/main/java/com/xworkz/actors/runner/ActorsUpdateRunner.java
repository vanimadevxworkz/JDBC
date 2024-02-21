package com.xworkz.actors.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class ActorsUpdateRunner {
	
public static void main(String[] args) {
		
		EntityManagerFactory entityEntityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityEntityManagerFactory.createEntityManager()   ;
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("Class is connected");
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createQuery("UPDATE ActorsEntity entity SET entity.location=:locationby WHERE entity.name=:nameby");
			query.setParameter("locationby", "BENGLORE" );
			query.setParameter("nameby", "Vasista");
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
			entityEntityManagerFactory.close();
			System.out.println("entity is close");
		}
	}
}
