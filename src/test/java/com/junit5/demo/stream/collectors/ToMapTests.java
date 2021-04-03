package com.junit5.demo.stream.collectors;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ToMapTests {

    @Test
    @DisplayName("listToMapUsingToMap")
    void listToMapUsingToMap() {
        List<String> namesList = List.of("Sasi", "Kiran", "Raja");
        var namesMap = namesList.stream()
                .collect(Collectors.toMap(namesList::indexOf, Function.identity()));
        assertEquals(3, namesMap.size());
        assertEquals("Sasi", namesMap.get(0));
        assertEquals("Kiran", namesMap.get(1));
        assertEquals("Raja", namesMap.get(2));
    }

    @Test
    @DisplayName("listOfBooksToMapOfBooks")
    void listOfBooksToMapOfBooks() {
        List<Book> books = Arrays.asList(new Book(1, "book1"),
                                         new Book(2, "book2"));
        var booksMap = books.stream()
                            //.map(b -> "free" + b.getName())
                            .collect(Collectors.toMap(Book::getId,
                                                      v -> "free "+v.getName()));
        assertEquals(2, booksMap.size());
        assertEquals("free book1", booksMap.get(1));
        assertEquals("free book2", booksMap.get(2));

    }

}
