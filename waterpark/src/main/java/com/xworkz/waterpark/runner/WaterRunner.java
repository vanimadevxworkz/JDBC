package com.xworkz.waterpark.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.waterpark.entity.WaterparkEntity;



public class WaterRunner {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		System.out.println("class is connected");
		
		try {
			entityTransaction.begin();
			WaterparkEntity entity=new WaterparkEntity();
			entity.setId(1);
			entity.setWaterpark_name("GRS");
			entity.setWaterpark_location("Mysore");
			entity.setWaterpark_entryFees(250);
			entity.setWaterpark_openTiming(10.0);
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
