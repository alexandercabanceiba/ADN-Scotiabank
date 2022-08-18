package com.scotiabank.api.dominio.book;

import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter

public class BookDto {
    long id;
    String title;
    String author;
}
