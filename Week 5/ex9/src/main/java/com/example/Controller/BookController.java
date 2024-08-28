package com.example.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.*;

import com.example.Entities.Book;
import com.example.Exception.BookNotFoundException;
import com.example.dao.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<EntityModel<Book>> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        List<EntityModel<Book>> bookResources = new ArrayList<>();

        for (Book book : books) {
            EntityModel<Book> bookResource = EntityModel.of(book);
            Link selfLink = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookController.class).getBookById(book.getId())).withSelfRel();
            bookResource.add(selfLink);
            bookResources.add(bookResource);
        }
        return bookResources;
    }

    @PostMapping
    public EntityModel<Book> createBook(@RequestBody Book book) {
        Book addedBook = bookRepository.save(book);
        EntityModel<Book> bookResource = EntityModel.of(addedBook);
        Link selfLink = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookController.class).getBookById(addedBook.getId())).withSelfRel();
        bookResource.add(selfLink);
        return bookResource;
    }

    @GetMapping("/{id}")
    public EntityModel<Book> getBookById(@PathVariable int id) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException("Book not found"));
        EntityModel<Book> bookResource = EntityModel.of(book);
        Link selfLink = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookController.class).getBookById(book.getId())).withSelfRel();
        bookResource.add(selfLink);
        return bookResource;
    }

    @PutMapping("/{id}")
    public EntityModel<Book> updateBook(@PathVariable int id, @RequestBody Book updatedBook) {
        Book existingBook = bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException("Book not found"));
        existingBook.setTitle(updatedBook.getTitle());
        existingBook.setAuthor(updatedBook.getAuthor());
        existingBook.setPrice(updatedBook.getPrice());
        existingBook.setIsbn(updatedBook.getIsbn());

        Book savedBook = bookRepository.save(existingBook);
        EntityModel<Book> bookResource = EntityModel.of(savedBook);
        Link selfLink = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookController.class).getBookById(savedBook.getId())).withSelfRel();
        bookResource.add(selfLink);
        return bookResource;
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable int id) {
        bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException("Book not found"));
        bookRepository.deleteById(id);
    }
}
