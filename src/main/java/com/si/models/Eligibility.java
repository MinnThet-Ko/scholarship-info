package com.si.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "eligibility")
public class Eligibility {
	@Id
	private String eligibilityID;
	private int upperAgeLimit;
	private int lowerAgeLimit;
	
	@OneToOne(mappedBy = "eligibility")
	private Scholarship scholarship;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE},fetch = FetchType.LAZY)
	@JoinTable(name = "eligibility_education", joinColumns = @JoinColumn(name = "eligibilityid"), inverseJoinColumns = @JoinColumn(name = "educationid"))
	private List<Education> minimumEducation;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE},fetch = FetchType.LAZY)
	@JoinTable(name = "eligibility_language", joinColumns = @JoinColumn(name = "eligibilityid"), inverseJoinColumns = @JoinColumn(name = "languageid"))
	private List<Language> languages;
}
