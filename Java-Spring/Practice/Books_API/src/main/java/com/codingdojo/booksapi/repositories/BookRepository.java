package com.codingdojo.booksapi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.booksapi.models.Book; // <-- Correct import

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByDescriptionContaining(String search);
}