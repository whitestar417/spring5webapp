package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dh on 4/12/21
 */
public interface AuthorRepository extends CrudRepository<Author, Long>
{
}
