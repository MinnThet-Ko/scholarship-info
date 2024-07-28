package com.si.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.si.models.Language;

public interface LanguageRepository extends CrudRepository<Language, String>{
	
	public List<Language> findAll();
	public List<Language> findByLanguageID(String languageID);
	

}
