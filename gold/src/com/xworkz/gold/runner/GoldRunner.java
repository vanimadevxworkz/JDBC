package com.xworkz.gold.runner;

import com.xworkz.gold.constants.ConnectionData;
import com.xworkz.gold.dto.GoldDto;
import com.xworkz.gold.service.GoldService;
import com.xworkz.gold.service.GoldServiceImpl;

public class GoldRunner {
	
	public static void main(String[] args) {
		
		ConnectionData.URL.setData("jdbc:mysql://localhost:3306/gold");
		ConnectionData.USERNAME.setData("root");
		ConnectionData.PASSWORD.setData("X-workzodc@123");
		
		GoldDto dto=new GoldDto("silver", 100000);
		
		GoldService service=new GoldServiceImpl();
		service.save(dto);
		
		
		
		
	
		
		
		
	}
	
	

}
