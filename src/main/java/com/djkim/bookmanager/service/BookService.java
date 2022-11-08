package com.djkim.bookmanager.service;

import com.djkim.bookmanager.model.dto.BookDto;
import com.djkim.bookmanager.model.entity.Book;
import com.djkim.bookmanager.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository repository;

    public Book create(BookDto dto) {
        return repository.save(new Book(dto));
    }

    public List<Book> findAll() {
        return repository.findAll();
    }
}
