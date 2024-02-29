package com.xworkz.shoping.runner;

import com.xworkz.shoping.dto.ShopingDto;
import com.xworkz.shoping.service.ShopingService;
import com.xworkz.shoping.service.ShopingServiceImpl;

public class ShopingRunner {
	
	public static void main(String[] args) {
		ShopingDto dto=new ShopingDto();
		
		ShopingService service=new ShopingServiceImpl();
		System.out.println("read the methods");
		
		service.read();
		
		service.readClothName();
		
		service.readId();
		
		service.readcontact();
		
		service.readContactList();
		
		service.readIdAndPriceList();
		
		service.readMaxPrice();
		
		service.readCount();
	}

}
