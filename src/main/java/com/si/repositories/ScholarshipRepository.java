package com.si.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.si.models.Scholarship;

@Repository
public interface ScholarshipRepository extends CrudRepository<Scholarship, String>{

	/*
	 * CrudRepository has its own naming convention.
	 * If you want to retrieve everything, use findAll();
	 * If you want to retrieve by particular attribute, use findBy[Attribute Name]()
	 */
	public List<Scholarship> findAll();
	public List<Scholarship> findByScholarshipID(String scholarshipID);
}
