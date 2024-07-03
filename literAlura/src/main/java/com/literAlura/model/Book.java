package com.literAlura.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String language;
    private int downloads;

    public void setTitle(Object title) {
    }

    public void setAuthor(Object author) {
    }

    public void setLanguage(Object language) {
    }

    public void setDownloads(Object downloads) {
    }
}
