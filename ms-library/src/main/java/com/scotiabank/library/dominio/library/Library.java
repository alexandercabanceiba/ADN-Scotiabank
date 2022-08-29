package com.scotiabank.library.dominio.library;

import com.scotiabank.library.dominio.book.Book;
import com.scotiabank.library.dominio.rating.Rating;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
@Builder
public class Library {
    List<Book> book;
    List<Rating> ratings;
}
