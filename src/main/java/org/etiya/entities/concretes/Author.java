package org.etiya.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "authors")
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @Column(name="name")
    String name;
    @Column(name="surname")
    String surname;
    @Column(name="age")
    int age;
    @Column(name="nationalityId")
    String nationalityId;

    @OneToMany(mappedBy = "author")
    List<Book> books;
}

