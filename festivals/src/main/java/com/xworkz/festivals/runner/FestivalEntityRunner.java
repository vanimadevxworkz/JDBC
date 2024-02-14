package com.xworkz.festivals.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.festivals.entity.FestivalsEntity;

public class FestivalEntityRunner {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		System.out.println("class is connected");
		
		try {
			entityTransaction.begin();
			FestivalsEntity entity=new FestivalsEntity();
			entity.setId(1);
			entity.setFestval_name("deepavali");
			entity.setFestval_god("devi");
			entity.setFestval_splFood("sweet");
			entity.setFestval_numOfDays(4);
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
