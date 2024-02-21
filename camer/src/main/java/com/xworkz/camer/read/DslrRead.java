package com.xworkz.camer.read;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.camer.entity.CamerEntity;

public class DslrRead {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("class is connectd");
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("ReadByid");
			query.setParameter("nameby", "fujifilm");
			query.setParameter("idby", 2);
			
			Object  object=query.getSingleResult();
			CamerEntity entity=(CamerEntity)object;
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
