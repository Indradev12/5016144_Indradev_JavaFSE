package com.example.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Entities.Book;

import java.util.*;

@RestController
@RequestMapping("/books")
public class BookController {

    private HashMap<Integer, Book> bookMap = new HashMap<>();
    int i = 1;

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        book.setId(i++);
        bookMap.put(book.getId(), book);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerCustomer(@RequestParam int id,
            @RequestParam String title,
            @RequestParam String author,
            @RequestParam double price,
            @RequestParam String isbn) {
        
        Book book = new Book();
        book.setId(i++);
        book.setTitle(title);
        book.setAuthor(author);
        book.setPrice(price);
        book.setIsbn(isbn);

        bookMap.put(book.getId(), book);

        return new ResponseEntity<>("Book registered successfully!", HttpStatus.CREATED);
    }
}
