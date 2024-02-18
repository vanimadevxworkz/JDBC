package com.xworkz.drinks.runner;

import java.sql.DriverManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.drinks.entity.DrinksEntity;

public class DrinksRunner {
	
	public static void main(String[] args) {
		
		EntityManagerFactory  entityManagerFactory =Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("Class is connected");
		
		try {
			entityTransaction.begin();
			DrinksEntity entity=new DrinksEntity();
			entity.setId(1);
			entity.setName("vodka");
			entity.setPrice(250);
			entity.setQuality(5.0);
			entityManager.persist(entity);
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
