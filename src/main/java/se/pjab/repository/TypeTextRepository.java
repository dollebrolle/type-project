package se.pjab.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import se.pjab.model.TypeText;

@Repository
public interface TypeTextRepository extends CrudRepository<TypeText, Long>{

	void addTypeText(TypeText typeText);

	void updateTypeText(TypeText typeText);

	void deleteTypeText(Long id);

	TypeText getTypeText(Long id);

}
