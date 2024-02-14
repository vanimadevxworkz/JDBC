package com.xworkz.nationalpark.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class NationalparkRunner {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory =null;
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
			System.out.println(" this is Connected");
			
		}catch(PersistenceException e) {
			System.out.println("Not conncected:"+e);
		}
		finally {
			entityManagerFactory.close();
		}
			 
		 
	}
	}


