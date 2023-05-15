package org.etiya.services.concretes;

import org.etiya.entities.concretes.Author;
import org.etiya.entities.concretes.Book;
import org.etiya.repositories.abstracts.AuthorRepository;
import org.etiya.repositories.abstracts.BookRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

class BookManagerTest {

    private BookManager bookManager;
    private AuthorManager authorManager;
    @Mock
    private AuthorRepository authorRepository;
    @Mock
    private BookRepository bookRepository;

    @BeforeEach
    void setUp() {
        authorRepository = Mockito.mock(AuthorRepository.class);
        authorManager = new AuthorManager(authorRepository);

        bookRepository = Mockito.mock(BookRepository.class);
        bookManager = new BookManager(bookRepository, authorManager);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
    }
    //15:10

    // Yorum satıları
    // summary
    @Test
    void addWithAuthorHasFiveBooksShouldThrowError() {
        Author author = new Author();
        author.setId(1);
        List<Book> books = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            books.add(new Book());
        }
        author.setBooks(books);
        Mockito.when(authorRepository.getById(Mockito.anyInt())).thenReturn(author);
        Book book = new Book();
        book.setAuthor(author);
        assertThrows(RuntimeException.class, () -> {
            bookManager.add(book);
        });
    }
}