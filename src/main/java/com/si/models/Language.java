package com.si.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Language {

	private String languageID;
	private String language;
	private String proficiencyLevel;
}
