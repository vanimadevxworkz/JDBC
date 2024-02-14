package com.xworkz.festivals.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="festval_table")
public class FestivalsEntity {
	
	
	@Id
	@Column(name="id")
	private int id;	
	@Column(name="festval_name")
	private String festval_name;
	@Column(name="festval_god")
	private String festval_god;
	@Column(name="festval_splFood")
	private String festval_splFood;
	@Column(name="festval_numOfDays")
	private int festval_numOfDays;

}
