package com.scotiabank.library.dominio.book;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class Book {
    long id;
    String title;
    String author;
}
