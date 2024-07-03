package com.literAlura.service;

import com.literAlura.dto.BookDTO;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class GutendexService {
    private final RestTemplate restTemplate;

    public GutendexService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public BookDTO searchBookByTitle(String title) {
        String url = "https://gutendex.com/books?search=" + title;
        ResponseEntity<BookDTO> response = restTemplate.getForEntity(url, BookDTO.class);
        return response.getBody();
    }
}
