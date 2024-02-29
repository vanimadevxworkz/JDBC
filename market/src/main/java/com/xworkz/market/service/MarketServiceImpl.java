package com.xworkz.market.service;

import com.xworkz.market.dto.MarketDto;

import com.xworkz.market.repository.MarketRepo;
import com.xworkz.market.repository.MarketRepoImpl;

public class MarketServiceImpl implements MarketService {

	 MarketRepo repo=new MarketRepoImpl();

	@Override
	public boolean update(MarketDto dto, String name) {
		 boolean update=repo.update(null, name);
			if(update) {
				System.out.println(" not Upadted SuccessFully");
			}else {
				System.out.println("Upadted SuccessFully");
			}
		return false;
		
	}

	@Override
	public boolean updates(MarketDto dto, int price) {
		
		boolean updates=repo.updates(null, price);
		if(updates) {
			System.out.println(" not Upadted SuccessFully");
		}else {
			System.out.println("Upadted SuccessFully");
		
	}
		return false;
	
	}

	@Override
	public boolean updateContact(MarketDto dto, long contact) {
		
		boolean updateContact=repo.updateContact(null, contact);
		if(updateContact) {
			System.out.println(" not Upadted SuccessFully");
		}else {
			System.out.println("Upadted SuccessFully");
		
	}
		return false;
}

	@Override
	public boolean updateid(MarketDto dto, String name) {
		Boolean updateid=repo.updateid(null, name);
		
		if(updateid) {
			System.out.println(" not Upadted SuccessFully");
		}else {
			System.out.println("Upadted SuccessFully");
			
	}
		return false;
}
}
