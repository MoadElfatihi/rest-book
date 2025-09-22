package org.bookstore.starting.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.bookstore.starting.model.Book;
import org.bookstore.starting.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class BookService implements IBookService {

    @Inject
    BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public Long countAllBook() {
        return bookRepository.count();
    }
}
