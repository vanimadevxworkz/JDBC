package com.xworkz.biscuit.service;

import com.xworkz.biscuit.dto.BiscuitDto;
import com.xworkz.biscuit.repository.BiscuitRepo;
import com.xworkz.biscuit.repository.BiscuitRepoImpl;

public class BiscuitServiceImpl implements BiscuitService {

	@Override
	public boolean save(BiscuitDto dto) {
		System.out.println("this is service class");
		
		BiscuitRepo biscuitRepo=new BiscuitRepoImpl();
		boolean saved=biscuitRepo.save(dto);
		System.out.println("data saved successfully:"+saved);
		return true;
	}

}
