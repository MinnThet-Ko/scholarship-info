package com.si.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.si.models.Education;

public interface EducationRepository extends CrudRepository<Education, String>{

	public List<Education> findAll();
	public List<Education> findByEducationID(String educationID);
}
