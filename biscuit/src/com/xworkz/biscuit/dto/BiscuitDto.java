package com.xworkz.biscuit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BiscuitDto {
	
	private String biscuit_name;
	private int biscuit_price;
	private int biscuit_manufactureDate;

}
