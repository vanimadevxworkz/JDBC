package com.xworkz.shoping.dto;

import javax.persistence.Id;

import lombok.Data;

@Data
public class ShopingDto {

	@Id
	private int id;
	private String shopName;
	private String clothName;
	private int price;
	private long contactNumber;
}
