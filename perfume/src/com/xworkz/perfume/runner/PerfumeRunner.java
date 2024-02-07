package com.xworkz.perfume.runner;

import com.xworkz.perfume.constants.ConnectionData;
import com.xworkz.perfume.dto.PerfumeDto;
import com.xworkz.perfume.service.PerfumeService;
import com.xworkz.perfume.service.PerfumeServiceImpl;

public class PerfumeRunner {
	
	public static void main(String[] args) {
		ConnectionData.URL.setvalue("jdbc:mysql://localhost:3306/perfume");
		ConnectionData.USERNAME.setvalue("root");
		ConnectionData.PASSWORD.setvalue("X-workzodc@123");
		
		PerfumeDto dto=new PerfumeDto(1, "fog", 250);
		
		PerfumeService service=new PerfumeServiceImpl();
		service.validatesave(dto);
	}

}
