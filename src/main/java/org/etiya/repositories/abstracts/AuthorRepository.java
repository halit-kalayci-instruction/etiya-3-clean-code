package org.etiya.repositories.abstracts;

import org.etiya.core.repositories.GenericRepository;
import org.etiya.entities.concretes.Author;
import org.etiya.entities.concretes.Book;

import java.util.List;
// DRY => Dont Repeat Yourself
// Generic
public interface AuthorRepository extends GenericRepository<Author> {
    Author getAuthorByNationalityIdentity(String nationalityIdentity);
}
