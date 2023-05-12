package org.etiya.services.concretes;

import static org.junit.jupiter.api.Assertions.*;

class AuthorManagerTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
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
        assert true;
    }

    void addWithSameNationalityIdShouldThrowException(){
        // mock
        assert true;
    }
}