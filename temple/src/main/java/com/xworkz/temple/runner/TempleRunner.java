package com.xworkz.temple.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.temple.entity.TempleEntity;

public class TempleRunner {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("class is comnnected");
		
		try {
			entityTransaction.begin();
			TempleEntity entity=new TempleEntity();
			entity.setId(1);
			 entity.setName("idgunji");
			 entity.setLocation("HOnnavara");
			 entity.setOpenTiming(10.0);
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
			System.out.println("close the entity");
		}
	}

}
