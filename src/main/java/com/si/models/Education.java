package com.si.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Education {
	private String educationID;
	private String educationLevel;
	private String educationType;
	private double gpa;
}
