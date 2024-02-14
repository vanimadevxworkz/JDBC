package com.xworkz.schools.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.schools.entity.SchoolEntity;

public class PpcRunner {

public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		System.out.println("class is connected");
		
		try {
			entityTransaction.begin();
			SchoolEntity entity=new SchoolEntity();
			entity.setId(2);
			entity.setSchool_name("PPC");
			entity.setSchool_location("Udupi");
			entity.setSchool_numOfStudents(1000);
			entity.setSchool_numOfTeachers(30);
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
