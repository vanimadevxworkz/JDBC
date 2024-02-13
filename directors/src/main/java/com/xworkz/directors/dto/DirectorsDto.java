package com.xworkz.directors.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor 
public class DirectorsDto {
	
	private String directors_name;
	private String movie_name;
	private int numOfMovies;
	private int age;

}
