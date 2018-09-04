package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/controller")
public class PersonDetailsController {

	@Autowired
	private PersonDetailsDAO daoRef;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String viewPersonDetails(ModelMap map) {
		
		map.addAttribute("persons",daoRef.findAll());
		return "personsList"; //returning a jsp file to view person details
	}
	
}
