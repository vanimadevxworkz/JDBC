package com.xworkz.states.service;

import com.xworkz.states.dto.StateDto;
import com.xworkz.states.repository.StateRepo;
import com.xworkz.states.repository.StateRepoImpl;

public class StateServiceImpl implements StateService {

	@Override
	public boolean save(StateDto dto) {
		System.out.println("this is service class");
		
		StateRepo stateRepo=new StateRepoImpl();
		boolean saved=stateRepo.save(dto);
		System.out.println("this data saved in service class");
		return true;
	}

}
