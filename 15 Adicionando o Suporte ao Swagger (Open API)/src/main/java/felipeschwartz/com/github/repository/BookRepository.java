package felipeschwartz.com.github.repository;

import felipeschwartz.com.github.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}
