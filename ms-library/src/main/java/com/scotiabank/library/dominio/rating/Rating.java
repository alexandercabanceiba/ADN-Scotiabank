package com.scotiabank.library.dominio.rating;

import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter

public class Rating {
    long id;
    long bookId;
    int stars;

}
