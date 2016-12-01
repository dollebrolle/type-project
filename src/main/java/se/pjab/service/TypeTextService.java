package se.pjab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.pjab.model.TypeText;
import se.pjab.repository.TypeTextRepository;

@Service
public class TypeTextService {

	@Autowired
	TypeTextRepository typeTextRepository;

	public TypeText getTypeText(Long id) {
		return this.typeTextRepository.getTypeText(id);
	}

}
