package com.xworkz.restaurant.service;

import com.xworkz.restaurant.dto.RestaurantDto;
import com.xworkz.restaurant.repository.RestaurantRepo;
import com.xworkz.restaurant.repository.RestaurantRepoImpl;

public class RestaurantServiceImpl implements RestaurantService{

	@Override
	public boolean save(RestaurantDto dto) {
		System.out.println("this is serice class infomation");
		
		RestaurantRepo repo=new RestaurantRepoImpl();
		boolean saved=repo.save(dto);
		System.out.println("this data saved in service class");
		
		return false;
	}

}
