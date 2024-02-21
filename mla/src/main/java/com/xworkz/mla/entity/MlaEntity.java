package com.xworkz.mla.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="mla_table")

@NamedQuery(name="UpdateByname",query="UPDATE MlaEntity entity SET entity.name=:nameby WHERE entity.location=:locationby")
@NamedQuery(name="UpdateBylocation",query="UPDATE MlaEntity entity SET entity.location=:locationby WHERE entity.name=:nameby")

public class MlaEntity {

	@Id
	@Column(name="id")
private int id;
	@Column(name="name")
private String name;
	@Column(name="partyName")
private String partyName;
	@Column(name="location")
private String location;
	
}
