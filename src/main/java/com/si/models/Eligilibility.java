package com.si.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Eligilibility {
	
	private String eligibilityID;
	private int upperAgeLimit;
	private int lowetAgeLimit;
	private List<Education> minimumEducation;
	private List<Language> languages;
}
