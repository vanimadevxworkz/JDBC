package com.xworkz.ipl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="ipl_table ")
@NamedQuery(name = "findteamnameby", query = "select entity.teamName from IplEntity entity where entity.teamName=:nameby")
@NamedQuery(name = "findteammembersby", query = "select entity.members from IplEntity entity where entity.members=:membersby")
@NamedQuery(name = "findnameandmembesby", query = "select entity.teamName,entity.members from IplEntity entity where entity.teamName=:nameby")

public class IplEntity {
	
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="team_namel")
	private String teamName;
	@Column(name="members")
	private int members;
	@Column(name="captain")
	private String captain;
	@Column(name="dress_color")
	private String color;
	

}
