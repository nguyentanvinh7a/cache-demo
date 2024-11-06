package com.example.ebookcachedemo.controller;

import com.example.ebookcachedemo.model.Book;
import com.example.ebookcachedemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/best-selling")
    public List<Book> getBestSellingBooks() {
        return bookService.getBestSellingBooks();
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }
}
