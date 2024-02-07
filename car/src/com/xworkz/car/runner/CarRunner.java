package com.xworkz.car.runner;

import com.xworkz.car.constants.ConnectionData;
import com.xworkz.car.dto.CarDto;
import com.xworkz.car.service.CarService;
import com.xworkz.car.service.CarServiceImpl;

public class CarRunner {
	
	public static void main(String[] args) {
		ConnectionData.URL.setValue("jdbc:mysql://localhost:3306/car");
		ConnectionData.USERNAME.setValue("root");
		ConnectionData.PASSWORD.setValue("X-workzodc@123");
		
		CarDto dto=new CarDto(1, "swift", "brezza");
		
		CarService service=new CarServiceImpl();
		service.validatesave(dto);
		
		
	}

}
