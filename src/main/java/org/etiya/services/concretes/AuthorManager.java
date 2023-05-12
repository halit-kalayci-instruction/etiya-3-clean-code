package org.etiya.services.concretes;

import org.etiya.entities.concretes.Author;
import org.etiya.repositories.abstracts.AuthorRepository;
import org.etiya.services.abstracts.AuthorService;

import java.util.List;

public class AuthorManager implements AuthorService {

    private AuthorRepository authorRepository;

    public AuthorManager(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public void add(Author author) {
        // Business Rules, CCC, Validation
        // İŞ KODLARI
        // aynı tckn sahibi iki author bulunamaz3
        checkIfAuthorWithSameNationalityIdExists(author.getNationalityId());
        authorRepository.add(author);
        System.out.println("Author eklendi.");
    }

    @Override
    public List<Author> getAll() {
        return authorRepository.getAll();
    }

    @Override
    public Author getById(int id) {
        return null;
    }

    public void checkIfAuthorWithSameNationalityIdExists(String nationalityId) {
        if(authorRepository.getAuthorByNationalityIdentity(nationalityId) != null){
            System.out.println("Bu TCKN ile bir author zaten mevcut..");
            Thread.currentThread().stop();
        }
    }
}
//15.10
