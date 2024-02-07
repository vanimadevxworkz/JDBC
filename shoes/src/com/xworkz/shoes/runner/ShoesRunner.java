package com.xworkz.shoes.runner;

import com.xworkz.shoes.constants.ConnectionData;
import com.xworkz.shoes.dto.ShoesDto;
import com.xworkz.shoes.service.ShoesService;
import com.xworkz.shoes.service.ShoesServiceImpl;

public class ShoesRunner {
	
	public static void main(String[] args) {
		ConnectionData.URL.setValue("jdbc:mysql://localhost:3306/shoes");
		ConnectionData.USERNAME.setValue("root");
		ConnectionData.PASSWORD.setValue("X-workzodc@123");
		
		ShoesDto dto=new ShoesDto(1, "crocks", 700, "white");
		
		ShoesService service=new ShoesServiceImpl();
		service.validatesave(dto);
	}

}
