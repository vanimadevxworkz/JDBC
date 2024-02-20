package com.xworkz.monuments.runners;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class BaglkoteUpdate {
public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager()   ;
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("Class is connected");
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("UpdateByfoundername");
			query.setParameter("founderby", "muryna empire" );
			query.setParameter("nameby", "Bidar Fort");
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
