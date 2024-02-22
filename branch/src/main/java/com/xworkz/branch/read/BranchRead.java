package com.xworkz.branch.read;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class BranchRead {
public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("Class is connected");
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("findnameandsubby");
			query.setParameter("nameby", "Cs");
			
			Object[] object=(Object[])query.getSingleResult();
			String name=(String)object[0];
			int sub=(int)object[1];
			System.out.println("name of the branch and sub :"+name+"======"+sub);
		}
		catch(PersistenceException exception) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
		finally {
			entityManager.close();
			entityManagerFactory.close();
			System.out.println("entity is closed");
		}
	}

	

}
