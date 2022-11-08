package com.djkim.bookmanager.controller;

import com.djkim.bookmanager.model.dto.BookDto;
import com.djkim.bookmanager.model.entity.Book;
import com.djkim.bookmanager.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService service;

    @PostMapping("")
    public Book create(@RequestBody BookDto bodyDto){
        System.out.println("create executed" + bodyDto.toString());
        return service.create(bodyDto);
    }
}
