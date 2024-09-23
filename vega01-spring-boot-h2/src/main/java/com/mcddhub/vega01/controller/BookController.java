package com.mcddhub.vega01.controller;

import com.mcddhub.vega01.model.Book;
import com.mcddhub.vega01.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BookController
 *
 * @version 1.0.0
 * @author: caobaoqi1029
 * @date: 2024/9/22 22:08
 */
@RequestMapping("/api/v1/books")
@RestController
@RequiredArgsConstructor
public class BookController {
    private final BookRepository repository;

    @GetMapping
    public Iterable<Book> getBooks() {
        return repository.findAll();
    }
}
