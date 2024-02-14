package com.xworkz.vehical.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="vehical_table")
public class VehicalEntity {
	  
	
@Id	
@Column(name="id")
private int id;
@Column(name="vehical_name")
private String vehical_name;
@Column(name="vehical_number")
private String vehical_number;
@Column(name="vehical_price")
private int vehical_price;
@Column(name="vehical_colorName")
private String vehical_colorName;

}
