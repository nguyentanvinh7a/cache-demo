package com.example.ebookcachedemo.repository;

import com.example.ebookcachedemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findTop3ByOrderByIdDesc();
}
