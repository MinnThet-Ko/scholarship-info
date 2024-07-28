package com.si.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.si.models.Scholarship;
import com.si.services.ScholarshipService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private ScholarshipService scholarshipService;

	@GetMapping("home")
	public String displayHome(Model model) {
		List<Scholarship> scholarshipList = this.scholarshipService.getAllScholarships();
		if(scholarshipList.get(0).getEligibility() == null) {
			System.out.println("We weren't able to get the eligibility.");
		} else {
			System.out.println("We got it!");
		}
		model.addAttribute("scholarshipList", scholarshipList);
		model.addAttribute("scholarshipCount", scholarshipList.size());
		return "home";
	}
}
