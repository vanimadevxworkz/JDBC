package com.xworkz.shop.read;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class ListRead {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("class is connected");
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("findPriceAndDiscountby");
			query.setParameter("priceby", 700);
			
			List<Object[]> list=query.getResultList();
			for(Object[] name:list) {
			int price=(Integer) name[0];
			double dis=(Double)name[1];
			System.out.println("price and discount list:"+price+"====="+dis);
			}
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
