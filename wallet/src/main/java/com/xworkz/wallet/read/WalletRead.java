package com.xworkz.wallet.read;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class WalletRead {
	
	public static void main(String[] args) {
		
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
			
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			
			EntityTransaction entityTransaction=entityManager.getTransaction();
			System.out.println("class is connected");
			
			try {
				entityTransaction.begin();
				Query query=entityManager.createNamedQuery("findcompanyby");
				query.setParameter("nameby", "Titan");
				
				Object object=(Object)query.getSingleResult();
				String compnay=(String)object;
				System.out.println("wallet company name is:"+compnay);
				
			}
			catch(PersistenceException exception) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
			}
			finally {
				entityManager.close();
				entityManagerFactory.close();
				System.out.println("entity is close");
			}
		}

	}


