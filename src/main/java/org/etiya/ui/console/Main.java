package org.etiya.ui.console;

import org.etiya.entities.concretes.Author;
import org.etiya.entities.concretes.Book;
import org.etiya.repositories.concretes.InMemoryAuthorRepository;
import org.etiya.services.abstracts.AuthorService;
import org.etiya.services.concretes.AuthorManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // SOLID

        // Single Responsibility Principle => Metot ve class bir sorumluluk sahibi olmalıdır.
        // Open-Closed Principle => Kodların geliştirmeye açık değişime kapalı olması.
        // Liskov Substitution Principle => Miras aldığım classın yerine onun tüm özelliklerini sağlayabilecek bir alternatif olmalıyım.
        // Interface Segregation Principle =>
        // Dependency Inversion Principle => Bağımlılıklar ters yüklenmelidir.
        // ( Bağımlı olduğu bir classı (interface) farklı nesnelerini kabul etmelidir. )
        // TDD => Test Driven Development, Unit Test
        // Consistent Style


        // İsimlendirme
        // Mimariyi
        // DRY Principle



        // Exception Handling
        // Documentation
        // Yorum satırları
        // Classic N-Layer Arch
        // Circular Dependency
        // Core, Veri Erişim (DataAccess,Repositories, DAL), İş Katmanı (Services,Business), Entities (Models), UI Layers
        List<Book> books = new ArrayList<>();
        books.add(new Book(1,"Kitap 1", 100,null));

        Author author = new Author(1,"Halit",
                "Kalaycı",25,"12345678901", books);
        Author author1 = new Author(2,"Ozan Boran","Polat",25,
                "12345678902", books);

        AuthorService authorService = new AuthorManager(new InMemoryAuthorRepository());
        authorService.add(author);
        authorService.add(author1);
        //authorService.add(author);

        for(Author authorInDb: authorService.getAll()){
            System.out.println(authorInDb.getName());
        }

    }
}


