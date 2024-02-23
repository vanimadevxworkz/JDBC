package com.xworkz.shop.read;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.shop.entity.ShopEntity;

public class SareeRead {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("class is connected");
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("findcontactby");
			query.setParameter("contactby", 6361400696l);
			
			Object object=query.getSingleResult();
			long number=(Long)object;
			System.out.println("fid contact is:"+number);
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
