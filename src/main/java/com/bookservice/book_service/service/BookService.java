package com.bookservice.book_service.service;

import com.bookservice.book_service.model.Book;
import com.bookservice.book_service.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;


    public Book createBook(Book book) {
        if (book.getStatus() == null || book.getStatus().isBlank()) {
            book.setStatus("disponível");
        }
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Optional<Book> updateBook(Long id, Book updatedBook) {
        return bookRepository.findById(id).map(book -> {
            book.setTitulo(updatedBook.getTitulo());
            book.setAutor(updatedBook.getAutor());
            book.setStatus(updatedBook.getStatus());
            return bookRepository.save(book);
        });
    }

    public Optional<Book> updateBookStatus(Long id, String status) {
        String novoStatus = status.toLowerCase();

        if (!novoStatus.equals("disponivel") && !novoStatus.equals("reservado")) {
            return Optional.empty();
        }

        return bookRepository.findById(id).map(book -> {
            book.setStatus(novoStatus);
            return bookRepository.save(book);
        });
    }
}
