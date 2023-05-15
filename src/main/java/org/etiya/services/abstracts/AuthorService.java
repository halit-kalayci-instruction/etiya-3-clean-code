package org.etiya.services.abstracts;

import org.etiya.entities.concretes.Author;
import org.etiya.services.dtos.requests.author.AddAuthorRequest;

import java.util.List;

// DTO => Data Transfer Object
// Request-Response Pattern
public interface AuthorService {
    // Veri erişim katmanında işler (plain entity) saf veritabanı modellerinden geçerken
    // DTO, Request-Response Pattern, Result yapısı
    void add(AddAuthorRequest request);
    List<Author> getAll();
    Author getById(int id);
    int getBookCountByAuthorId(int id);
}
