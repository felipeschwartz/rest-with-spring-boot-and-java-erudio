package felipeschwartz.com.github.repository;

import felipeschwartz.com.github.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}
