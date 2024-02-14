package com.xworkz.vehical.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.vehical.entity.VehicalEntity;



public class CarRunner {
	
	public static void main(String[] args) {
		
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	System.out.println("class is connected");
	
	try {
		entityTransaction.begin();
		VehicalEntity entity=new VehicalEntity();
		entity.setId(1);
		entity.setVehical_name("Car");
		entity.setVehical_number("KA/47/4819");
		entity.setVehical_price(700000);
		entity.setVehical_colorName("White");
		entityManager.persist(entity);
		entityTransaction.commit();
		
	}catch(PersistenceException e) {
		if(entityTransaction.isActive()) {
			entityTransaction.rollback();
			System.out.println("exception:"+e);
		}
	}
	finally{
		entityManager.close();
		entityManagerFactory.close();
		System.out.println("close the entity");
	}

	}
}
