package com.xworkz.shoping.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.hibernate.query.criteria.internal.expression.function.AggregationFunction.COUNT;
import org.hibernate.query.criteria.internal.expression.function.AggregationFunction.MAX;

import com.xworkz.shoping.entity.ShopingEntity;

public class ShopingRepoImpl implements ShopingRepo {

	List<ShopingEntity> read;
	int read1;
	@Override
	public List<ShopingEntity> read() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("class is connectd");
		
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("readAll");
			 read=query.getResultList();
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
		
		return read ;
	}
	@Override
	public String readClothName() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("class is connectd");
		
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("readclothename");
			query.setParameter("nameby", "jeens");
			
			Object object=query.getSingleResult();
			ShopingEntity entity=(ShopingEntity)object;
			System.out.println("entity is:"+entity);
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
		
		return null ;
	}
	@Override
	public Object[] readid() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("class is connectd");
		
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("readbyid");
			query.setParameter("idby", 3);
			
			List<Object[]> list=query.getResultList();
			for(Object[] name:list) {
			int id=(Integer) name[0];
			String names=(String)name[1];
			
			System.out.println("entity is:"+id+"====="+names);
			entityTransaction.commit();
			
			
		}
		}catch(PersistenceException exception) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
		finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return null;
	}
	@Override
	public Object readContact() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("class is connectd");
		
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("readbycontact");
			query.setParameter("contactby", 6361400696l);
			
			Object object=query.getSingleResult();
			long number=(Long)object;
			System.out.println("entity is:"+number);
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
		
		return null ;
	}
	@Override
	public List<Long> readListNumber() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("class is connected");
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("findnumbertlistby");
			query.setParameter("contactby", 6361400696l);
			
			List<Long> contactList=query.getResultList();
			System.out.println("contact number   list:"+contactList);
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
	
		return null;
	}
	@Override
	public List<Object[]> readIdAndPriceList() {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("class is connected");
		
		try {
			entityTransaction.begin();
		Query query=entityManager.createNamedQuery("findIdAndPriceby");
			query.setParameter("idby", 4);
			
			List<Object[]> list=query.getResultList();
			for(Object[] read:list) {
			int id=(int) read[0];
			int price=(int) read[1];
			System.out.println(" find by id and price list:"+id+"====="+price);
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
	
		return null;
	}
	@Override
	public int read1() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("class is connected");
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("findMaxPriceby");
			int price=(int)query.getSingleResult();
			
			System.out.println("max price:"+price);
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

		
		return read1;
	}
	@Override
	public long readCount() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("class is connected");
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("findcountContactby");
			
			long contact=(Long)query.getSingleResult();
			
			System.out.println("count by contactnumber:"+contact);
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

		return 0;
	}
		
	}





