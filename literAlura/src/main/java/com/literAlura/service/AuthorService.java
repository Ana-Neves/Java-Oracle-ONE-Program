package com.literAlura.service;

import com.literAlura.model.Author;
import com.literAlura.model.Book;
import com.literAlura.repository.AuthorRepository;
import com.literAlura.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }
}
