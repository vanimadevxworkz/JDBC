package com.xworkz.schools.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="school_table")

public class SchoolEntity {
	
    @Id	
   @Column(name="id")
	private int id;
    @Column(name="school_name")
	private String school_name;
    @Column(name="school_location")
	private String school_location;
    @Column(name="school_numOfStudents")
	private int school_numOfStudents;
    @Column(name="school_numOfTeachers")
	private int school_numOfTeachers;

}
