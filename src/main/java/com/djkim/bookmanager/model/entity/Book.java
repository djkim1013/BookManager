package com.djkim.bookmanager.model.entity;

import com.djkim.bookmanager.model.dto.BookDto;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "TB_BOOK")
@NoArgsConstructor
public class Book {
    @Id
    @Column(name = "BOOK_ID")
    private Long bookId;

    @Column(name = "BOOK_NAME")
    private String bookName;

    @Column(name = "PUBLISHER_Name")
    private String publisherName;

    public Book(BookDto bookDto){
        this.bookId = bookDto.getBookId();
        this.bookName = bookDto.getBookName();
        this.publisherName = bookDto.getPublisherName();
    }
}