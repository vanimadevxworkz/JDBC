package com.xworkz.market.service;

import com.xworkz.market.dto.MarketDto;

public interface MarketService {
	
	boolean update(MarketDto dto, String name);
	boolean updates(MarketDto dto, int price);
	boolean updateContact(MarketDto dto, long contact);
	boolean updateid(MarketDto dto, String name);
	

}
