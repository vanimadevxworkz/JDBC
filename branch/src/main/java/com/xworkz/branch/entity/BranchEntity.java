package com.xworkz.branch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="branch_table")
@NamedQuery(name = "findnameby",query="select entity.name from BranchEntity entity where entity.name=:nameby")
@NamedQuery(name = "findsubby",query="select entity.nuOfSub from BranchEntity entity where entity.nuOfSub=:subjectby")
@NamedQuery(name = "findnameandsubby",query="select entity.name,entity.nuOfSub from BranchEntity entity where entity.name=:nameby")
public class BranchEntity {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="no_of_sub")
	private int nuOfSub;
	@Column(name="hod")
	private String hod;
	@Column(name="lab_name")
	private String labName;

}
