package org.etiya.services.concretes;

import org.etiya.entities.concretes.Author;
import org.etiya.repositories.abstracts.AuthorRepository;
import org.etiya.services.dtos.requests.author.AddAuthorRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class AuthorManagerTest {

    private AuthorManager authorManager;

    @Mock
    private AuthorRepository authorRepository;

    @BeforeEach
    void setUp() {
        authorRepository = Mockito.mock(AuthorRepository.class);
        authorManager = new AuthorManager(authorRepository);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        // 3A Principle
        // Arrange
        // Test için gerekli bağımlılıkları yükleme.
        // Act
        // Testin senaryosunu çalıştırdığım alan..
        // Assert
        // Testin senaryosunun çalıştırıldığı sonuç ve (expected) beklenen sonucun karşılaştırılıp testin sonuçlandırılığı
        // alan

        // Mock => Taklit etmek
        // Veri erişim objeleri
        // repository ben sana getAll() dersem sen şu listeyi dön
        // ben sana getById(1) dersem sen şu objeyi dön/ ya da şu exceptionı fırlat / null dön
        Mockito.when(authorRepository.getAuthorByNationalityIdentity(Mockito.any())).thenReturn(null);
        AddAuthorRequest request = new AddAuthorRequest("Halit","Kalaycı",25,"123456789");
        authorManager.add(request);
        assert true;
    }

    @Test
    void addWithSameNationalityIdShouldThrowException(){
        // parametre olarak ne gelirse gelsin, bu davranışı sergile.
        Mockito.when(authorRepository.getAuthorByNationalityIdentity(Mockito.any())).thenReturn(new Author());
        AddAuthorRequest request = new AddAuthorRequest("Halit","Kalaycı",25,"564488945658974123");
        assertThrows(RuntimeException.class, () ->
        {
            authorManager.add(request);
        });
    }
}