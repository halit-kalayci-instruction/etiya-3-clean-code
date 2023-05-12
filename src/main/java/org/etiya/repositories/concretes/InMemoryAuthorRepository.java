package org.etiya.repositories.concretes;

import org.etiya.entities.concretes.Author;
import org.etiya.entities.concretes.Book;
import org.etiya.repositories.abstracts.AuthorRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryAuthorRepository implements AuthorRepository {
    // Generic
    private List<Author> authors=new ArrayList<>();

    @Override
    public void add(Author entity) {
        authors.add(entity);
    }

    @Override
    public void update(Author entity) {
        Author authorToUpdate = authors
                .stream()
                .filter(author-> author.getId() == entity.getId())
                .findFirst()
                .orElse(null);
        authorToUpdate.setName(entity.getName());
        authorToUpdate.setAge(entity.getAge());
        authorToUpdate.setSurname(entity.getSurname());
        authorToUpdate.setNationalityId(entity.getNationalityId());
        authorToUpdate.setBooks(entity.getBooks());
    }

    @Override
    public void delete(int id) {
        Author authorToDelete = authors
                .stream()
                .filter(author -> author.getId() == id).findFirst().orElse(null);
        authors.remove(authorToDelete);
    }

    @Override
    public Author getById(int id) {
        return authors.stream()
                .filter(author -> author.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Author> getAll() {
        return authors;
    }

    @Override
    public Author getAuthorByNationalityIdentity(String nationalityIdentity) {
        return authors.stream()
                .filter(author->author.getNationalityId() == nationalityIdentity)
                .findFirst()
                .orElse(null);
    }
}
