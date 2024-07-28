package com.si.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.si.models.Eligibility;

public interface EligibilityRepository extends CrudRepository<Eligibility, String>{
	
	public List<Eligibility> findAll();
	public List<Eligibility> findByEligibilityID(String eligibilityID);

}
