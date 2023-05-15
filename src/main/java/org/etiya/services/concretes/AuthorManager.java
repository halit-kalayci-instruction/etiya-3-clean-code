package org.etiya.services.concretes;

import org.etiya.entities.concretes.Author;
import org.etiya.repositories.abstracts.AuthorRepository;
import org.etiya.services.abstracts.AuthorService;
import org.etiya.services.dtos.requests.author.AddAuthorRequest;

import java.util.ArrayList;
import java.util.List;

public class AuthorManager implements AuthorService
{

    private AuthorRepository authorRepository;

    public AuthorManager(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    // 14.10

    @Override
    public void add(AddAuthorRequest request) {
        // Business Rules, CCC, Validation
        // İŞ KODLARI
        // aynı tckn sahibi iki author bulunamaz
        // Mapping
        // Manual Mapping => ModelMapper
        checkIfAuthorWithSameNationalityIdExists(request.getNationalityId());
        Author author = new
                Author(1,request.getName(), request.getSurname(), request.getAge(), request.getNationalityId(), new ArrayList<>());
        authorRepository.add(author);
        System.out.println("Author eklendi.");
    }

    @Override
    public List<Author> getAll() {
        return authorRepository.getAll();
    }

    @Override
    public Author getById(int id) {
        return authorRepository.getById(id);
    }

    @Override
    public int getBookCountByAuthorId(int id) {
        Author author = getById(id);
        if(author==null)
            return 0;
        return author.getBooks().size();
    }

    public void checkIfAuthorWithSameNationalityIdExists(String nationalityId) {
        if(authorRepository.getAuthorByNationalityIdentity(nationalityId) != null){
            throw new RuntimeException("Bu TCKN ile bir author zaten mevcut..");
        }
    }
}
//15.10
