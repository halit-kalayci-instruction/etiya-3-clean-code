package org.etiya.entities.concretes;

// naming conventions

// Classlar => PascalCase
// Metotlar,Değişkenler => camelCase
// Sabitler (Constants) => UPPER_CASE MAX_VALUE
// Paketler => lowercase.package

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book
{
    int id;
    String name;
    int pageCount;
    Author author;
}

// public boolean checkBookWithName(String name);
// public boolean checkIfBookExistsWithSameName(String name);