package com.example.Controller;


import com.example.DTO.BookDTO;
import com.example.Entities.Book;
import com.example.Metrics.BookMetrics;
import com.example.dao.BookRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Optional;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ActiveProfiles("test")
public class BookControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private BookRepository bookRepository;

    @MockBean
    private BookMetrics bookMetrics;

    @BeforeEach
    public void setup() {
        System.out.println("Setup...");
    }

    @Test
    public void testCreateBook() throws Exception {
        BookDTO bookDTO = new BookDTO("Title", "Author", 19.99, "1234567890");
        String jsonContent = objectMapper.writeValueAsString(bookDTO);

        mockMvc.perform(MockMvcRequestBuilders.post("/books")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonContent))
                .andExpect(status().isCreated());
    }

    @SuppressWarnings("unused")
    @Test
    public void testGetBookById() throws Exception {
        Book book = new Book(2,"Title", "Author", 19.99, "1234567890");
        BookDTO bookDTO = new BookDTO(book.getTitle(), book.getAuthor(), book.getPrice(), book.getIsbn());

        Mockito.when(bookRepository.findById(2)).thenReturn(Optional.of(book));

        mockMvc.perform(MockMvcRequestBuilders.get("/books/{id}", 1L))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.title").value("Title"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.author").value("Author"));
    }

}