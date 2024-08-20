package com.example.Controller;

import org.springframework.web.bind.annotation.*;

import com.example.Entities.Book;

import java.util.*;

@RestController
@RequestMapping("/books")
public class BookController {

    private HashMap<Integer, Book> bookMap = new HashMap<>();
    int i = 1;

    @GetMapping
    public List<Book> getAllBooks() {
        return new ArrayList<>(bookMap.values());
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        book.setId(i++);
        bookMap.put(book.getId(), book);
        return book;
    }


    // Search based on endpoints like title and author
    @GetMapping("/search")
    public List<Book> searchBooks(@RequestParam String title,
            @RequestParam String author) {
        return bookMap.values().stream()
                .filter(book -> (title == null || book.getTitle().contains(title)) &&
                        (author == null || book.getAuthor().contains(author)))
                .toList();
    }

    // PathVariable
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book updatedBook) {
        if (bookMap.containsKey(id)) {
            Book existingBook = bookMap.get(id);

            existingBook.setTitle(updatedBook.getTitle());
            existingBook.setAuthor(updatedBook.getAuthor());
            existingBook.setPrice(updatedBook.getPrice());
            existingBook.setIsbn(updatedBook.getIsbn());

            bookMap.put(id, existingBook);
        }
        return updatedBook;
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable int id) {
        bookMap.remove(id);
    }
}
