package org.etiya.repositories.abstracts;

import org.etiya.core.repositories.GenericRepository;
import org.etiya.entities.concretes.Book;

import java.util.List;

public interface BookRepository extends GenericRepository<Book> {
    Book getByBookName(String name);
}
