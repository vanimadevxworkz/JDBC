package com.xworkz.market.dto;

import javax.persistence.Id;

import lombok.Data;
@Data
public class MarketDto {
	
	@Id
	private int id;
	private String name;
	private String clothName;
	private int price;
	private long contactNumber;

}
