package com.djkim.bookmanager.repository;

import com.djkim.bookmanager.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
