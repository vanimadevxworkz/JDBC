package com.xworkz.temple.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="temple_table")

public class TempleEntity {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="temple_name")
	private String name;
	@Column(name="temple_location")
	private String location;
	@Column(name="temple_openTiming")
	private double openTiming;

}
