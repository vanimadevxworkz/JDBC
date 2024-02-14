package com.xworkz.vehical.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.vehical.entity.VehicalEntity;

public class JeepRunner {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		System.out.println("class is connected");
		
		try {
			entityTransaction.begin();
			VehicalEntity entity=new VehicalEntity();
			entity.setId(4);
			entity.setVehical_name("Jeep");
			entity.setVehical_number("KA/47/4539");
			entity.setVehical_price(2130000);
			entity.setVehical_colorName("Black");
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
