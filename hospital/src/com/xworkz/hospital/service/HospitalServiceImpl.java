package com.xworkz.hospital.service;

import com.xworkz.hospital.dto.HospitalDto;
import com.xworkz.hospital.repository.HospitalRepo;
import com.xworkz.hospital.repository.HospitalRepoImpl;

public class HospitalServiceImpl implements HospitalService {

	@Override
	public boolean save(HospitalDto dto) {
		System.out.println("this is service");
		
		HospitalRepo hospitalRepo=new HospitalRepoImpl();
		boolean save=hospitalRepo.save(dto);
		System.out.println("saved data successfully in service class");
		return true;
	}

}
