package com.example.ebookcachedemo.service;

import com.example.ebookcachedemo.model.Book;
import com.example.ebookcachedemo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    @Cacheable(value = "bestSellingBooks")
    public List<Book> getBestSellingBooks() {
        simulateSlowService();
        return bookRepository.findTop3ByOrderByIdDesc();
    }

    @Override
    @CacheEvict(value = "bestSellingBooks", allEntries = true)
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    private void simulateSlowService() {
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
