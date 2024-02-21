package com.xworkz.camer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="camer_table")

@NamedQuery(name="ReadByName",query="select entity from CamerEntity entity where entity.name=:nameby")
@NamedQuery(name="ReadByid",query="select entity from CamerEntity entity where entity.name=:nameby AND "
		+ "entity.id=:idby")
public class CamerEntity {
	
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="companyName")
	private String companyName;
	@Column(name="lens")
	private String lens;

}
