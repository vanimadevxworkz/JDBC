package com.xworkz.states.runner;

import com.xworkz.states.dto.StateDto;
import com.xworkz.states.service.StateService;
import com.xworkz.states.service.StateServiceImpl;

public class StateRunner {
	
	public static void main(String[] args) {
		StateDto dto=new StateDto();
		
		dto.setCapital("benglore");
		dto.setStateName("Karnataka");
		dto.setCmName("Siddramyya");
		dto.setNumOfDistrict(31);
		dto.setNumOfTaluks(236);
		dto.setPopulation(6.7);
		dto.setSplFood("joladrotti");
		dto.setFamousPlace("Bidar");
		dto.setDanceName("Bhartanatya");
		
		
		StateService service=new StateServiceImpl();
		service.save(dto);
				
	}

}
