package com.djkim.bookmanager.controller;

import com.djkim.bookmanager.model.dto.BookDto;
import com.djkim.bookmanager.model.entity.Book;
import com.djkim.bookmanager.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("")
    public List<Book> findAll(){
        System.out.println("find all executed");
        return service.findAll();
    }
}
