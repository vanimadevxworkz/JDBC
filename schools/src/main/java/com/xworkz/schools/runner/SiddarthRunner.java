package com.xworkz.schools.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.schools.entity.SchoolEntity;


public class SiddarthRunner {
	
public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		System.out.println("class is connected");
		
		try {
			entityTransaction.begin();
			SchoolEntity entity=new SchoolEntity();
			entity.setId(1);
			entity.setSchool_name("Siddarth");
			entity.setSchool_location("Bhatkal");
			entity.setSchool_numOfStudents(500);
			entity.setSchool_numOfTeachers(20);
			entityManager.persist(entity);
			entityTransaction.commit();
			
		}catch(PersistenceException e) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
				System.out.println("exception:"+e);
			}
		}
		finally {
			entityManager.close();
			entityManagerFactory.close();
			System.out.println("close the entity");
		}

}
}
