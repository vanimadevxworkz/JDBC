package com.xworkz.bag.service;

import com.xworkz.bag.dto.BagDto;
import com.xworkz.bag.repository.BagRepo;
import com.xworkz.bag.repository.BagRepoImpl;

public class BagServiceImpl implements BagService {

	@Override
	public boolean save(BagDto dto) {
		System.out.println("this is service calling");
		
		BagRepo repo=new BagRepoImpl();
		boolean saved=repo.save(dto);
		System.out.println("this data saved successfully:"+saved);
		return true;
	}

}
