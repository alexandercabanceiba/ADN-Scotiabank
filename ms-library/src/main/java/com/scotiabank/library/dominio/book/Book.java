package com.scotiabank.library.dominio.book;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public class Book {
    long id;
    String title;
    String author;
}
