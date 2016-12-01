package se.pjab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import se.pjab.model.TypeText;
import se.pjab.service.TypeTextService;

@RestController
public class TypeTextController {

	private TypeTextService typeTextService;

	@Autowired
	public TypeTextController(TypeTextService typeTextService) {
		this.typeTextService = typeTextService;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public TypeText getTypeText(@PathVariable("id") Long id) {
		return typeTextService.getTypeText(id);
	}

}
