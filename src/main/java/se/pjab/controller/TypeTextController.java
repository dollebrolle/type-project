package se.pjab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import se.pjab.model.TypeText;
import se.pjab.service.TypeTextService;

@Controller
public class TypeTextController {
	
	@Autowired
	private TypeTextService typeTextService;
	
	@RequestMapping(value= "{/id}", method = RequestMethod.GET)
	public TypeText getTypeText(@PathVariable("id") Long id){
		return typeTextService.getTypeText(id);
	}
	

}
