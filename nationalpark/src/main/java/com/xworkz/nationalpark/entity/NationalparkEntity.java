package com.xworkz.nationalpark.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="nationalpark_table")



public class NationalparkEntity {
	
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="nationalpark_name")
	private String nationalpark_name;
	
	@Column(name="nationalpark_location")
	private String nationalpark_location;
	
	@Column(name="nationalpark_established")
	private int nationalpark_established;
	
	@Column(name="nationalpark_entryfees")
	private int nationalpark_entryfees;
	
	
	

}
