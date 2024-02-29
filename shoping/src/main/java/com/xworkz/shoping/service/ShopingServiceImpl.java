package com.xworkz.shoping.service;

import java.util.List;

import com.xworkz.shoping.entity.ShopingEntity;
import com.xworkz.shoping.repository.ShopingRepo;
import com.xworkz.shoping.repository.ShopingRepoImpl;

public class ShopingServiceImpl implements ShopingService{
	
	ShopingRepo repo=new ShopingRepoImpl();
	
	public void read() {
		 List<ShopingEntity> entities =repo.read();
		 for (ShopingEntity entity : entities) {
			 System.out.println(entity);
			
		}
	}

	@Override
	public void readClothName() {
	 repo.readClothName();
	}

	@Override
	public void readId() {
		repo.readid();
	}

	@Override
	public void readcontact() {
		System.out.println("read by cotact number");
		repo.readContact();
		
	}

	@Override
	public void readContactList() {
	System.out.println("read the contact number list");
	repo.readListNumber();
	}

	@Override
	public void readIdAndPriceList() {
		System.out.println("find the list by id and price");
		repo.readIdAndPriceList();
		
	}

	@Override
	public void readMaxPrice() {
		repo.read1();
		
	}

	@Override
	public void readCount() {
		repo.readCount();
		
	}

	
}
