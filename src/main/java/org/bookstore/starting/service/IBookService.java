package org.bookstore.starting.service;

import org.bookstore.starting.model.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {

    List<Book> findAll();
    Optional<Book> findById(Long id);
    Long countAllBook();
}
