package com.xworkz.dances.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="dance_table")

@NamedQuery(name="findByname",query="select entity.name from DanceEntity entity where entity.name=:nameby")
@NamedQuery(name="findstatenameby",query="select entity.state from DanceEntity entity where entity.state=:nameby")
@NamedQuery(name="findnameandstatebyname",query="select entity.state,entity.name from DanceEntity entity where entity.name=:nameby")
public class DanceEntity {
	
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="state")
	private String state;

}
