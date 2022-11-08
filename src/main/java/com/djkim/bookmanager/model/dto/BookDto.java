package com.djkim.bookmanager.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class BookDto {
    @JsonProperty(value = "id")
    private Long bookId;

    @JsonProperty(value = "title")
    private String bookName;

    @JsonProperty(value = "publisher")
    private String publisherName;
}
