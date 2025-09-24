package org.bookstore.starting.repository;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.bookstore.starting.model.Book;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class BookRepository {

    @Inject
    BookRepository bookRepository;
    @Inject
    private BookRepository booRepository;

    public List<Book> findAll(){
        return bookRepository.findAll();
    }

}
