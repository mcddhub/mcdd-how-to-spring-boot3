package com.mcddhub.vega01.repository;

import com.mcddhub.vega01.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * BookRepository
 *
 * @version 1.0.0
 * @author: caobaoqi1029
 * @date: 2024/9/22 21:38
 */
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findBooksByAuthor(String author);
}
