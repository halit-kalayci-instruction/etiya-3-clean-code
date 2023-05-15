package org.etiya.entities.concretes;

// naming conventions

// Classlar => PascalCase
// Metotlar,Değişkenler => camelCase
// Sabitler (Constants) => UPPER_CASE MAX_VALUE
// Paketler => lowercase.package

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "books")
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @Column(name="name")
    String name;
    @Column(name="pageCount")
    int pageCount;
    @ManyToOne()
    @JoinColumn(name="author_id")
    Author author;
}

// public boolean checkBookWithName(String name);
// public boolean checkIfBookExistsWithSameName(String name);