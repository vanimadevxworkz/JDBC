package com.xworkz.market.runner;

import com.xworkz.market.dto.MarketDto;
import com.xworkz.market.service.MarketService;
import com.xworkz.market.service.MarketServiceImpl;

public class MarketRunner {

	public static void main(String[] args) {
		MarketDto dto=new MarketDto();
		
		MarketService service=new MarketServiceImpl();
		service.update(dto," Dmart");
		service.updates(dto, 2500);
		service.updateContact(dto, 9901435603l);
		service.updateid(dto, "Lehanga");
	}
}
