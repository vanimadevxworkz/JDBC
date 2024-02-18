package com.xworkz.drinks.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.drinks.entity.DrinksEntity;

public class VodakDeletRunner {
	
public static void main(String[] args) {
		
		EntityManagerFactory  entityManagerFactory =Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("Class is connected");
		
		try {
			entityTransaction.begin();
			DrinksEntity drinksEntity=entityManager.find(DrinksEntity.class, 6);
			
			entityManager.remove(drinksEntity);
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
