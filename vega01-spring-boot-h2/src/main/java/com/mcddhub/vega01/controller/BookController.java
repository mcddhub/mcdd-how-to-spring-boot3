package com.mcddhub.vega01.controller;

import com.mcddhub.vega01.model.Book;
import com.mcddhub.vega01.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

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

    @GetMapping("/{author}")
    public List<Book> findByAuthor(@PathVariable("author") String author) {
        List<Book> bookList = repository.findBooksByAuthor(author);
        if (CollectionUtils.isEmpty(bookList)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Entity with author `%s` not found".formatted(author));
        }

        return bookList;
    }
}
