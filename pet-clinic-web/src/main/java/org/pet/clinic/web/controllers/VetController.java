package org.pet.clinic.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

	@RequestMapping({"/vets","vets/index","vets.html","vets/index.html"})
	public String listVets() {
		return "vets/index";
	}
}