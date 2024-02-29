package com.xworkz.market.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;



import com.xworkz.market.entity.MarketEntity;

public class MarketRepoImpl implements MarketRepo {

	@Override
	public boolean update(MarketEntity entity, String name) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("class is connectd");
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("updatebyName");
			query.setParameter("nameby", "Dmart");
			query.setParameter("clothBy", "kurta");
			query.executeUpdate();
			entityTransaction.commit();
			
		}catch(PersistenceException exception) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
		finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		
		return false;
	}

	@Override
	public boolean updates(MarketEntity entity, int price) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("class is connectd");
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("updatebyPrice");
			query.setParameter("priceby", price);
			query.setParameter("clothBy", "saare");
			query.executeUpdate();
			entityTransaction.commit();
			
		}catch(PersistenceException exception) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
		finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		
		return false;
	}

	@Override
	public boolean updateContact(MarketEntity entity, long contact) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("class is connectd");
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("updatebyContact");
			query.setParameter("contactby", contact);
			query.setParameter("shopBy", "Mejestic");
			query.executeUpdate();
			entityTransaction.commit();
			
		}catch(PersistenceException exception) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
		finally {
			entityManager.close();
			entityManagerFactory.close();
		return false;
	}

	}

	@Override
	public boolean updateid(MarketEntity entity, String name) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("class is connectd");
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("updatebyId");
			query.setParameter("nameby", name);
			query.setParameter("idBy", 5);
			query.executeUpdate();
			entityTransaction.commit();
			
		}catch(PersistenceException exception) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
		finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		
		return false;
	}
	}

