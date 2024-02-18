package com.xworkz.drinks.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="drinks_table")
public class DrinksEntity {
	
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="drinks_name")
	private String name;
	@Column(name="drinks_price")
	private int price;
	@Column(name="drinks_quality")
	private double quality;

}
