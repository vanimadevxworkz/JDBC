package com.xworkz.shop.read;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class ClothRead {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("class is connected");
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("findnameandpriceby");
			query.setParameter("nameby", "Saare");
			
			Object[] object=(Object[])query.getSingleResult();
			String name=(String)object[0];
			int price=(Integer)object[1];
			System.out.println("cloth name and price  is:"+name+"======"+price);
			entityTransaction.commit();
			
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
