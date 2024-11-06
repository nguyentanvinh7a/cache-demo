package com.example.ebookcachedemo.service;

import com.example.ebookcachedemo.model.Book;
import java.util.List;

public interface BookService {
    List<Book> getBestSellingBooks();
    Book addBook(Book book);
}
