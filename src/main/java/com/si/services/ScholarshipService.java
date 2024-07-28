package com.si.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.models.Scholarship;
import com.si.repositories.ScholarshipRepository;

@Service
public class ScholarshipService {

	@Autowired
	private ScholarshipRepository scholarshipRepo;
	
	public List<Scholarship> getAllScholarships(){
		return this.scholarshipRepo.findAll();
	}
	
	public Scholarship getScholarshipByID(String scholarshipID) {
		return this.scholarshipRepo.findByScholarshipID(scholarshipID).get(0);
	}
}
