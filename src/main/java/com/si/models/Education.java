package com.si.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="education")
public class Education {
	@Id
	private String educationID;
	private String educationLevel;
	private String educationType;
	private double gpa;
}
