package com.example.librarymigration.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Book {
    private Integer id;
    private String title;
    private Integer authorId;
    private Integer categoryId;
    private Integer year;
    private String language;
}
