package org.bookstore.starting.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.bookstore.starting.model.Book;
import org.bookstore.starting.service.IBookService;
import org.jboss.logging.Logger;


import java.util.List;
import java.util.Optional;

@Path("/api/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookController {

    @Inject
    IBookService bookService;

    @Inject
    Logger logger;

    @GET
    public List<Book> getAllBook() {
        logger.info("getAllBook is called...");
        return bookService.findAll();
    }

    @GET
    @Path("{id}")
    public Optional<Book> getBookById(@PathParam("id") Long id) {
        return bookService.findById(id);
    }

    @GET
    @Path("/count")
    @Produces(MediaType.TEXT_PLAIN)
    public Long countAllBook() {
        logger.info("getAllBook is called...");
        return bookService.countAllBook();
    }
}
