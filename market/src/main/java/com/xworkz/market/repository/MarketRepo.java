package com.xworkz.market.repository;



import com.xworkz.market.entity.MarketEntity;


public interface MarketRepo {

	boolean update(MarketEntity entity, String name);
	boolean updates(MarketEntity entity, int price);
	boolean updateContact(MarketEntity entity, long contact);
	boolean updateid(MarketEntity entity,String name);
}
