package com.scotiabank.library.dominio.rating;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
@AllArgsConstructor
@Getter
@Builder
public class Rating {
    long id;
    long bookId;
    int stars;

}
