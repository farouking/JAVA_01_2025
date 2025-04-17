package com.codingdojo.books.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable; // <-- missing import

import com.codingdojo.books.models.Book;
import com.codingdojo.books.services.BookService;

@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/")
    public String home() {
        return "redirect:/books";
    }

    @GetMapping("/books/{bookId}")
    public String showBook(@PathVariable("bookId") Long bookId, Model model) {
        model.addAttribute("book", bookService.findBook(bookId));
        return "show.jsp";
    }

    @GetMapping("/books")
    public String listBooks(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "books/index.jsp";
    }
}
