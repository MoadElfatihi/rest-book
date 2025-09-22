package org.bookstore.starting.repository;


import jakarta.enterprise.context.ApplicationScoped;
import org.bookstore.starting.model.Book;

import java.util.List;
import java.util.Optional;

@ApplicationScoped // @service : we have only one instance : does not hold state
public class BookRepository {

    private List<Book> books = List.of(new Book(1,"title 1","antonio",2022,"IT"),
            new Book(1,"title 2","antonio",2022,"IT"),
            new Book(1,"title 3","antonio",2022,"IT"));

    public List<Book> findAll(){
        return books;
    }

    public Optional<Book> findById(Long id){
       return books.stream().filter(book->id == book.id()).findFirst();
    }

    public long count(){
        return books.size();
    }
}
