package com.xworkz.nationalpark.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.nationalpark.entity.NationalparkEntity;

public class NationalRunner {
	
public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		System.out.println("class is connected");
		
		try {
			entityTransaction.begin();
			NationalparkEntity entity=new NationalparkEntity();
			entity.setId(2);
			entity.setNationalpark_name("Greate himaliyan");
			entity.setNationalpark_location("Himachalpradesh");
			entity.setNationalpark_established(1983);
			entity.setNationalpark_entryfees(500);
			entityManager.persist(entity);
			entityTransaction.commit();
			
		}catch(PersistenceException e) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
				System.out.println("exception:"+e);
			}
		}
		finally {
			entityManager.close();
			entityManagerFactory.close();
			System.out.println("close the entity");
		}

}
}
