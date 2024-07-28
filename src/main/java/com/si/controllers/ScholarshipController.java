package com.si.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.si.models.Scholarship;
import com.si.services.ScholarshipService;

@Controller
@RequestMapping("/detail")
public class ScholarshipController {
	
	@Autowired
	private ScholarshipService scholarshipService;

	@GetMapping
	public String displayScholarshipDetail(@RequestParam("scholarshipid") String scholarshipID, Model model) {
		Scholarship resultScholarship = this.scholarshipService.getScholarshipByID(scholarshipID);
		model.addAttribute("scholarship", resultScholarship);
		return "scholarshipDetail";
	}
}
