package com.literAlura.controller;

import com.literAlura.dto.BookDTO;
import com.literAlura.model.Book;
import com.literAlura.service.BookService;
import com.literAlura.service.GutendexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private GutendexService gutendexService;

    @PostMapping("/search")
    public Book searchAndSaveBook(@RequestParam String title) {
        BookDTO bookDTO = gutendexService.searchBookByTitle(title);
        Book book = new Book();
        book.setTitle(bookDTO.getTitle());
        book.setAuthor(bookDTO.getAuthor());
        book.setLanguage(bookDTO.getLanguage());
        book.setDownloads(bookDTO.getDownloads());
        return bookService.saveBook(book);
    }
}
