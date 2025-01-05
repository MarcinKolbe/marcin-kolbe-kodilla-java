package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Book book1 = new Book("Problem trzech ciał", "Cixin Liu", LocalDate.of(2008, 1,1));
        Book book2 = new Book("Podróż do wnętrza ziemi", "Juliusz Verne", LocalDate.of(1864,1,1));
        Book book3 = new Book("Opiekunowie", "Dean Koontz", LocalDate.of(1987,1,1));
        Book book4 = new Book("Drapieżcy", "Graham Masterton", LocalDate.of(1992,1,1));
        Library library = new Library("books");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        //When
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("books1");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("books2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        deepClonedLibrary.getBooks().remove(book1);

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        int result = library.getBooks().size();
        int resultCloned = clonedLibrary.getBooks().size();
        int resultDeepClone = deepClonedLibrary.getBooks().size();

        //Then
        Assertions.assertEquals(4, result);
        Assertions.assertEquals(4, resultCloned);
        Assertions.assertEquals(3, resultDeepClone);
    }
}
