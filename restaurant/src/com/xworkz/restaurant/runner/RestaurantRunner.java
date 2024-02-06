package com.xworkz.restaurant.runner;

import com.xworkz.restaurant.dto.RestaurantDto;
import com.xworkz.restaurant.service.RestaurantService;
import com.xworkz.restaurant.service.RestaurantServiceImpl;

public class RestaurantRunner {
	
	public static void main(String[] args) {
		RestaurantDto dto=new RestaurantDto();
		dto.setName("Spice terrace");
		dto.setManagerName("xxx");
		dto.setOpenTime(6.30);
		dto.setContactNum(6361400596l);
		dto.setLocation("benglore");
		dto.setMailId("spiceterrest@gmail.com");
		dto.setFoodPrice(250);
		dto.setSplFood("biriyani");
		dto.setCloseTime(11.30);
		
		
		RestaurantService service=new RestaurantServiceImpl();
		service.save(dto);
	}

}
