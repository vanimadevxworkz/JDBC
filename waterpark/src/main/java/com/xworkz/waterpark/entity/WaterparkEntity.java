package com.xworkz.waterpark.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="waterpark_table")
public class WaterparkEntity {
	
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="waterpark_name")
	private String waterpark_name;
	
	@Column(name="waterpark_location")
	private String waterpark_location;
	
	@Column(name="waterpark_entryFees")
	private int waterpark_entryFees;
	@Column(name="waterpark_openTiming")
	private double waterpark_openTiming;
	

}
