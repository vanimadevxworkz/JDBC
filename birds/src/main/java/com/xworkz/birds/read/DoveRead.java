package com.xworkz.birds.read;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.birds.entity.BirdsEntity;

public class DoveRead {
	
	
		
		public static void main(String[] args) {
			
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			System.out.println("class is connectd");
			
			try {
				entityTransaction.begin();
				Query query=entityManager.createNamedQuery("UpdateBycolor");
				query.setParameter("nameby", "dove");
				query.setParameter("colorname","white");
				
				Object  object=query.getSingleResult();
				BirdsEntity entity=(BirdsEntity)object;
				entityTransaction.commit();
				System.out.println(entity);
				
				
				
			}catch(PersistenceException e) {
				if(entityTransaction.isActive()) {
					entityTransaction.rollback();  
				}
			}
			finally {
				entityManager.close();
				entityManagerFactory.close();
			}
		}


}
