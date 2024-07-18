package com.si.models;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Scholarship {
	private String scholarshipID;
	private String name;
	private String type;
	private String description;
	private int duration;
	private Date deadline;
	private Eligilibility eligilibility;
	
}
