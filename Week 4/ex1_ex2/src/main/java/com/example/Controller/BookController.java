package com.example.Controller;

import org.springframework.web.bind.annotation.*;

import com.example.Entities.Book;

import java.util.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public void getAllBooks() {
        return;
    }

    @PostMapping
    public void createBook() {
        return;
    }

    @PutMapping("/{id}")
    public void updateBook() {
        return;
    }

    @DeleteMapping("/{id}")
    public void deleteBook() {
        return;
    }
}
