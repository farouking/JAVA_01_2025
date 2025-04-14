package com.codingdojo.booksapi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import com.codingdojo.booksapi.models.Book;
import com.codingdojo.booksapi.services.BookService;

@RestController
@RequestMapping("/api/books") // <-- Add a global route prefix
public class BooksApi {
    private final BookService bookService;

    public BooksApi(BookService bookService) {
        this.bookService = bookService;
    }

    // Get all books
    @GetMapping("")
    public List<Book> index() {
        return bookService.allBooks();
    }

    // Create a new book
    @PostMapping("")
    public Book create(
            @RequestParam("title") String title, 
            @RequestParam("description") String desc, 
            @RequestParam("language") String lang, 
            @RequestParam("pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        return bookService.createBook(book);
    }

    // Show one book by id
    @GetMapping("/{id}")
    public Book show(@PathVariable("id") Long id) {
        return bookService.findBook(id);
    }

    // Update a book
    @PutMapping("/{id}")
    public Book update(
            @PathVariable("id") Long id, 
            @RequestParam("title") String title, 
            @RequestParam("description") String desc, 
            @RequestParam("language") String lang, 
            @RequestParam("pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        book.setId(id);
        return bookService.updateBook(book);
    }

    // Delete a book
    @DeleteMapping("/{id}")
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
}
