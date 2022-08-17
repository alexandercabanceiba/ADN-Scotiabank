package com.scotiabank.api.dominio.rating;

import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter

public class RatingDto {
    long id;
    long bookId;
    int stars;

}
