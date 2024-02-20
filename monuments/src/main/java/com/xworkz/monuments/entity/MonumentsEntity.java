package com.xworkz.monuments.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="monument_table")

@NamedQuery(name="UpdateByname",query="UPDATE MonumentsEntity entity SET entity.location=:locationby WHERE entity.name=:nameby")
@NamedQuery(name="UpdateBylocation",query="UPDATE MonumentsEntity entity SET entity.name=:nameby WHERE entity.location=:locationby")
@NamedQuery(name="UpdateByfoundername",query="UPDATE MonumentsEntity entity SET entity.founderName=:founderby WHERE entity.name=:nameby")
@NamedQuery(name="UpdateByid",query="UPDATE MonumentsEntity entity SET entity.founderName=:founderby WHERE entity.id=:idby")

public class MonumentsEntity {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="founderName")
	private String founderName;

}
