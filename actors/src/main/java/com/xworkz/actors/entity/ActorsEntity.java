package com.xworkz.actors.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="actors_table")

@NamedQuery(name="UpdateByname",query="UPDATE ActorsEntity entity SET entity.name=:nameby WHERE entity.location=:locationby")
@NamedQuery(name="UpdateByid",query="UPDATE ActorsEntity entity SET entity.name=:nameby WHERE entity.id=:idby")
public class ActorsEntity {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="position")
	private String position;
	@Column(name="location")
	private String location;
	

}
