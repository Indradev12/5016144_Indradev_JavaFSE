package com.example.Custom_Serial_Deserial;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonProperty;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO implements Serializable {
    @JsonProperty("bookId")
    private Long id;

    @JsonProperty("bookTitle")
    private String title;

    @JsonProperty("bookAuthor")
    private String author;

    @JsonProperty("bookPrice")
    private double price;

    
}
