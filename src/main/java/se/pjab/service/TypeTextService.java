package se.pjab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.pjab.model.TypeText;
import se.pjab.repository.TypeTextRepository;

@Service
public class TypeTextService {

	TypeTextRepository typeTextRepository;

	@Autowired
	public TypeTextService(TypeTextRepository typeTextRepository) {
		this.typeTextRepository = typeTextRepository;
	}

	public TypeText getTypeText(Long id) {
		return typeTextRepository.findOne(id);
	}

}
