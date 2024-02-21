package com.xworkz.birds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="birds_table")

@NamedQuery(name="UpdateByName",query="select entity from BirdsEntity entity where entity.name=:nameby")
@NamedQuery(name="UpdateBycolor",query="select entity from BirdsEntity entity where entity.name=:nameby"
		+ " AND entity.colorName=:colorname")
public class BirdsEntity {
	
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="colorName")
	private String colorName;

}
