package org.etiya.services.abstracts;

import org.etiya.entities.concretes.Author;

import java.util.List;

public interface AuthorService {
    // Veri erişim katmanında işler (plain entity) saf veritabanı modellerinden geçerken
    // DTO, Request-Response Pattern, Result yapısı
    void add(Author author);
    List<Author> getAll();
    Author getById(int id);
}
