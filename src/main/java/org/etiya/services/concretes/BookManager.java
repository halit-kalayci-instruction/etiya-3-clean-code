package org.etiya.services.concretes;

import org.etiya.entities.concretes.Author;
import org.etiya.entities.concretes.Book;
import org.etiya.repositories.abstracts.AuthorRepository;
import org.etiya.repositories.abstracts.BookRepository;
import org.etiya.services.abstracts.AuthorService;
import org.etiya.services.abstracts.BookService;

public class BookManager implements BookService {
    private BookRepository bookRepository;
    private AuthorService authorService;

    public BookManager(BookRepository bookRepository,AuthorService authorService) {
        this.bookRepository = bookRepository;
        this.authorService = authorService;
    }

    @Override
    public void add(Book book) {
        // bir yazarın 5'den fazla kitabı bulunmamlıdır.
        // authorId
        authorMustHaveLessThanFiveBooks(book.getAuthor().getId());
        bookRepository.add(book);
        System.out.println("Kitap eklendi..");
    }



    public void authorMustHaveLessThanFiveBooks(int authorId){
        // veritabanına gidip id ile author'ı bulmak ve kitap sayısını almak.
        int bookCount = authorService.getBookCountByAuthorId(authorId);
        if(bookCount > 5){
            System.out.println("Bir yazar 5'den fazla kitaba sahip olamaz.");
            Thread.currentThread().stop();
        }
    }
}
