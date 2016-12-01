package se.pjab.repository;

import se.pjab.model.TypeText;

public interface TypeTextRepository {

	void add(TypeText typeText);

	void update(TypeText typeText);

	boolean delete(Long id);

	TypeText get(Long id);

}
